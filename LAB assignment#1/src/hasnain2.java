import java.util.Random;
import java.util.Scanner;

public class hasnain2 {

	public static void main(String[] args) {
		Random rand=new Random();
		char slot1=0,slot2=' ',slot3=0,slot4=0,slot5=' ',slot6=0,slot7=' ',slot8=0,slot9=' ';
		if(slot1==slot2) {
		}
		int players=rand.nextInt(2);
		System.out.println("\t\t\t\t\tWelcome to tic tac toe");
		System.out.println("       ||      ||       ");
		System.out.println("   1   ||  2   ||   3   ");
		System.out.println("__||__||__");
		System.out.println("`||```||`");
		System.out.println("   4   ||  5   ||   6   ");
		System.out.println("_______||______||_______");
		System.out.println("`||||`");
		System.out.println("   7   ||  8   ||   9   ");
		System.out.println("       ||      ||       ");
		Scanner input=new Scanner(System.in);
		if(players==0) {
			System.out.println("PLayer One's turn");
			System.out.println("Enter the location u want to put ur mark:");
			int place=input.nextInt();
			if(place==1) { 
				 slot1='x';
			}
			else if(place==2) {
				 slot2='x';
			}
			else if(place==3) {
				 slot3='x';
			}
			else if(place==4) {
				 slot4='x';
			}
			else if(place==5) {
				 slot5='x';
			}
			else if(place==6) {
				 slot6='x';
			}
			else if(place==7) {
				 slot7='x';
			}
			else if(place==8) {
				 slot8='x';
			}
			else if(place==9) {
				 slot9='x';
			}
		}
		else {
			System.out.println("PLayer Two's turn");
		System.out.println("Enter the location u want to put ur mark:");
		int place=input.nextInt();
		if(place==1) { 
			 slot1='0';
		}
		else if(place==2) {
			 slot2='0';
		}
		else if(place==3) {
			 slot3='0';
		}
		else if(place==4) {
			 slot4='0';
		}
		else if(place==5) {
			 slot5='0';
		}
		else if(place==6) {
			 slot6='0';
		}
		else if(place==7) {
			 slot7='0';
		}
		else if(place==8) {
			 slot8='0';
		}
		else if(place==9) {
			 slot9='0';
		}
		}
		System.out.println("       ||      ||       ");
		System.out.println("   "+slot1+"   ||   "+slot2+"  ||   "+slot3);
		System.out.println("_______||______||_______");
		System.out.println("`||||`");
		System.out.println("   "+slot4+"   ||   "+slot5+"  ||   "+slot6);
		System.out.println("_______||______||_______");
		System.out.println("`||||`");
		System.out.println("   "+slot7+"   ||   "+slot8+"  ||   "+slot9);
		System.out.println("       ||      ||       ");
		if(players==1) {
			System.out.println("PLayer One's turn");
			System.out.println("Enter the location u want to put ur mark:");
			int place=input.nextInt();
			if(place==1) { 
				 slot1='x';
			}
			else if(place==2) {
				 slot2='x';
			}
			else if(place==3) {
				 slot3='x';
			}
			else if(place==4) {
				 slot4='x';
			}
			else if(place==5) {
				 slot5='x';
			}
			else if(place==6) {
				 slot6='x';
			}
			else if(place==7) {
				 slot7='x';
			}
			else if(place==8) {
				 slot8='x';
			}
			else if(place==9) {
				 slot9='x';
			}
		}
		else {
			System.out.println("PLayer Two's turn");
		System.out.println("Enter the location u want to put ur mark:");
		int place=input.nextInt();
		if(place==1) { 
			 slot1='0';
		}
		else if(place==2) {
			 slot2='0';
		}
		else if(place==3) {
			 slot3='0';
		}
		else if(place==4) {
			 slot4='0';
		}
		else if(place==5) {
			 slot5='0';
		}
		else if(place==6) {
			 slot6='0';
		}
		else if(place==7) {
			 slot7='0';
		}
		else if(place==8) {
			 slot8='0';
		}
		else if(place==9) {
			 slot9='0';
		}
		}
		System.out.println("       ||      ||       ");
		System.out.println("   "+slot1+"   ||   "+slot2+"  ||   "+slot3);
		System.out.println("_______||______||_______");
		System.out.println("`||||`");
		System.out.println("   "+slot4+"   ||   "+slot5+"  ||   "+slot6);
		System.out.println("_______||______||_______");
		System.out.println("`||||`");
		System.out.println("   "+slot7+"   ||   "+slot8+"  ||   "+slot9);
		System.out.println("       ||      ||       ");
		if(players==0) {
			System.out.println("PLayer One's turn");
			System.out.println("Enter the location u want to put ur mark:");
			int place=input.nextInt();
			if(place==1) { 
				 slot1='x';
			}
			else if(place==2) {
				 slot2='x';
			}
			else if(place==3) {
				 slot3='x';
			}
			else if(place==4) {
				 slot4='x';
			}
			else if(place==5) {
				 slot5='x';
			}
			else if(place==6) {
				 slot6='x';
			}
			else if(place==7) {
				 slot7='x';
			}
			else if(place==8) {
				 slot8='x';
			}
			else if(place==9) {
				 slot9='x';
			}
		}
		else {
			System.out.println("PLayer Two's turn");
		System.out.println("Enter the location u want to put ur mark:");
		int place=input.nextInt();
		if(place==1) { 
			 slot1='0';
		}
		else if(place==2) {
			 slot2='0';
		}
		else if(place==3) {
			 slot3='0';
		}
		else if(place==4) {
			 slot4='0';
		}
		else if(place==5) {
			 slot5='0';
		}
		else if(place==6) {
			 slot6='0';
		}
		else if(place==7) {
			 slot7='0';
		}
		else if(place==8) {
			 slot8='0';
		}
		else if(place==9) {
			 slot9='0';
		}
		}
		System.out.println("       ||      ||       ");
		System.out.println("   "+slot1+"   ||   "+slot2+"  ||   "+slot3);
		System.out.println("_______||______||_______");
		System.out.println("`||||`");
		System.out.println("   "+slot4+"   ||   "+slot5+"  ||   "+slot6);
		System.out.println("_______||______||_______");
		System.out.println("`||||`");
		System.out.println("   "+slot7+"   ||   "+slot8+"  ||   "+slot9);
		System.out.println("       ||      ||       ");	
		if(players==1) {
			System.out.println("PLayer One's turn");
			System.out.println("Enter the location u want to put ur mark:");
			int place=input.nextInt();
			if(place==1) { 
				 slot1='x';
			}
			else if(place==2) {
				 slot2='x';
			}
			else if(place==3) {
				 slot3='x';
			}
			else if(place==4) {
				 slot4='x';
			}
			else if(place==5) {
				 slot5='x';
			}
			else if(place==6) {
				 slot6='x';
			}
			else if(place==7) {
				 slot7='x';
			}
			else if(place==8) {
				 slot8='x';
			}
			else if(place==9) {
				 slot9='x';
			}
		}
		else {
			System.out.println("PLayer Two's turn");
		System.out.println("Enter the location u want to put ur mark:");
		int place=input.nextInt();
		if(place==1) { 
			 slot1='0';
		}
		else if(place==2) {
			 slot2='0';
		}
		else if(place==3) {
			 slot3='0';
		}
		else if(place==4) {
			 slot4='0';
		}
		else if(place==5) {
			 slot5='0';
		}
		else if(place==6) {
			 slot6='0';
		}
		else if(place==7) {
			 slot7='0';
		}
		else if(place==8) {
			 slot8='0';
		}
		else if(place==9) {
			 slot9='0';
		}
		}
		System.out.println("       ||      ||       ");
		System.out.println("   "+slot1+"   ||   "+slot2+"  ||   "+slot3);
		System.out.println("_______||______||_______");
		System.out.println("`||||`");
		System.out.println("   "+slot4+"   ||   "+slot5+"  ||   "+slot6);
		System.out.println("_______||______||_______");
		System.out.println("`||||`");
		System.out.println("   "+slot7+"   ||   "+slot8+"  ||   "+slot9);
		System.out.println("       ||      ||       ");	
		if(players==0) {
			System.out.println("PLayer One's turn");
			System.out.println("Enter the location u want to put ur mark:");
			int place=input.nextInt();
			if(place==1) { 
				 slot1='x';
			}
			else if(place==2) {
				 slot2='x';
			}
			else if(place==3) {
				 slot3='x';
			}
			else if(place==4) {
				 slot4='x';
			}
			else if(place==5) {
				 slot5='x';
			}
			else if(place==6) {
				 slot6='x';
			}
			else if(place==7) {
				 slot7='x';
			}
			else if(place==8) {
				 slot8='x';
			}
			else if(place==9) {
				 slot9='x';
			}
			if(((slot1=='x'||slot1=='0')&&(slot1==slot2 && slot1==slot3)) || ((slot4=='x'||slot4=='0')&&(slot4==slot5 && slot4==slot6)) || (((slot7=='x'||slot7=='0')&&(slot7==slot8 && slot7==slot9)))|| ((slot1=='x'||slot1=='0')&&(slot1==slot4 && slot1==slot7))
					||((slot2=='x'||slot2=='0')&&(slot2==slot5 && slot2==slot8))||((slot3=='x'||slot3=='0')&&(slot3==slot6 && slot3==slot9)) ||  ((slot1=='x'||slot1=='0')&&(slot1==slot5 && slot1==slot9)) ||((slot3=='x'||slot3=='0')&&(slot3==slot5 && slot3==slot7)))
				{
	
			System.out.println("       ||      ||       ");
			System.out.println("   "+slot1+"   ||   "+slot2+"  ||   "+slot3);
			System.out.println("_______||______||_______");
			System.out.println("`||||`");
			System.out.println("   "+slot4+"   ||   "+slot5+"  ||   "+slot6);
			System.out.println("_______||______||_______");
			System.out.println("`||||`");
			System.out.println("   "+slot7+"   ||   "+slot8+"  ||   "+slot9);
			System.out.println("       ||      ||       ");
			System.out.println("Player 1 wins the game");
			}
			else 
		}
		else if(players==1){
			System.out.println("PLayer Two's turn");
		System.out.println("Enter the location u want to put ur mark:");
		int place=input.nextInt();
		if(place==1) { 
			 slot1='0';
		}
		else if(place==2) {
			 slot2='0';
		}
		else if(place==3) {
			 slot3='0';
		}
		else if(place==4) {
			 slot4='0';
		}
		else if(place==5) {
			 slot5='0';
		}
		else if(place==6) {
			 slot6='0';
		}
		else if(place==7) {
			 slot7='0';
		}
		else if(place==8) {
			 slot8='0';
		}
		else if(place==9) {
			 slot9='0';
		}
		if(((slot1=='x'||slot1=='0')&&(slot1==slot2 && slot1==slot3)) || ((slot4=='x'||slot4=='0')&&(slot4==slot5 && slot4==slot6)) || (((slot7=='x'||slot7=='0')&&(slot7==slot8 && slot7==slot9)))|| ((slot1=='x'||slot1=='0')&&(slot1==slot4 && slot1==slot7))
				||((slot2=='x'||slot2=='0')&&(slot2==slot5 && slot2==slot8))||((slot3=='x'||slot3=='0')&&(slot3==slot6 && slot3==slot9)) ||  ((slot1=='x'||slot1=='0')&&(slot1==slot5 && slot1==slot9)) ||((slot3=='x'||slot3=='0')&&(slot3==slot5 && slot3==slot7)))
			{
			System.out.println("       ||      ||       ");
			System.out.println("   "+slot1+"   ||   "+slot2+"  ||   "+slot3);
			System.out.println("_______||______||_______");
			System.out.println("`||||`");
			System.out.println("   "+slot4+"   ||   "+slot5+"  ||   "+slot6);
			System.out.println("_______||______||_______");
			System.out.println("`||||`");
			System.out.println("   "+slot7+"   ||   "+slot8+"  ||   "+slot9);
			System.out.println("       ||      ||       ");
			System.out.println("Player 2 wins the game");
			}
		}
		if(players==0||players==1) {
		System.out.println("       ||      ||       ");
		System.out.println("   "+slot1+"   ||   "+slot2+"  ||   "+slot3);
		System.out.println("_______||______||_______");
		System.out.println("`||||`");
		System.out.println("   "+slot4+"   ||   "+slot5+"  ||   "+slot6);
		System.out.println("_______||______||_______");
		System.out.println("`||||`");
		System.out.println("   "+slot7+"   ||   "+slot8+"  ||   "+slot9);
		System.out.println("       ||      ||       ");
		}
		if(players==1) {
			System.out.println("PLayer One's turn");
			System.out.println("Enter the location u want to put ur mark:");
			int place=input.nextInt();
			if(place==1) { 
				 slot1='x';
			}
			else if(place==2) {
				 slot2='x';
			}
			else if(place==3) {
				 slot3='x';
			}
			else if(place==4) {
				 slot4='x';
			}
			else if(place==5) {
				 slot5='x';
			}
			else if(place==6) {
				 slot6='x';
			}
			else if(place==7) {
				 slot7='x';
			}
			else if(place==8) {
				 slot8='x';
			}
			else if(place==9) {
				 slot9='x';
			}
			if(((slot1=='x'||slot1=='0')&&(slot1==slot2 && slot1==slot3)) || ((slot4=='x'||slot4=='0')&&(slot4==slot5 && slot4==slot6)) || (((slot7=='x'||slot7=='0')&&(slot7==slot8 && slot7==slot9)))|| ((slot1=='x'||slot1=='0')&&(slot1==slot4 && slot1==slot7))
					||((slot2=='x'||slot2=='0')&&(slot2==slot5 && slot2==slot8))||((slot3=='x'||slot3=='0')&&(slot3==slot6 && slot3==slot9)) ||  ((slot1=='x'||slot1=='0')&&(slot1==slot5 && slot1==slot9)) ||((slot3=='x'||slot3=='0')&&(slot3==slot5 && slot3==slot7)))
				{	
				System.out.println("       ||      ||       ");
				System.out.println("   "+slot1+"   ||   "+slot2+"  ||   "+slot3);
				System.out.println("_______||______||_______");
				System.out.println("`||||`");
				System.out.println("   "+slot4+"   ||   "+slot5+"  ||   "+slot6);
				System.out.println("_______||______||_______");
				System.out.println("`||||`");
				System.out.println("   "+slot7+"   ||   "+slot8+"  ||   "+slot9);
				System.out.println("       ||      ||       ");
				System.out.println("Player 1 wins the game");
			}
		}
		else if(players==0) {
			System.out.println("PLayer Two's turn");
		System.out.println("Enter the location u want to put ur mark:");
		int place=input.nextInt();
		if(place==1) { 
			 slot1='0';
		}
		else if(place==2) {
			 slot2='0';
		}
		else if(place==3) {
			 slot3='0';
		}
		else if(place==4) {
			 slot4='0';
		}
		else if(place==5) {
			 slot5='0';
		}
		else if(place==6) {
			 slot6='0';
		}
		else if(place==7) {
			 slot7='0';
		}
		else if(place==8) {
			 slot8='0';
		}
		else if(place==9) {
			 slot9='0';
		}
		if(((slot1=='x'||slot1=='0')&&(slot1==slot2 && slot1==slot3)) || ((slot4=='x'||slot4=='0')&&(slot4==slot5 && slot4==slot6)) || (((slot7=='x'||slot7=='0')&&(slot7==slot8 && slot7==slot9)))|| ((slot1=='x'||slot1=='0')&&(slot1==slot4 && slot1==slot7))
				||((slot2=='x'||slot2=='0')&&(slot2==slot5 && slot2==slot8))||((slot3=='x'||slot3=='0')&&(slot3==slot6 && slot3==slot9)) ||  ((slot1=='x'||slot1=='0')&&(slot1==slot5 && slot1==slot9)) ||((slot3=='x'||slot3=='0')&&(slot3==slot5 && slot3==slot7)))
				{
			System.out.println("       ||      ||       ");
			System.out.println("   "+slot1+"   ||   "+slot2+"  ||   "+slot3);
			System.out.println("_______||______||_______");
			System.out.println("`||||`");
			System.out.println("   "+slot4+"   ||   "+slot5+"  ||   "+slot6);
			System.out.println("_______||______||_______");
			System.out.println("`||||`");
			System.out.println("   "+slot7+"   ||   "+slot8+"  ||   "+slot9);
			System.out.println("       ||      ||       ");
			System.out.println("Player 2 wins the game");
		}
		}
		if(players==0||players==1) {
		System.out.println("       ||      ||       ");
		System.out.println("   "+slot1+"   ||   "+slot2+"  ||   "+slot3);
		System.out.println("_______||______||_______");
		System.out.println("`||||`");
		System.out.println("   "+slot4+"   ||   "+slot5+"  ||   "+slot6);
		System.out.println("_______||______||_______");
		System.out.println("`||||`");
		System.out.println("   "+slot7+"   ||   "+slot8+"  ||   "+slot9);
		System.out.println("       ||      ||       ");
		}
		if(players==0) {
			System.out.println("PLayer One's turn");
			System.out.println("Enter the location u want to put ur mark:");
			int place=input.nextInt();
			if(place==1) { 
				 slot1='x';
			}
			else if(place==2) {
				 slot2='x';
			}
			else if(place==3) {
				 slot3='x';
			}
			else if(place==4) {
				 slot4='x';
			}
			else if(place==5) {
				 slot5='x';
			}
			else if(place==6) {
				 slot6='x';
			}
			else if(place==7) {
				 slot7='x';
			}
			else if(place==8) {
				 slot8='x';
			}
			else if(place==9) {
				 slot9='x';
			}
			if(((slot1=='x'||slot1=='0')&&(slot1==slot2 && slot1==slot3)) || ((slot4=='x'||slot4=='0')&&(slot4==slot5 && slot4==slot6)) || (((slot7=='x'||slot7=='0')&&(slot7==slot8 && slot7==slot9)))|| ((slot1=='x'||slot1=='0')&&(slot1==slot4 && slot1==slot7))
					||((slot2=='x'||slot2=='0')&&(slot2==slot5 && slot2==slot8))||((slot3=='x'||slot3=='0')&&(slot3==slot6 && slot3==slot9)) ||  ((slot1=='x'||slot1=='0')&&(slot1==slot5 && slot1==slot9)) ||((slot3=='x'||slot3=='0')&&(slot3==slot5 && slot3==slot7)))
				{
				System.out.println("       ||      ||       ");
				System.out.println("   "+slot1+"   ||   "+slot2+"  ||   "+slot3);
				System.out.println("_______||______||_______");
				System.out.println("`||||`");
				System.out.println("   "+slot4+"   ||   "+slot5+"  ||   "+slot6);
				System.out.println("_______||______||_______");
				System.out.println("`||||`");
				System.out.println("   "+slot7+"   ||   "+slot8+"  ||   "+slot9);
				System.out.println("       ||      ||       ");
				System.out.println("Player 1 wins the game");
				
			}
		}
		else if(players==1) {
			System.out.println("PLayer Two's turn");
		System.out.println("Enter the location u want to put ur mark:");
		int place=input.nextInt();
		if(place==1) { 
			 slot1='0';
		}
		else if(place==2) {
			 slot2='0';
		}
		else if(place==3) {
			 slot3='0';
		}
		else if(place==4) {
			 slot4='0';
		}
		else if(place==5) {
			 slot5='0';
		}
		else if(place==6) {
			 slot6='0';
		}
		else if(place==7) {
			 slot7='0';
		}
		else if(place==8) {
			 slot8='0';
		}
		else if(place==9) {
			 slot9='0';
		}
		if(((slot1=='x'||slot1=='0')&&(slot1==slot2 && slot1==slot3)) || ((slot4=='x'||slot4=='0')&&(slot4==slot5 && slot4==slot6)) || (((slot7=='x'||slot7=='0')&&(slot7==slot8 && slot7==slot9)))|| ((slot1=='x'||slot1=='0')&&(slot1==slot4 && slot1==slot7))
				||((slot2=='x'||slot2=='0')&&(slot2==slot5 && slot2==slot8))||((slot3=='x'||slot3=='0')&&(slot3==slot6 && slot3==slot9)) ||  ((slot1=='x'||slot1=='0')&&(slot1==slot5 && slot1==slot9)) ||((slot3=='x'||slot3=='0')&&(slot3==slot5 && slot3==slot7)))
			{
			System.out.println("       ||      ||       ");
			System.out.println("   "+slot1+"   ||   "+slot2+"  ||   "+slot3);
			System.out.println("_______||______||_______");
			System.out.println("`||||`");
			System.out.println("   "+slot4+"   ||   "+slot5+"  ||   "+slot6);
			System.out.println("_______||______||_______");
			System.out.println("`||||`");
			System.out.println("   "+slot7+"   ||   "+slot8+"  ||   "+slot9);
			System.out.println("       ||      ||       ");
			System.out.println("Player 2 wins the game");
		}
		}
		if(players==0||players==1) {
		System.out.println("       ||      ||       ");
		System.out.println("   "+slot1+"   ||   "+slot2+"  ||   "+slot3);
		System.out.println("_______||______||_______");
		System.out.println("`||||`");
		System.out.println("   "+slot4+"   ||   "+slot5+"  ||   "+slot6);
		System.out.println("_______||______||_______");
		System.out.println("`||||`");
		System.out.println("   "+slot7+"   ||   "+slot8+"  ||   "+slot9);
		System.out.println("       ||      ||       ");
		}
		if(players==1) {
			System.out.println("PLayer One's turn");
			System.out.println("Enter the location u want to put ur mark:");
			int place=input.nextInt();
			if(place==1) { 
				 slot1='x';
			}
			else if(place==2) {
				 slot2='x';
			}
			else if(place==3) {
				 slot3='x';
			}
			else if(place==4) {
				 slot4='x';
			}
			else if(place==5) {
				 slot5='x';
			}
			else if(place==6) {
				 slot6='x';
			}
			else if(place==7) {
				 slot7='x';
			}
			else if(place==8) {
				 slot8='x';
			}
			else if(place==9) {
				 slot9='x';
			}
			if(((slot1=='x'||slot1=='0')&&(slot1==slot2 && slot1==slot3)) || ((slot4=='x'||slot4=='0')&&(slot4==slot5 && slot4==slot6)) || (((slot7=='x'||slot7=='0')&&(slot7==slot8 && slot7==slot9)))|| ((slot1=='x'||slot1=='0')&&(slot1==slot4 && slot1==slot7))
					||((slot2=='x'||slot2=='0')&&(slot2==slot5 && slot2==slot8))||((slot3=='x'||slot3=='0')&&(slot3==slot6 && slot3==slot9)) ||  ((slot1=='x'||slot1=='0')&&(slot1==slot5 && slot1==slot9)) ||((slot3=='x'||slot3=='0')&&(slot3==slot5 && slot3==slot7)))
				{
				System.out.println("       ||      ||       ");
				System.out.println("   "+slot1+"   ||   "+slot2+"  ||   "+slot3);
				System.out.println("_______||______||_______");
				System.out.println("`||||`");
				System.out.println("   "+slot4+"   ||   "+slot5+"  ||   "+slot6);
				System.out.println("_______||______||_______");
				System.out.println("`||||`");
				System.out.println("   "+slot7+"   ||   "+slot8+"  ||   "+slot9);
				System.out.println("       ||      ||       ");
				System.out.println("Player 1 wins the game");
			}
		}
		else if(players==0) {
			System.out.println("PLayer Two's turn");
		System.out.println("Enter the location u want to put ur mark:");
		int place=input.nextInt();
		if(place==1) { 
			 slot1='0';
		}
		else if(place==2) {
			 slot2='0';
		}
		else if(place==3) {
			 slot3='0';
		}
		else if(place==4) {
			 slot4='0';
		}
		else if(place==5) {
			 slot5='0';
		}
		else if(place==6) {
			 slot6='0';
		}
		else if(place==7) {
			 slot7='0';
		}
		else if(place==8) {
			 slot8='0';
		}
		else if(place==9) {
			 slot9='0';
		}
		if(((slot1=='x'||slot1=='0')&&(slot1==slot2 && slot1==slot3)) || ((slot4=='x'||slot4=='0')&&(slot4==slot5 && slot4==slot6)) || (((slot7=='x'||slot7=='0')&&(slot7==slot8 && slot7==slot9)))|| ((slot1=='x'||slot1=='0')&&(slot1==slot4 && slot1==slot7))
				||((slot2=='x'||slot2=='0')&&(slot2==slot5 && slot2==slot8))||((slot3=='x'||slot3=='0')&&(slot3==slot6 && slot3==slot9)) ||  ((slot1=='x'||slot1=='0')&&(slot1==slot5 && slot1==slot9)) ||((slot3=='x'||slot3=='0')&&(slot3==slot5 && slot3==slot7)))
			{
			System.out.println("       ||      ||       ");
			System.out.println("   "+slot1+"   ||   "+slot2+"  ||   "+slot3);
			System.out.println("_______||______||_______");
			System.out.println("`||||`");
			System.out.println("   "+slot4+"   ||   "+slot5+"  ||   "+slot6);
			System.out.println("_______||______||_______");
			System.out.println("`||||`");
			System.out.println("   "+slot7+"   ||   "+slot8+"  ||   "+slot9);
			System.out.println("       ||      ||       ");
			System.out.println("Player 2 wins the game");
		}
		}
		if(players==0||players==1) {
		System.out.println("       ||      ||       ");
		System.out.println("   "+slot1+"   ||   "+slot2+"  ||   "+slot3);
		System.out.println("_______||______||_______");
		System.out.println("`||||`");
		System.out.println("   "+slot4+"   ||   "+slot5+"  ||   "+slot6);
		System.out.println("_______||______||_______");
		System.out.println("`||||`");
		System.out.println("   "+slot7+"   ||   "+slot8+"  ||   "+slot9);
		System.out.println("       ||      ||       ");
		}
		if(players==0) {
			System.out.println("PLayer One's turn");
			System.out.println("Enter the location u want to put ur mark:");
			int place=input.nextInt();
			if(place==1) { 
				 slot1='x';
			}
			else if(place==2) {
				 slot2='x';
			}
			else if(place==3) {
				 slot3='x';
			}
			else if(place==4) {
				 slot4='x';
			}
			else if(place==5) {
				 slot5='x';
			}
			else if(place==6) {
				 slot6='x';
			}
			else if(place==7) {
				 slot7='x';
			}
			else if(place==8) {
				 slot8='x';
			}
			else if(place==9) {
				 slot9='x';
			}
			if(((slot1=='x'||slot1=='0')&&(slot1==slot2 && slot1==slot3)) || ((slot4=='x'||slot4=='0')&&(slot4==slot5 && slot4==slot6)) || (((slot7=='x'||slot7=='0')&&(slot7==slot8 && slot7==slot9)))|| ((slot1=='x'||slot1=='0')&&(slot1==slot4 && slot1==slot7))
					||((slot2=='x'||slot2=='0')&&(slot2==slot5 && slot2==slot8))||((slot3=='x'||slot3=='0')&&(slot3==slot6 && slot3==slot9)) ||  ((slot1=='x'||slot1=='0')&&(slot1==slot5 && slot1==slot9)) ||((slot3=='x'||slot3=='0')&&(slot3==slot5 && slot3==slot7)))
				{
				System.out.println("       ||      ||       ");
				System.out.println("   "+slot1+"   ||   "+slot2+"  ||   "+slot3);
				System.out.println("_______||______||_______");
				System.out.println("`||||`");
				System.out.println("   "+slot4+"   ||   "+slot5+"  ||   "+slot6);
				System.out.println("_______||______||_______");
				System.out.println("`||||`");
				System.out.println("   "+slot7+"   ||   "+slot8+"  ||   "+slot9);
				System.out.println("       ||      ||       ");
				System.out.println("Player 1 wins the game");
			}
		}
		else if(players==1) {
			System.out.println("PLayer Two's turn");
		System.out.println("Enter the location u want to put ur mark:");
		int place=input.nextInt();
		if(place==1) { 
			 slot1='0';
		}
		else if(place==2) {
			 slot2='0';
		}
		else if(place==3) {
			 slot3='0';
		}
		else if(place==4) {
			 slot4='0';
		}
		else if(place==5) {
			 slot5='0';
		}
		else if(place==6) {
			 slot6='0';
		}
		else if(place==7) {
			 slot7='0';
		}
		else if(place==8) {
			 slot8='0';
		}
		else if(place==9) {
			 slot9='0';
		}
		if(((slot1=='x'||slot1=='0')&&(slot1==slot2 && slot1==slot3)) || ((slot4=='x'||slot4=='0')&&(slot4==slot5 && slot4==slot6)) || (((slot7=='x'||slot7=='0')&&(slot7==slot8 && slot7==slot9)))|| ((slot1=='x'||slot1=='0')&&(slot1==slot4 && slot1==slot7))
				||((slot2=='x'||slot2=='0')&&(slot2==slot5 && slot2==slot8))||((slot3=='x'||slot3=='0')&&(slot3==slot6 && slot3==slot9)) ||  ((slot1=='x'||slot1=='0')&&(slot1==slot5 && slot1==slot9)) ||((slot3=='x'||slot3=='0')&&(slot3==slot5 && slot3==slot7)))
			{	
			System.out.println("       ||      ||       ");
			System.out.println("   "+slot1+"   ||   "+slot2+"  ||   "+slot3);
			System.out.println("_______||______||_______");
			System.out.println("`||||`");
			System.out.println("   "+slot4+"   ||   "+slot5+"  ||   "+slot6);
			System.out.println("_______||______||_______");
			System.out.println("`||||`");
			System.out.println("   "+slot7+"   ||   "+slot8+"  ||   "+slot9);
			System.out.println("       ||      ||       ");
			System.out.println("Player 2 wins the game");
		}
		else
		{
			System.out.println("       ||      ||       ");
			System.out.println("   "+slot1+"   ||   "+slot2+"  ||   "+slot3);
			System.out.println("_______||______||_______");
			System.out.println("`||||`");
			System.out.println("   "+slot4+"   ||   "+slot5+"  ||   "+slot6);
			System.out.println("_______||______||_______");
			System.out.println("`||||````");
			System.out.println("   "+slot7+"   ||   "+slot8+"  ||   "+slot9);
			System.out.println("       ||      ||       ");
			System.out.println("Game is drawed");
		}
		}
	}

}
