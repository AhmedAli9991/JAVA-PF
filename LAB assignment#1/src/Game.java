//made by Ahmed Ali(SP19-BCS-096) Class:2B
import java.util.*;

public class Game {

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
		System.out.print("enter positon you wish to place mark: ");
		int position1 = input.nextInt();
		if (position1>9)
			position1=9;
		switch (position1) {
		case 1:
			a1="X";
			System.out.println(a1+"  "+a2+" "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+" "+c2+" "+c3);
			break;
		case 2:
			a2="X";
			System.out.println(a1+" "+a2+"  "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+" "+c2+" "+c3);
			break;
		case 3:
			a3="X";
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+" "+c2+" "+c3);
			break;
		case 4:
			b1="X";
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+"  "+b2+" "+b3+"\n"+c1+" "+c2+" "+c3);
			break;
		case 5:
			b2="X";
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+" "+b2+"  "+b3+"\n"+c1+" "+c2+" "+c3);
			break;
		case 6:
			b3="X";
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+" "+c2+" "+c3);
			break;
		case 7:
			c1="X";
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+"  "+c2+" "+c3);
			break;
		case 8:
			c2="X";
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+" "+c2+"  "+c3);
			break;
		default:
			c3="X";
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+" "+c2+" "+c3);
		}
		int position2 = 1+(random.nextInt(9-1));
		if (position2 == position1 || position2>9) {
			if (position2<9)  
				position2+=1;
			else 
				position2=9;}
		if (position2 == position1) {
			if (position2<9)  
				position2+=1;
			else 
				position2-=9;}
			
		System.out.println("computer places at: " + position2);
		switch (position2) {
		case 1:
			a1="O";
			System.out.println(a1+"  "+a2+" "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+" "+c2+" "+c3);
			break;
		case 2:
			a2="O";
			System.out.println(a1+" "+a2+"  "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+" "+c2+" "+c3);
			break;
		case 3:
			a3="O";
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+" "+c2+" "+c3);
			break;
		case 4:
			b1="O";
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+"  "+b2+" "+b3+"\n"+c1+" "+c2+" "+c3);
			break;
		case 5:
			b2="O";
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+" "+b2+"  "+b3+"\n"+c1+" "+c2+" "+c3);
			break;
		case 6:
			b3="O";
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+" "+c2+" "+c3);
			break;
		case 7:
			c1="O";
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+"  "+c2+" "+c3);
			break;
		case 8:
			c2="O";
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+" "+c2+"  "+c3);
			break;
		default:
			c3="O";
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+" "+c2+" "+c3);
		}
		System.out.print("enter positon you wish to place mark 3:");
		int position3 = input.nextInt();
		if (position3 == position1 || position3==position2 || position3>9) {
			if (position3<9)  
				position3+=1;
			else 
				position3=9;
		}
		if (position3 == position1 || position3==position2) {
			if (position3<9)  
				position3+=1;
			else
				position3-=1;}
		if (position3 == position1 || position3==position2) {
			if (position3<8)  
				position3+=1;
			else
				position3-=1;}
		switch (position3) {
		case 1:
			a1="X";
			System.out.println(a1+"  "+a2+" "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+" "+c2+" "+c3);
			break;
		case 2:
			a2="X";
			System.out.println(a1+" "+a2+"  "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+" "+c2+" "+c3);
			break;
		case 3:
			a3="X";
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+" "+c2+" "+c3);
			break;
		case 4:
			b1="X";
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+"  "+b2+" "+b3+"\n"+c1+" "+c2+" "+c3);
			break;
		case 5:
			b2="X";
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+" "+b2+"  "+b3+"\n"+c1+" "+c2+" "+c3);
			break;
		case 6:
			b3="X";
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+" "+c2+" "+c3);
			break;
		case 7:
			c1="X";
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+"  "+c2+" "+c3);
			break;
		case 8:
			c2="X";
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+" "+c2+"  "+c3);
			break;
		default:
			c3="X";
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+" "+c2+" "+c3);
		}		
		int position4 = 1+(random.nextInt(9-1));
		if (position4 == position1 || position4==position2 || position4==position3 || position4>9) {
			if (position4<9)  
				position4+=1;
			else 
				position4=9;}
		if (position4 == position1 || position4==position2 || position4==position3) {
			if (position4<9)  
				position4+=1;
			else 
				position4-=1;}
		if (position4 == position1 || position4==position2 || position4==position3) {
			if (position4<8)  
				position4+=1;
			else 
				position4-=1;}
		if (position4 == position1 || position4==position2 || position4==position3) {
			if (position4<7)  
				position4+=1;
			else 
				position4-=1;}
		System.out.println("computer places at: " + position4);
		switch (position4) {
		case 1:
			a1="O";
			System.out.println(a1+"  "+a2+" "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+" "+c2+" "+c3);
			break;
		case 2:
			a2="O";
			System.out.println(a1+" "+a2+"  "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+" "+c2+" "+c3);
			break;
		case 3:
			a3="O";
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+" "+c2+" "+c3);
			break;
		case 4:
			b1="O";
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+"  "+b2+" "+b3+"\n"+c1+" "+c2+" "+c3);
			break;
		case 5:
			b2="O";
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+" "+b2+"  "+b3+"\n"+c1+" "+c2+" "+c3);
			break;
		case 6:
			b3="O";
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+" "+c2+" "+c3);
			break;
		case 7:
			c1="O";
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+"  "+c2+" "+c3);
			break;
		case 8:
			c2="O";
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+" "+c2+"  "+c3);
			break;
		default:
			c3="O";
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+" "+c2+" "+c3);
		}
		System.out.print("enter positon you wish to place mark: ");
		int position5 = input.nextInt();
		if (position5 == position1 || position5==position2 || position5==position3 || position5==position4|| position5>9) {
			if (position5<9)  
				position5+=1;
			else 
				position5=9;}
		if (position5 == position1 || position5==position2 || position5==position3 || position5==position4) {
			if (position5<9)  
				position5+=1;
			else 
				position5-=1;}
		if (position5 == position1 || position5==position2 || position5==position3 || position5==position4) {
			if (position5<8)  
				position5+=1;
			else 
				position5-=1;}
		if (position5 == position1 || position5==position2 || position5==position3 || position5==position4) {
			if (position5<7)  
				position5+=1;
			else 
				position5-=1;}
		if (position5 == position1 || position5==position2 || position5==position3 || position5==position4) {
			if (position5<6)  
				position5+=1;
			else 
				position5-=1;}
		switch (position5) {
		case 1:
			a1="X";
			System.out.println(a1+"  "+a2+" "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+" "+c2+" "+c3);
			break;
		case 2:
			a2="X";
			System.out.println(a1+" "+a2+"  "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+" "+c2+" "+c3);
			break;
		case 3:
			a3="X";
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+" "+c2+" "+c3);
			break;
		case 4:
			b1="X";
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+"  "+b2+" "+b3+"\n"+c1+" "+c2+" "+c3);
			break;
		case 5:
			b2="X";
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+" "+b2+"  "+b3+"\n"+c1+" "+c2+" "+c3);
			break;
		case 6:
			b3="X";
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+" "+c2+" "+c3);
			break;
		case 7:
			c1="X";
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+"  "+c2+" "+c3);
			break;
		case 8:
			c2="X";
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+" "+c2+"  "+c3);
			break;
		default:
			c3="X";
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+" "+c2+" "+c3);
		}
		if(((a1=="X"||a1=="O")&&(a1==a2&&a1==a3))||((b1=="X"||b1=="O")&&(b1==b2&&b1==b3))||((c1=="X"||c1=="O")&&(c1==c2&&c1==c3))||((a1=="X"||a1=="O")&&(a1==b2&&a1==c3))||((a3=="X"||a3=="O")&&(a3==b2&&a3==c1))||((a1=="X"||a1=="O")&&(a1==b1&&a1==c1))||((a2=="X"||a2=="O")&&(a2==b2&&a2==c2))||((a3=="X"||a3=="O")&&(a3==b3&&a3==c3))) {
			System.out.println("You have Won");}
		else {
		
		int position6 = 1+(random.nextInt(9-1));
		if (position6 == position1 || position6==position2 || position6==position3 || position6==position4 || position6==position5 || position6>9) {
			if (position6<9)  
				position6+=1;
			else 
				position6=9;}
		if (position6 == position1 || position6==position2 || position6==position3 || position6==position4 || position6==position5) {
			if (position6<9)  
				position6+=1;
			else 
				position6-=1;}
		if (position6 == position1 || position6==position2 || position6==position3 || position6==position4 || position6==position5) {
			if (position6<8)  
				position6+=1;
			else 
				position6-=1;}
		if (position6 == position1 || position6==position2 || position6==position3 || position6==position4 || position6==position5) {
			if (position6<7)  
				position6+=1;
			else 
				position6-=1;}
		if (position6 == position1 || position6==position2 || position6==position3 || position6==position4 || position6==position5) {
			if (position6<6)  
				position6+=1;
			else 
				position6-=1;}
		if (position6 == position1 || position6==position2 || position6==position3 || position6==position4 || position6==position5) {
			if (position6<5)  
				position6+=1;
			else 
				position6-=1;}
		System.out.println("computer places at: " + position6);
		
		switch (position6) {
		case 1:
			a1="O";
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+" "+c2+" "+c3);
			break;
		case 2:
			a2="O";
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+" "+c2+" "+c3);
			break;
		case 3:
			a3="O";
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+" "+c2+" "+c3);
			break;
		case 4:
			b1="O";
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+" "+c2+" "+c3);
			break;
		case 5:
			b2="O";
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+" "+c2+" "+c3);
			break;
		case 6:
			b3="O";
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+" "+c2+" "+c3);
			break;
		case 7:
			c1="O";
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+" "+c2+" "+c3);
			break;
		case 8:
			c2="O";
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+" "+c2+" "+c3);
			break;
		default:
			c3="O";
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+" "+c2+" "+c3);
		}		
		if(((a1=="X"||a1=="O")&&(a1==a2&&a1==a3))||((b1=="X"||b1=="O")&&(b1==b2&&b1==b3))||((c1=="X"||c1=="O")&&(c1==c2&&c1==c3))||((a1=="X"||a1=="O")&&(a1==b2&&a1==c3))||((a3=="X"||a3=="O")&&(a3==b2&&a3==c1)||((a1=="X"||a1=="O")&&(a1==b1&&a1==c1))||((a2=="X"||a2=="O")&&(a2==b2&&a2==c2))||((a3=="X"||a3=="O")&&(a3==b3&&a3==c3)))) {
			System.out.println("Computer has Won");}
		else {
		System.out.print("enter positon you wish to place mark: ");
		int position7 = input.nextInt();
		if (position7 == position1 || position7==position2 || position7==position3 || position7==position4 || position7==position5 || position7==position6|| position7>9) {
			if (position7<9)  
				position7+=1;
			else 
				position7=9;}
		if (position7 == position1 || position7==position2 || position7==position3 || position7==position4 || position7==position5 || position7==position6) {
			if (position7<9)  
				position7+=1;
			else 
				position7-=1;}
		if (position7 == position1 || position7==position2 || position7==position3 || position7==position4 || position7==position5 || position7==position6) {
			if (position7<8)  
				position7+=1;
			else 
				position7-=1;}
		if (position7 == position1 || position7==position2 || position7==position3 || position7==position4 || position7==position5 || position7==position6) {
			if (position7<7)  
				position7+=1;
			else 
				position7-=1;}
		if (position7 == position1 || position7==position2 || position7==position3 || position7==position4 || position7==position5 || position7==position6) {
			if (position7<6)  
				position7+=1;
			else 
				position7-=1;}
		if (position7 == position1 || position7==position2 || position7==position3 || position7==position4 || position7==position5 || position7==position6) {
			if (position7<5)  
				position7+=1;
			else 
				position7-=1;}
		if (position7 == position1 || position7==position2 || position7==position3 || position7==position4 || position7==position5 || position7==position6) {
			if (position7<4)  
				position7+=1;
			else 
				position7-=1;}
		if (position7 == position1 || position7==position2 || position7==position3 || position7==position4 || position7==position5 || position7==position6) {
			if (position7<3)  
				position7+=1;
			else 
				position7-=1;}
		switch (position7) {
		case 1:
			a1="X";
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+" "+c2+" "+c3);
			break;
		case 2:
			a2="X";
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+" "+c2+" "+c3);
			break;
		case 3:
			a3="X";
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+" "+c2+" "+c3);
			break;
		case 4:
			b1="X";
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+" "+c2+" "+c3);
			break;
		case 5:
			b2="X";
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+" "+c2+" "+c3);
			break;
		case 6:
			b3="X";
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+" "+c2+" "+c3);
			break;
		case 7:
			c1="X";
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+" "+c2+" "+c3);
			break;
		case 8:
			c2="X";
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+" "+c2+" "+c3);
			break;
		default:
			c3="X";
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+" "+c2+" "+c3);
		}		
		if(((a1=="X"||a1=="O")&&(a1==a2&&a1==a3))||((b1=="X"||b1=="O")&&(b1==b2&&b1==b3))||((c1=="X"||c1=="O")&&(c1==c2&&c1==c3))||((a1=="X"||a1=="O")&&(a1==b2&&a1==c3))||((a3=="X"||a3=="O")&&(a3==b2&&a3==c1))||((a1=="X"||a1=="O")&&(a1==b1&&a1==c1))||((a2=="X"||a2=="O")&&(a2==b2&&a2==c2))||((a3=="X"||a3=="O")&&(a3==b3&&a3==c3))) {
			System.out.println("You have Won");}
		else {
		int position8 = 1+(random.nextInt(9-1));
		System.out.println(position8);
		if (position8 == position1 || position8==position2 || position8==position3 || position8==position4 || position8==position5 ||position8==position6|| position8==position7|| position8>9) {
			if (position8<9)  
				position8+=1;
			else 
				position8=9;}
		if (position8 == position1 || position8==position2 || position8==position3 || position8==position4 || position8==position5 ||position8==position6|| position8==position7) {
			if (position8<9)  
				position8+=1;
			else 
				position8-=1;}
		if (position8 == position1 || position8==position2 || position8==position3 || position8==position4 || position8==position5 ||position8==position6|| position8==position7) {
			if (position8<8)  
				position8+=1;
			else 
				position8-=1;}
		if (position8 == position1 || position8==position2 || position8==position3 || position8==position4 || position8==position5 ||position8==position6|| position8==position7) {
			if (position8<7)  
				position8+=1;
			else 
				position8-=1;}
		if (position8 == position1 || position8==position2 || position8==position3 || position8==position4 || position8==position5||position8==position6 || position8==position7) {
			if (position8<6)  
				position8+=1;
			else 
				position8-=1;}
		if (position8 == position1 || position8==position2 || position8==position3 || position8==position4 || position8==position5 ||position8==position6|| position8==position7) {
			if (position8<5)  
				position8+=1;
			else 
				position8-=1;}
		if (position8 == position1 || position8==position2 || position8==position3 || position8==position4 || position8==position5||position8==position6 || position8==position7) {
			if (position8<4)  
				position8+=1;
			else 
				position8-=1;}
		if (position8 == position1 || position8==position2 || position8==position3 || position8==position4 || position8==position5||position8==position6 || position8==position7) {
			if (position8<3)  
				position8+=1;
			else 
				position8-=1;}
		if (position8 == position1 || position8==position2 || position8==position3 || position8==position4 || position8==position5||position8==position6 || position8==position7) {
			if (position8<2)  
				position8+=1;
			else 
				position8-=1;}
		System.out.println(position8);
		System.out.println("computer places at: " + position8);
		switch (position8) {
		case 1:
			a1="O";
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+" "+c2+" "+c3);
			break;
		case 2:
			a2="O";
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+" "+c2+" "+c3);
			break;
		case 3:
			a3="O";
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+" "+c2+" "+c3);
			break;
		case 4:
			b1="O";
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+" "+c2+" "+c3);
			break;
		case 5:
			b2="O";
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+" "+c2+" "+c3);
			break;
		case 6:
			b3="O";
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+" "+c2+" "+c3);
			break;
		case 7:
			c1="O";
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+" "+c2+" "+c3);
			break;
		case 8:
			c2="O";
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+" "+c2+" "+c3);
			break;
		default:
			c3="O";
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+" "+c2+" "+c3);
		}
		if(((a1=="X"||a1=="O")&&(a1==a2&&a1==a3))||((b1=="X"||b1=="O")&&(b1==b2&&b1==b3))||((c1=="X"||c1=="O")&&(c1==c2&&c1==c3))||((a1=="X"||a1=="O")&&(a1==b2&&a1==c3))||((a3=="X"||a3=="O")&&(a3==b2&&a3==c1))||((a1=="X"||a1=="O")&&(a1==b1&&a1==c1))||((a2=="X"||a2=="O")&&(a2==b2&&a2==c2))||((a3=="X"||a3=="O")&&(a3==b3&&a3==c3))) {
			System.out.println("Computer has Won");}
		else {
		System.out.print("enter positon you wish to place mark: ");
		int position9 = input.nextInt();
		if (position9 == position1 || position9==position2 || position9==position3 || position9==position4 || position9==position5 ||position9==position6|| position9==position7 || position9==position8|| position9>9) {
			if (position9<9)  
				position9+=1;
			else 
				position9=1;}
		if (position9 == position1 || position9==position2 || position9==position3 || position9==position4 || position9==position5 ||position9==position6|| position9==position7 || position9==position8) {
			if (position9<9)  
				position9+=1;
			else 
				position9-=1;}
		if (position9 == position1 || position9==position2 || position9==position3 || position9==position4 || position9==position5||position9==position6 || position9==position7 || position9==position8) {
			if (position9<8)  
				position9+=1;
			else 
				position9-=1;}
		if (position9 == position1 || position9==position2 || position9==position3 || position9==position4 || position9==position5||position9==position6 || position9==position7 || position9==position8) {
			if (position9<7)  
				position9+=1;
			else 
				position9-=1;}
		if (position9 == position1 || position9==position2 || position9==position3 || position9==position4 || position9==position5 ||position9==position6|| position9==position7 || position9==position8) {
			if (position9<6)  
				position9+=1;
			else 
				position9-=1;}
		if (position9 == position1 || position9==position2 || position9==position3 || position9==position4 || position9==position5 ||position9==position6|| position9==position7 || position9==position8) {
			if (position9<5)  
				position9+=1;
			else 
				position9-=1;}
		if (position9 == position1 || position9==position2 || position9==position3 || position9==position4 || position9==position5||position9==position6 || position9==position7 || position9==position8) {
			if (position9<4)  
				position9+=1;
			else 
				position9-=1;}
		if (position9 == position1 || position9==position2 || position9==position3 || position9==position4 || position9==position5 ||position9==position6|| position9==position7 || position9==position8) {
			if (position9<3)  
				position9+=1;
			else 
				position9-=1;}
		if (position9 == position1 || position9==position2 || position9==position3 || position9==position4 || position9==position5 ||position9==position6|| position9==position7 || position9==position8) {
			if (position9<2)  
				position9+=1;
			else 
				position9-=1;}
		switch (position9) {
		case 1:
			a1="X";
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+" "+c2+" "+c3);
			break;
		case 2:
			a2="X";
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+" "+c2+" "+c3);
			break;
		case 3:
			a3="X";
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+" "+c2+" "+c3);
			break;
		case 4:
			b1="X";
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+" "+c2+" "+c3);
			break;
		case 5:
			b2="X";
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+" "+c2+" "+c3);
			break;
		case 6:
			b3="X";
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+" "+c2+" "+c3);
			break;
		case 7:
			c1="X";
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+" "+c2+" "+c3);
			break;
		case 8:
			c2="X";
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+" "+c2+" "+c3);
			break;
		default:
			c3="X";
			System.out.println(a1+" "+a2+" "+a3+"\n"+b1+" "+b2+" "+b3+"\n"+c1+" "+c2+" "+c3);
		}
		if(((a1=="X"||a1=="O")&&(a1==a2&&a1==a3))||((b1=="X"||b1=="O")&&(b1==b2&&b1==b3))||((c1=="X"||c1=="O")&&(c1==c2&&c1==c3))||((a1=="X"||a1=="O")&&(a1==b2&&a1==c3))||((a3=="X"||a3=="O")&&(a3==b2&&a3==c1))||((a1=="X"||a1=="O")&&(a1==b1&&a1==c1))||((a2=="X"||a2=="O")&&(a2==b2&&a2==c2))||((a3=="X"||a3=="O")&&(a3==b3&&a3==c3))) {
			System.out.println("You have Won");}
		else
			System.out.println("It is a draw");
		}
		}
		}
		}
	}
}
		