//Made by:Ahmed Ali Regno:SP19-BCS-096 Section:3B
public class Student {
	String Name;
	String Rollno;
	String Address;
	String[]Subjects;
	public Student() {
		Name="Not given";
		Rollno="Not given";
		Address="Not given";
		Subjects=new String[1];
		Subjects[0]="Not given";
	}
	public Student(String a,String b,String c,String[]d) {
		Name=a;
		Rollno=b;
		Address=c;
		Subjects=new String[d.length];
		for(int i=0;i<d.length;i++) 
			Subjects[i]=d[i];
		
	}
	public String getName() {
		return Name;
	}
	public String getRollNumber() {
		return Rollno;
	}
	public void print() {
		System.out.println("Name is: "+Name);
		System.out.println("Roll Number is: "+Rollno);
		System.out.println("Address is: "+Address);
		System.out.print("Subjects: ");
		for(String i:Subjects)
			System.out.print(i+" ");
		System.out.println();
	}

}
