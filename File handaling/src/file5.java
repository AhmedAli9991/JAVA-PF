import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class file5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		String w = input.nextLine();
		String q = input.nextLine();
		String f = input.nextLine();
		File file = new File("file.txt");
		try{
			PrintWriter out = new PrintWriter(file);
			out.println(s);
			out.println(w);
			out.println(q);
			out.println(f);
			out.close();
		}catch(IOException ex) {
			
		}
		try{
			Scanner in = new Scanner(file);
			String n=in.nextLine();
			String m=in.nextLine();
			String o=in.nextLine();
			String p=in.nextLine();
			in.close();
			System.out.println(n+" "+m+" "+o+" "+p);
		}catch(FileNotFoundException e) {
		}
	}

}
