import java.util.Arrays;

public class Asci {

	public static void main(String[] args) {
		char[]c = {'a','b','x','s','c'};
		int[]ch = new int[c.length];
		for(int i=0;i<c.length;i++) {
			int x = (int)(c[i]);
			ch[i]=x;
		}
		Arrays.sort(ch);
		for(int i=0;i<c.length;i++) {
			char x =(char)(ch[i]);
			c[i]=x;
		}
		System.out.println(Arrays.toString(c));
	}
}
