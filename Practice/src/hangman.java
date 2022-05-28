
import java.util.Scanner;
public class hangman {
public static void print(char[] guess) {
	for(char i:guess) {
		System.out.print(i);
	}
	System.out.println("");
	
}
public static void hangmanpic(int l) {
	if( l==0) {
		System.out.println("	 ------");
		System.out.println(" 	 	  |");
		System.out.println(" 		  |");
		System.out.println(" 		  |");
		System.out.println(" 		  |");
	}
	if( l==1) {
		System.out.println("	 ------");
		System.out.println(" 	 ( )  |");
		System.out.println(" 		  |");
		System.out.println(" 		  |");
		System.out.println(" 		  |");
	}
	if( l==2) {
		System.out.println("	 ------");
		System.out.println(" 	( )	  |");
		System.out.println(" 	 |	  |");
		System.out.println(" 	 |	  |");
		System.out.println(" 		  |");
	}
	if( l==3) {
		System.out.println("	 ------");
		System.out.println(" 	( )	  |");
		System.out.println(" 	 |__   |");
		System.out.println(" 	 |	  |");
		System.out.println(" 		  |");
	}
	if( l==4) {
		System.out.println("	 ------");
		System.out.println(" 	( )	  |");
		System.out.println("       __|__   |");
		System.out.println(" 	 |	  |");
		System.out.println(" 		  |");
	}
	if( l==5) {
		System.out.println("	 ------");
		System.out.println(" 	( )	  |");
		System.out.println("       __|__   |");
		System.out.println(" 	 |	  |");
		System.out.println(" 	|	   |");
	}
	if( l==6) {
		System.out.println("	 ------");
		System.out.println(" 	( )	  |");
		System.out.println("       __|__  |");
		System.out.println(" 	 |	  |");
		System.out.println("  	| |");
	}
	
}
	public static void main(String[] args) {
		Scanner Input =new Scanner(System.in);
		System.out.print("player 1 enter the word you want player2 to guess : ");
		String key=Input.next();
		int length=key.length();
		char[] guess= new char[length];
		for(int i=0;i<length;i++) {
			guess[i]='-';}
		int life=0;
		int charcters=0;
		System.out.println("Total number of charcters are :"+length);
		System.out.println("number of lifes left:"+(6-life));
		print(guess);
		while(charcters<length) {
			int right=0;
			System.out.println("enter your guess: ");
			char check=Input.next().charAt(0);
			for(int i=0;i<length;i++) {
			
			if(check==key.charAt(i)&&check!=guess[i]) {
				guess[i]=key.charAt(i);
				charcters+=1;
				right=1;
				}
			else if(check==key.charAt(i)) {
				System.out.println("you have already guessed it "+check);
				right=1;
				}
			}
			if(right==0) {
				life+=1;	
			}
			
			if(life>=6) {
				System.out.println(" You ran out of lifes Player 1 wins");
				hangmanpic(life);
				break;
			}
			System.out.println("number of lifes left:"+(6-life));
			print(guess);
			hangmanpic(life);
		}
		if(charcters==length)
		System.out.println("PLAYER 2 WINS");
	}
}
