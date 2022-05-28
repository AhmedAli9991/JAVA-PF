import java.util.Scanner;

public class jj {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter age: ");
		int age = input.nextInt();
		int price = age >= 16 ? 20:10;
		System.out.println("The price is: "+price);
	}

}
