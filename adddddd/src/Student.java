
public class Student {
	ID stdID;
	Adress someaddress;
	public Student(String N,String R,String  a,String b,int c) {
		stdID = new ID(N,R);
		someaddress = new Adress(a,b,c);
	}
	public void print() {
		stdID.print();
		someaddress.print();
	}
}
