import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class file6 {

	public static void main(String[] args) {
		File file = new File("file.txt");
		int len=5;
		String[]arr=new String [len];
		String[]arr2=new String [len];
		Scanner input = new Scanner(System.in);
		for(int i = 0; i<len;i++) {
			arr[i] =input.nextLine();
		}
		try{
			PrintWriter out = new PrintWriter(file);
			for(int j = 0; j<len;j++) {
				out.println(arr[j]);
			}
			out.close();
			
		}catch(IOException ex) {		
		}
		try{
			Scanner in0 = new Scanner(file);
			int count=0;
			while(in0.hasNextLine()) {
				String a = in0.nextLine();
				count++;
			}in0.close();
			int j=0;
			Scanner in = new Scanner(file);
			while(in.hasNextLine()) {
				arr2[j] =in.nextLine();
				j++;
			}
			in.close();
		}catch(FileNotFoundException e) {
		}
		for(String i:arr2) {
			System.out.print(i+" ");
		}

	}

}
