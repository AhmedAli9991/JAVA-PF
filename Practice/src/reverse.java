import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long g = input.nextLong();
		long y = rev(g);
		long x= y+ 123224343;
		System.out.println(y);
		System.out.println(x);
	}

	public static long rev(long g) {
		String y = g+"";
		char[]c= new char[y.length()];
		for(int i=0,j=y.length()-1;i<y.length();i++,j--) {
			c[i]= y.charAt(j);
		}
		String str1="";
		for(char i:c) {
			str1=str1+i;
		}
		long num= Long.parseLong(str1);
		return num;
	}

}
