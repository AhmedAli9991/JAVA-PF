import java.util.Random;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		String a1 = "__";
		String a2 = "__";
		String a3 = "__";
		String b1 = "__";
		String b2 = "__";
		String b3 = "__";
		String c1 = "__";
		String c2 = "__";
		String c3 = "__";
		System.out.println(a1+" "+a2+" "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+" "+c2+" "+c3);
		
		for(int i=1;i<=9;i++) {
			if(i%2!=0) {
			int x=0;

		int choice = input.nextInt();
		switch (choice) {
		case 1:
			a1="X";	
			break;
		case 2:
			a2="X";		
			break;
		case 3:
			a3="X";		
			break;
		case 4:
			b1="X";		
			break;
		case 5:
			b2="X";		
			break;
		case 6:
			b3="X";
			break;
		case 7:
			c1="X";
			break;
		case 8:
			c2="X";
			break;
		default:
			c3="X";}
			
				}
		else {
		int choice = input.nextInt();
					
		switch (choice) {
		case 1:
			a1="O";

			break;
		case 2:
			a2="O";		
			break;
		case 3:
			a3="O";
			break;
		case 4:
			b1="O";
			break;
		case 5:
			b2="O";
			break;
		case 6:
			b3="O";
			break;
		case 7:
			c1="O";
			break;
		case 8:
			c2="O";
			break;
		default:
			c3="O";
		}
	
		
		}
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+" "+c2+" "+c3);

		}
	}

}
	
