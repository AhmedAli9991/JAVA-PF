//Made by:Ahmed Ali Regno:SP19-BCS-096 Section:3B
public class MyMath {
	//If integers are passed these Methods will still be invoked
	static int qsolve_count=0;
	static int getmax2_count=0;
	static int getmax3_count=0;
	static int getmin2_count=0;
	static int getmin3_count=0;
	public static double qSolve(double a,double b,double c) {
		qsolve_count++;
		double result = (-b+Math.sqrt(b*b-4*(a)*(c)))/2*(a);
		return result ;
	}
	public static double getMax(double a,double b) {
		getmax2_count++;
		if(a>b)
			return a;
		else if(b>a)
			return b;
		else 
			return 0;
	}
	public static double getMax(double a,double b,double c){
		getmax3_count++;
		if(a>b&&a>c)
			return a;
		else if(b>a&&b>c)
			return b;
		else if(c>a&&c>b)
			return c;
		else 
			return 0;
	}
	public static double getMin(double a,double b) {
		getmin2_count++;
		if(a<b)
			return a;
		else if(b<a)
			return b;
		else 
			return 0;
	}
	public static double getMin(double a,double b,double c){
		getmin3_count++;
		if(a<b&&a<c)
			return a;
		else if(b<a&&b<c)
			return b;
		else if(c<a&&c<b)
			return c;
		else 
			return 0;
	}
	public static void count() {
		System.out.println("qSolve invoked "+qsolve_count+" times");
		System.out.println("get max for 2 digits invoked "+getmax2_count+" times");
		System.out.println("get max for 3 digits invoked "+getmax3_count+" times");
		System.out.println("get min for 2 digits invoked "+getmin2_count+" times");
		System.out.println("get min for 3 digits invoked "+getmin3_count+" times");
	}
		
}
