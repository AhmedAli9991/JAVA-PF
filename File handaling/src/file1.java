import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class file1 {

	public static void main(String[] args) throws IOException {
		File file = new File("abc.txt");
		if(file.exists()) {
			System.out.println("File already exists");
			System.exit(1);
		}
		PrintWriter out = new PrintWriter(file);
		out.print("Haroon");
		out.println("25");
		out.print("Ahmed");
		out.println("35");
		out.close();
	}
}
