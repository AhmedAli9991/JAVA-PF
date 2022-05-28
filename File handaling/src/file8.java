import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class file8 {

	public static void main(String[] args) {
		try {
			DataOutputStream out = new DataOutputStream(new FileOutputStream("abc.dat"));
			Scanner input = new Scanner(System.in);
			out.writeInt(input.nextInt());
			out.writeInt(input.nextInt());
			out.writeInt(input.nextInt());
			out.writeInt(input.nextInt());
			out.writeInt(input.nextInt());
		} catch (FileNotFoundException e) {} catch (IOException e) {}
		try {
			DataInputStream out = new DataInputStream(new FileInputStream("abc.dat"));
			while(true) {
				System.out.println(out.readInt());
			}
		}catch(EOFException e) {System.out.println("end");}catch (FileNotFoundException e) {} catch (IOException e) {}
	}

}
