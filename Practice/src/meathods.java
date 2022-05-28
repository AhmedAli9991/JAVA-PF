
public class meathods {

	public static void main(String[] args) {
		int num=13;
		String x = "2";
		
		System.out.println(sum(num,x));
	}
	public static int sum(int a,int b) {
		int num3=a+b;
		System.out.println(1);
		return num3;
	}
	public static double sum(int a,String c) {
		int b=Integer.parseInt(c);
		double num3=a+b;
		System.out.println(4);
		return num3;
	}
	
	
	public static double sum(double a,double b) {
		double num3=a+b;
		System.out.println(3);
		return num3;
	}
	
	public static double sum(int a,double b) {
		double num3=a+b;
		System.out.println(4);
		return num3;
	}
	
}
