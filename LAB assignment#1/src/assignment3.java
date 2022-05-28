import java.util.Scanner;

public class assignment3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a word : ");
		String Str1 = input.nextLine().toLowerCase();
		char[]attempt= new char[Str1.length()];
		for(int i=0;i<Str1.length();i++) {
			attempt[i] ='X' ;
		}
		char [] word = new char[Str1.length()];
		for(int i=0;i<Str1.length();i++) {
			word[i] = Str1.charAt(i);
		}
		int tries = 0;
		while(tries<6) {	
			System.out.print("Enter your guess : ");
			String alphabet = input.nextLine().toLowerCase();
			char alpha = alphabet.charAt(0);
			boolean check = false;
			for(int i=0;i<Str1.length();i++) {
				if(alpha==word[i]) { 
					attempt[i]=alpha;
					check=true;
				}
			}
			if(!check) { 
				System.out.println(alpha+" is worng");
				tries+=1;
				}
			if(tries==1)
				System.out.println("O");
			else if(tries==2) {
				System.out.println("O");
				System.out.println("|");
			}
			else if(tries==3) {
				System.out.println(" O ");
				System.out.println("/|");
			}
			else if(tries==4) {
				System.out.println(" O ");
				System.out.println("/|\\");
			}
			else if(tries==5) {
				System.out.println(" O ");
				System.out.println("/|\\");
				System.out.println("/ ");
			}
			else if(tries==6) {
				System.out.println(" O ");
				System.out.println("/|\\");
				System.out.println("/ \\");
			}
			for(char c:attempt) {
				System.out.print(c+" ");
			}
			int win = 0;
			System.out.println();
			for(int i=0;i<Str1.length();i++) {
				if(word[i]==attempt[i])
					win++;
			}
			if(win==Str1.length()) {
				System.out.println("You have won");
				tries=0;
				break;
				}
		}
		if(tries==6)
			System.out.println("Game Over");
	}
}
