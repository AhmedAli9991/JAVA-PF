import java.util.Arrays;
import java.util.Scanner;


public class arr3 {
public static void main(String[]args) {
		int[]a= {8,1,2,4,3};
		  boolean sorted = false;
		    int temp;
		    while(!sorted) {
		        sorted = true;
		        for (int i = 0; i < a.length - 1; i++) {
		            if (a[i] > a[i+1]) {
		                temp = a[i];
		                a[i] = a[i+1];
		                a[i+1] = temp;
		                sorted = false;
		            }System.out.println(Arrays.toString(a));
		        }
		    }
		System.out.println(Arrays.toString(a));
	}
}
