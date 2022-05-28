import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class file9 {

	public static void main(String[] args) {
		File file = new File("binn.dat");
		Scanner input = new Scanner(System.in);
		try {
			DataOutputStream out = new DataOutputStream(new FileOutputStream(file));
			int i=0;
			while(true) {
				if(i==4) {
					break;}
				i++;
				out.writeUTF(input.nextLine());
			}
		}catch(IOException e) {}
		try {
			DataInputStream in = new DataInputStream(new FileInputStream(file));
			while(true) {
				System.out.println(in.readUTF());
			}
		}catch(EOFException ex) {}catch(FileNotFoundException e){}catch(IOException e) {}
	}

}
