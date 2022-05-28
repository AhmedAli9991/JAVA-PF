import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Enter_CNIC_ISBN {
	
	private String[]Cnic_Isbn=new String[13];
	private String[]temp;
	
	public Enter_CNIC_ISBN (String num){
		try {
			for(int i=0;i<num.length();i++){
				Cnic_Isbn[i]=Character.toString(num.charAt(i));
			}
			storepre();
			addnew(num);
		
		}catch(IndexOutOfBoundsException e) {System.out.println("Too long");}
	}
	public void storepre() {
		File file=new File("CNIC and ISBN.txt");
		try{int i=0;
			Scanner in0 = new Scanner(file);
			while(in0.hasNextLine()) {
				String test=in0.nextLine();
				i++;
			}
			temp=new String[i+1];
			in0.close();
			Scanner in1 = new Scanner(file);
			for(int j=0;j<i;j++) {
				String a=in1.nextLine();
				temp[j]=a;
			}
			in1.close();
		}catch(FileNotFoundException e) {
			temp=new String[1];
		}
	}
	public void addnew(String n) {
		temp[temp.length-1]=n;
		File file=new File("CNIC and ISBN.txt");
		try {
			PrintWriter out = new PrintWriter(file);
			for(int i=0;i<temp.length;i++) {
				out.println(temp[i]);
			}
			out.close();
		} catch (IOException e) {}
		
	}
}
