//Made by: Ahmed Ali(SP19-BCS-096) Class:2B
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Quiz {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Press \"1\" for Science\npress \"2\" for geography\npress \"3\" for history");
		int choice = input.nextInt();
		int result = 0;
		if (choice==1) {
			System.out.println("which is the closest star to our sun\n 1)alpha centuri\t\t 2)proxima centuri\n 3)VYcannis majoris\t\t 4)eta carinae");
			int question1 = input.nextInt();
			System.out.println();
			System.out.println("which of the folowing is newtons 3rd law\n 1)V=IR   \t\t 2)F=ma\n 3)1/2 MV^2\t\t 4)GMm/R^2");
			int question2 = input.nextInt();
			System.out.println();			
			System.out.println("what is the molecular formula of methane\n 1)CH4\t\t\t 2)C2H6\n 3)1/2 CH2OH\t\t 4)C6H12O6");
			int question3 = input.nextInt();
			System.out.println();			
			System.out.println("which of the folowing is not a mammal\n 1)humman\t\t 2)horse\n 3)frog  \t\t 4)rabbit");
			int question4 = input.nextInt();
			System.out.println();
			System.out.println("the heat required to raise the temperature of the unit mass of a given substance by 1 degree is\n 1)specific heat capacity\t 2)inductance\n 3)heat capacity\t\t 4)capacitance");
			int question5 = input.nextInt();
			System.out.println();
			switch (question1) {
			case 2:
				result+=5;
				break;
			default :
				result-=2;
			}
			switch (question2) {
			case 2:
				result+=5;
				break;
			default :
				result-=2;
			}
			switch (question3) {
			case 1:
				result+=5;
				break;
			default :
				result-=2;
			}
			switch (question4) {
			case 3:
				result+=5;
				break;
			default :
				result-=2;
			}
			switch (question5) {
			case 1:
				result+=5;
				break;
			default :
				result-=2;
			}
			System.out.println(result);
		}
		else if (choice==2) {
			System.out.println("the highest mountain on earth is\n 1)mount everest\t 2)K2\n 3)mount elba\t\t 4)nanga parbat");
			int question1 = input.nextInt();
			System.out.println();
			System.out.println("which of the folowing is not an ocean\n 1)Pacific\t\t 2)Altantic\n 3)Arabian\t\t 4)Indian");
			int question2 = input.nextInt();
			System.out.println();			
			System.out.println("which of the following is not a continent\n 1)Greenland\t 2)Europe\n 3)Asia\t\t 4)Africa");
			int question3 = input.nextInt();
			System.out.println();			
			System.out.println("what is the second highest mountain on earth\n 1)mount everest\t 2)K2\n 3)mount elba\t\t 4)nanga parbat");
			int question4 = input.nextInt();
			System.out.println();
			System.out.println("what is the capital of Pakistan\n 1)Islamabad\t\t 2)Karachi\n 3)Lahore\t\t 4)Peshawar");
			int question5 = input.nextInt();
			System.out.println();
			switch (question1) {
			case 1:
				result+=5;
				break;
			default :
				result-=2;
			}
			switch (question2) {
			case 3:
				result+=5;
				break;
			default :
				result-=2;
			}
			switch (question3) {
			case 1:
				result+=5;
				break;
			default :
				result-=2;
			}
			switch (question4) {
			case 2:
				result+=5;
				break;
			default :
				result-=2;
			}
			switch (question5) {
			case 1:
				result+=5;
				break;
			default :
				result-=2;
			}
		}
		else if(choice==3) {
			
			System.out.println("who was the first Mughal king\n 1)Bahadur shah\t\t 2)Babar\n 3)Hamayun\t\t 4)Akbar");
			int question1 = input.nextInt();
			System.out.println();
			System.out.println("who was the king that was deposed by the french revolution\n 1)LouisXVI\t\t 2)Ricahrd Lionheart\n 3)Napolean\t\t 4)Franz Ferdinand");
			int question2 = input.nextInt();
			System.out.println();			
			System.out.println("The birth of the Egthptian civilization took place at the banks of which river\n 1)Euphrates\t\t 2)Tigirs\n 3)Danube\t\t 4)Nile");
			int question3 = input.nextInt();
			System.out.println();			
			System.out.println("which of the following is not a greek philosopher \n 1)Aristotle\t\t 2)Socrates\n 3)Plato\t\t 4)Confucious");
			int question4 = input.nextInt();
			System.out.println();
			System.out.println("what was the first civilization that took root in Pakistan\n 1)Mesopotamian\t\t 2)Summerian\n 3)Indus valley\t\t 4)Hittite");
			int question5 = input.nextInt();
			System.out.println();
			switch (question1) {
			case 2:
				result+=5;
				break;
			default :
				result-=2;
			}
			switch (question2) {
			case 1:
				result+=5;
				break;
			default :
				result-=2;
			}
			switch (question3) {
			case 4:
				result+=5;
				break;
			default :
				result-=2;
			}
			switch (question4) {
			case 4:
				result+=5;
				break;
			default :
				result-=2;
			}
			switch (question5) {
			case 3:
				result+=5;
				break;
			default :
				result-=2;
			}
			
		}
		else {
			System.out.println("Invalid input run the program again");
		}
		System.out.println("Your Score is: "+result);
		JOptionPane.showMessageDialog(null, "Your Score is: "+result);
	}

}
