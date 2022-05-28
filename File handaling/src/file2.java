import java.io.*;

public class file2 {

	public static void main(String[] args) {
		File file = new File("abc.txt"); 
		System.out.println(file.length());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		System.out.println(file.isDirectory());
		System.out.println(file.lastModified());
		System.out.println(file.getName());
		System.out.println(file.getAbsoluteFile());				
	}
}
