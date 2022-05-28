import java.util.Arrays;
import java.util.Scanner;

public class Aa {

	public static void main(String[] args) {
		int[][]z=new int[2][];
		Scanner  in = new Scanner(System.in);
		for(int i=0;i<z.length;i++) {
			System.out.print("Enter size of array: ");
			int x = in.nextInt();
			z[i]=new int[x];
		}
	
		for(int i=0;i<z.length;i++) {
			for(int j=0;j<z[i].length;j++) {
				System.out.print("Enter value  of array: ");
				int y = in.nextInt();
				z[i][j]=y;
			}
		}
		System.out.println(Arrays.deepToString(z));
	}

}
