import java.util.InputMismatchException;
import java.util.Scanner;

public class hhh {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		try {
			int x = in.nextInt();
			System.out.println(x);
			int y = 5/x;
		}catch(InputMismatchException e) {
			System.out.println("NO");
		}catch(ArithmeticException e) {
			System.out.println("NOOO");	
		}
	}

}
