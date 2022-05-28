
import java.util.*;
public class dsssf {
	public static void main(String[] args) {

	    //Create scanner
	            Scanner input = new Scanner(System.in);

	    // Input loop
	            input: while (true) {
	            System.out.print("Please enter your move: "); String move = input.next();

	    //Checking for correct input
	            if (move.length() == 2) {
	                char row = move.charAt(0);
	                int number = Character.getNumericValue(move.charAt(1)); 

	                if (((row == 'a') || (row == 'b') || (row == 'c'))
	                        && ((number == 1) || (number == 2) || (number == 3))) {



	                } else {
	                    System.out.println("Please only enter the right code (a1,...) for the play!");
	                    }


	            }
	    //Variables declared to hold spaces on the board
	    char a1 = ' ';
	    char a2 = ' ';
	    char a3 = ' ';
	    char b1 = ' ';
	    char b2 = ' ';
	    char b3 = ' ';
	    char c1 = ' ';
	    char c2 = ' ';
	    char c3 = ' ';

	    // Method called to print updated game board
	    public static String gameGrid(char a1, char a2,char a3, char b1, char b2, char b3, char c1, char c2, char c3){  

	    // Prompt user to play game and enter a position
	    System.out.println( "Welcome to Tic-Tac-Toe. Please enter your first move: ");


	    // Create game grid
	    System.out.println();
	    System.out.println("    1    2    3  ");
	    System.out.println(" |----|----|----|");
	    System.out.println("A|   " + a1 + "|   " + a2 + "|   " + a3 + "|   ");
	    System.out.println(" |____|____|____|");
	    System.out.println("B|   " + b1 + "|   " + b2 + "|   " + b3 + "|   ");
	    System.out.println(" |____|____|____|");
	    System.out.println("C|   " + c1 + "|   " + c2 + "|   " + c3 + "|   ");
	    System.out.println(" |____|____|____|");




	    //Checking to see if position on board is empty, entering X for human interaction
	        switch (row) { 
	        case 'a':
	            switch (number) { 
	            case 1:
	                if (a1 == ' ') {
	                    a1 = 'X';
	                    break input; 
	                } else
	                    System.out.println("This field is already taken, choose another!"); 
	                break;
	            case 2:
	                if (a2 == ' ') {
	                    a2 = 'X';
	                    break input;
	                }
	                else
	                    System.out.println("This field is already taken, choose another!"); 
	                break;
	            case 3:
	                if (a3 == ' ') {
	                    a3 = 'X';
	                    break input; 
	                } else{
	                    System.out.println("This field is already taken, choose another!");
	                break;
	                }

	            case 4:
	                if (b1 == ' ') {
	                    b1 = 'X';
	                    break input; 
	                } else
	                    System.out.println("This field is already taken, choose another!"); 
	                break;
	            case 5:
	                if (b2 == ' ') {
	                    b2 = 'X';
	                    break input;
	                }
	                else
	                    System.out.println("This field is already taken, choose another!"); 
	                break;
	            case 6:
	                if (b3 == ' ') {
	                    b3 = 'X';
	                    break input; 
	                } else
	                    System.out.println("This field is already taken, choose another!"); 
	                break;

	            case 7:
	                if (c1 == ' ') {
	                    c1 = 'X';
	                    break input;
	                } else
	                    System.out.println("This field is already taken, choose another!"); 
	                break;
	            case 8:
	                if (c2 == ' ') {
	                    c2 = 'X';
	                    break input;

	                }else
	                    System.out.println("This field is already taken, choose another!"); 
	                break;
	            case 9:
	                if (c3 == ' ') {
	                    c3 = 'X';
	                    break input;
	                } else
	                    System.out.println("This field is already taken, choose another!"); 
	                break;
	            }
	            break;



	}
	    }
	}
	} }