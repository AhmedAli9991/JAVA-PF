import java.util.Arrays;
import java.util.Scanner;

public class arr2 {

	public static void main(String[] args) {
		long sum=0;
		Scanner in= new Scanner(System.in);
		int y=in.nextInt();
		int arr1[]=new int [y];
		for(int i=0;i<y;i++) {
			System.out.print("enter number at index "+i+":");
			int x = in.nextInt();
			arr1[i]=x;
		}
		System.out.println(Arrays.toString(arr1));
		for(int i:arr1) {
			sum=sum+i;
		}
		System.out.println(sum);
	}

}
