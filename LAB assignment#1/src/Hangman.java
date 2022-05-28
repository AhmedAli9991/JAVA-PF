//made by:Ahmed Ali(SP19-BCS-096)

import java.util.Scanner;

public class Hangman {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a word : ");
		String word = input.nextLine().toLowerCase();
		char[]user= new char[word.length()];
		for(int i=0;i<word.length();i++) {
			user[i] ='_' ;
		}
		int chances = 6;
		int compare = 0;
		while(chances!=0&&compare<word.length()) {
			System.out.print("Enter guess : ");
			String choice= input.nextLine().toLowerCase();
			char guess = choice.charAt(0);
			int check = 0;
			for(int i=0;i<word.length();i++) {
				if(guess==word.charAt(i)&&word.charAt(i)!=user[i]) { 
					user[i]=guess;
					check++;
					compare++;
				}
				else if(guess==word.charAt(i)&&word.charAt(i)==user[i]) {
					System.out.println("You have already placed "+guess);
					check++;
				}
			}
			if(check==0) { 
				System.out.println(guess+" Not found in the word");
				chances--;
				}
			switch(chances){
			case 5:
				System.out.println("O");
				break;
			case 4:
				System.out.println("O");
				System.out.println("|");
				break;
			case 3:
				System.out.println(" O ");
				System.out.println("/|");
				break;
			case 2:
				System.out.println(" O ");
				System.out.println("/|\\");
				break;
			case 1:
				System.out.println(" O ");
				System.out.println("/|\\");
				System.out.println("/ ");
				break;
			case 0:
				System.out.println(" O ");
				System.out.println("/|\\");
				System.out.println("/ \\");
				break;
			default:
				System.out.println(guess+" is in word");
			}

			for(char c:user) {
				System.out.print(c+" ");
			}
			System.out.println();
		}	
		if(chances==0)
			System.out.println("Game Over you have lost");
		else
			System.out.println("You have won");
	}
}
