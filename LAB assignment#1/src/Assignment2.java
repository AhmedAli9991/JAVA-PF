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
		System.out.print("Members of array2 before arraycopy: ");
		for(int i:array_2) 
			System.out.print(i+" ");
		System.out.println();
		System.out.print("give from where to start in array 1");
		int st=input.nextInt();
		System.out.print("give from where to end in array 1 length");
		int end=input.nextInt();
		System.out.print("give from where to start in array 2");
		int des=input.nextInt();
		arraycopy(array_1,st,array_2,des,end);
		System.out.print("Members of array2 after array 2 arraycopy: ");
		for(int i:array_2) 
			System.out.print(i+" ");
	}
	public static void arraycopy(int source[],int start,int dest[],int to,int till) {
		for(int i=start;i<till;i++) { 
			dest[to]=source[i];
			to++;
		}
	}
}
