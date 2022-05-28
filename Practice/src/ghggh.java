import java.util.Scanner;

public class ghggh {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[]nums=new int[100];
		int[]check=new int[100];
		for(int i=0;i<nums.length;i++)
			nums[i]=i+1;
		System.out.print("enter number");
		int x = input.nextInt();
		while(x!=0) {
			if(x<=100) {
				for(int i=0;i<nums.length;i++) {
					if(x==nums[i]) {
						++check[i];
					}
				}
			}
			System.out.print("enter number");
			x = input.nextInt();
		}
		for(int i=0;i<100;i++) {
			System.out.println(nums[i]+"occurs"+check[i]+"times");
		}
	}

}
