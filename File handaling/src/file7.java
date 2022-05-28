import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class file7 {

	public static void main(String[] args) {
		File file = new File("binary1.dat");
		try {
			FileOutputStream fs = new FileOutputStream(file);
			DataOutputStream out = new DataOutputStream(fs);
			out.writeInt(2323);
			out.writeUTF("hhhhhgghg");
			out.writeDouble(2323.232);
			out.writeChar('s');
			
			
		} catch (FileNotFoundException e) {} catch (IOException e) {}
		
			try {
				FileInputStream is=new FileInputStream(file);
				DataInputStream in = new DataInputStream(is);
				System.out.println(in.readInt());
				System.out.println(in.readUTF());
				System.out.println(in.readDouble());
				System.out.println(in.readChar());
				
			} catch (FileNotFoundException e) {} catch (IOException e) {}
			
	
	}

}
