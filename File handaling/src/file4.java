import java.io.File;

public class file4 {

	public static void main(String[] args) {
		File file = new File("new.txt");
		file.renameTo(new File("A.txt"));
		file.renameTo(new File("A.txt"));
		System.out.println(file.getName());
	
	}
}
