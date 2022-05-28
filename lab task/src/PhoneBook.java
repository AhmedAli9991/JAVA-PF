
//Made by:Ahmed Ali Regno:SP19-BCS-096 Section:3B
public class PhoneBook {
	Contact[]contact;
	Contact[]con;

	public PhoneBook() {
		contact=new Contact[1];
		contact[0]=new Contact();
	}
	public PhoneBook(String a,String b,String c) {
		contact=new Contact[1];
		contact[0]=new Contact(a,b,c);
	}
	public PhoneBook(String a,String b,String c,String d) {
		contact=new Contact[1];
		contact[0]=new Contact(a,b,c,d);
	}
	public PhoneBook(Contact[]arr) {
		contact=new Contact[arr.length];
		for(int i=0;i<arr.length;i++){
			contact[i]=new Contact();
			contact[i]=arr[i];
		}
	}
	public void addContact(String a,String b,String c,String d) {
		con = new Contact[contact.length+1];
		for(int i=0;i<contact.length;i++) {
			con[i]=new Contact();
			con[i]=contact[i];
		}
		con[contact.length]=new Contact(a,b,c,d);
		contact=new Contact[con.length];
		for(int i=0;i<contact.length;i++) {
			contact[i]=new Contact();
			contact[i]=con[i];
		}
		
	}
	public void addContact(String a,String b,String c) {
		con = new Contact[contact.length+1];
		for(int i=0;i<contact.length;i++) {
			con[i]=new Contact();
			con[i]=contact[i];
		}
		con[contact.length]=new Contact(a,b,c);
		contact=new Contact[con.length];
		for(int i=0;i<contact.length;i++) {
			contact[i]=new Contact();
			contact[i]=con[i];
		}
		
	}
	public void addContact() {
		con = new Contact[contact.length+1];
		for(int i=0;i<contact.length;i++) {
			con[i]=new Contact();
			con[i]=contact[i];
		}
		con[contact.length]=new Contact();
		contact=new Contact[con.length];
		for(int i=0;i<contact.length;i++) {
			contact[i]=new Contact();
			contact[i]=con[i];
		}
	}
	public void delContact(String b) {
		int a=-1;
		for(int i=0;i<contact.length;i++) {
			if(contact[i].getName().equals(b)||contact[i].getNumber().equals(b)) {
				a=i;
			}
		}
		if(a==-1) {
			System.out.println(b+" not found");
		}
		else {
			con=new Contact[contact.length-1];
			for(int i=0;i<a;i++) {
				con[i]=new Contact();
				con[i]=contact[i];
		}	
			for(int i=a;i<con.length;i++) {
				con[i]=new Contact();
				con[i]=contact[i+1];
		}	
			contact=new Contact[con.length];
			for(int i=0;i<contact.length;i++) {
				contact[i]=new Contact();
				contact[i]=con[i];
			}
		}
	}
	public void modifyContact(String s) {
		int a=-1;
		for(int i=0;i<contact.length;i++) {
			if(contact[i].getName().equals(s)||contact[i].getNumber().equals(s)) {
				a=i;
			}
		}
		if(a==-1) {
			System.out.println(s+" not found");
		}
		contact[a]=new Contact();
	}
	public void modifyContact(String s,String a,String b,String c) {
		int j=0;
		for(int i=0;i<contact.length;i++) {
			if(contact[i].getName().equals(s)||contact[i].getNumber().equals(s)) {
				j=i;
			}
		}
		if(j==-1) {
			System.out.println(s+" not found");
		}
		else {
			contact[j]=new Contact(a,b,c);
		}
	}
	public void modifyContact(String s,String a,String b,String c,String d) {
		int j=-1;
		for(int i=0;i<contact.length;i++) {
			if(contact[i].getName().equals(s)||contact[i].getNumber().equals(s)) {
				j=i;
			}
		}
		if(j==-1) {
			System.out.println(s+" not found");
		}
		else {
		contact[j]=new Contact(a,b,c,d);
		}
	}
	public void searchContact(String s) {
		int j=-1;
		for(int i=0;i<contact.length;i++) {
			if(contact[i].getName().equals(s)||contact[i].getNumber().equals(s)) {
				j=i;
			}
		}
		if(j==-1) {
			System.out.println(s+" not found");
		}
		else {
		contact[j].print();
		}
	}
	public void displayContacts() {
		for(int i=0;i<contact.length;i++) {
			contact[i].print();
		}
	}
}
