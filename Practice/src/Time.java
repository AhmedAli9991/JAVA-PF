import java.util.Scanner;

public class Time {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter years: ");
		int time = input.nextInt();
		int time1 = time*365*24*60*60;
		System.out.println("time in seconds "+time1);
		
	}

}
