
import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Give length of array: ");
		int len = input.nextInt();
		int[]array_1 = new int [len];
		int[]array_2 = new int [len];
		for(int i=0;i<len;i++) {
			System.out.print("Enter number in array: ");
			int num = input.nextInt();
			array_1[i] = num;
		}
		System.out.print("Members of array1: ");
		for(int i:array_1) 
			System.out.print(i+" ");
		System.out.println();
		arraycopy(array_1,array_2);
		System.out.print("Members of array2: ");
		for(int i:array_2) 
			System.out.print(i+" ");
		
	}

	public static void arraycopy(int[]x, int[]y) {
		for(int i=0;i<x.length;i++) 
			y[i]=x[i];
		
	}

}
