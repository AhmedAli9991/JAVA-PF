
public class Adress {
	String Hostel_no;
	String Room_no;
	int Room_capacity;
	public Adress() {
		Hostel_no="Not Given";
		Room_no="Not Given";
	}
	public Adress(String a,String b,int c) {
		Hostel_no=a;
		Room_no=b;
		Room_capacity=c;
	}
	public void getCapacity() {
		System.out.println(Room_capacity);
	}
	public void print() {
		System.out.println("Hostel no: "+Hostel_no);
		System.out.println("Room no: "+Room_no);
		System.out.println("Room capacity: "+Room_capacity);
			
	}
	
}
