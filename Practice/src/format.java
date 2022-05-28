import java.util.Scanner;
public class format {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.printf("'%-10.4f'%n", 5000.544554);
		System.out.printf("'%.1S'%n", "hello");
		System.out.printf("%-5c"+"%5c%n",'*','*');
		System.out.printf("%2c"+"%7c%n",'*','*');
		System.out.printf("%3c"+"%5c%n",'*','*');
		System.out.printf("%4c"+"%3c%n",'*','*');
		System.out.printf("%5c"+"%1c%n",'*','*');
		
	}

}
