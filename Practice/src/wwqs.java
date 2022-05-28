import java.util.Arrays;
import java.util.Scanner;

public class wwqs {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int[]aa= {11,22312,1,3,35,4,5};
		int[]ba= {11,22312,1,3,35,4,5};
		int[]ca= {11,22312,1,3,35,4,5};
		bubble(aa);
		insertion(ba);
		selection(ca);
		System.out.println(Arrays.toString(aa));
		System.out.println(Arrays.toString(ba));
		System.out.println(Arrays.toString(ca));
	}
	public static void bubble(int[]s) {
		int x = 0;
		while(x==0) {
			x=1;
			for(int i=0;i<s.length-1;i++) {
				if(s[i]>s[i+1]) {
					int temp=s[i];
					s[i]= s[i+1];
					s[i+1]=temp;
					x=0;
				}
			}
		}

	}
	public static void insertion(int[]s) {
		for(int i=1;i<s.length;i++) {
			int key=s[i];
			int j=i-1;
			while(j>=0&&s[j]>key) {
				s[j+1]=s[j];
				j--;
			}
			s[j+1]=key;
		}
	}
	public static void selection(int[]b) {
		for(int i=0;i<b.length-1;i++) {
			int key=i;
			for(int j=i+1;j<b.length;j++) {
				if(b[key]>b[j]) {
					key=j;
				}
			}
			if(key!=i) {
				int temp=b[i];
				b[i]=b[key];
				b[key]=temp;
			}
		}
	}
}
