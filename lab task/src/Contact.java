//Made by:Ahmed Ali Regno:SP19-BCS-096 Section:3B
public class Contact {
	private String Name;
	private String CountryCode;
	private String Number;
	private String Type;
	public Contact() {
		this("0","0","0","None");
	}
	public Contact(String a,String b,String c,String d) {
		Name = a;
		CountryCode	= b;
		Number	= c;
		Type = d;
	}
	public Contact(String a,String b,String c) {
		this(a,b,c,"none");
	}
	public void setName(String a) {
		Name=a;
	}
	public void setNumber(String a) {
		Number=a;
	}
	public void setType(String a) {
		Type=a;
	}
	public String getName() {
		return Name;
	}
	public String getNumber() {
		return Number;
	}
	public String getInfo() {
		String result=Name+" "+CountryCode+" "+Number+" "+Type;
		return result;
		
	}
	public void print() {
		System.out.println("Name is: "+Name);
		System.out.println("Country Code is: "+CountryCode);
		System.out.println("Phone Number is: "+Number);
		System.out.println("Type of Contact is: "+Type);
		System.out.println();
	}
}
