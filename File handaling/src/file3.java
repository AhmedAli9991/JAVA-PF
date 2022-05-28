import java.io.File;

public class file3 {

	public static void main(String[] args) {
		File file = new File("abc.txt");
		File file2 = new File("new.txt");
		if(file.exists()&&!file2.exists())
			file.renameTo(file2);
			file.renameTo(file2);
		System.out.println(file.getName());
	}
}
