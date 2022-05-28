import java.util.Scanner;

public class ddf {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a word : ");
		String given = input.nextLine().toLowerCase();
		char[]used= new char[given.length()];
		for(int i=0;i<given.length();i++) {
			used[i] ='-' ;
		}
		char [] word = new char[given.length()];
		for(int i=0;i<given.length();i++) {
			word[i] = given.charAt(i);
		}
		int chance = 10;
		while(chance!=0) {
			System.out.print("Enter guess : ");
			char guess = input.next().charAt(0);
			guess=Character.toLowerCase(guess);	
			int check = 0;
			for(int i=0;i<word.length;i++) {
				if(guess==word[i]&&word[i]!=used[i]) { 
					used[i]=guess;
					check++;
				}
			}
			if(check==0) { 
				chance--;
				System.out.println(guess+" Not found in the word");;
				System.out.println(chance+" chances remaining");
				}
			for(char c:used) {
				System.out.print(c+" ");
			}
			System.out.println();
			int compare = 0;
			for(int i=0;i<used.length;i++) {
				if(word[i]==used[i])
					compare++;
			}
			if(compare==used.length) {
				break;
				}
		}	
		if(chance==0)
			System.out.println("Game Over you have lost");
		else
			System.out.println("You have won");
	}
}
