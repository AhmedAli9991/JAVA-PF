
public class Address {
	String Hostel_no;
	String Room_no;
	int Room_capacity=4;
	public Address() {
		Hostel_no="Not Given";
		Room_no="Not Given";
	}
	public Address(String a,String b) {
		Hostel_no=a;
		Room_no=b;
	}
	public void print(){
		System.out.println("Hostel no is: "+Hostel_no);
		System.out.println("Room no is: "+Room_no);
	}
}
