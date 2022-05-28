import java.util.Arrays;
import java.util.Scanner;

public class sasa {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("leangth:");
		int x=in.nextInt();
		int arr[]=new int[x];
		for(int i=0;i<x;i++) {
			System.out.print("give number:");
			int y=in.nextInt();
			arr[i]=y;
		}
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		int sum=0;
		for(int i:arr) {
			System.out.print(i);
			sum=sum+i;
		}
		System.out.println();
		System.out.println(sum);
	}

}
