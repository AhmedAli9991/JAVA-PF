import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class View {
	private String[]temp;
	public View() {
		File file=new File("CNIC and ISBN.txt");
		try{int i=0;
			Scanner in0 = new Scanner(file);
			while(in0.hasNextLine()) {
				String test=in0.nextLine();
				i++;
			}
			temp=new String[i];
			in0.close();
			Scanner in1 = new Scanner(file);
			for(int j=0;j<i;j++) {
				String a=in1.nextLine();
				temp[j]=a;
			}
			in1.close();
			for(String a:temp) {
				System.out.println(a);
			}
		}catch(FileNotFoundException e) {System.out.println("NO Data entered");}

		
	}
}
