//Made by:Ahmed Ali Regno:SP19-BCS-096 Section:3B
public class Section {
	Student[]students;
	Student[]stu;

	public Section() {
		students=new Student[1];
		students[0]=new Student();
	}
	public Section(String a,String b,String c,String[] d) {
		students=new Student[1];
		students[0]=new Student(a,b,c,d);
	}
	public Section(Student[]arr) {
		students=new Student[arr.length];
		for(int i=0;i<arr.length;i++){
			students[i]=new Student();
			students[i]=arr[i];
		}
	}
	public void addStudent(String a,String b,String c,String[]d) {
		stu = new Student[students.length+1];
		for(int i=0;i<students.length;i++) {
			stu[i]=new Student();
			stu[i]=students[i];
		}
		stu[students.length]=new Student(a,b,c,d);
		students=new Student[stu.length];
		for(int i=0;i<students.length;i++) {
			students[i]=new Student();
			students[i]=stu[i];
		}
		
	}
	public void addStudent() {
		stu = new Student[students.length+1];
		for(int i=0;i<students.length;i++) {
			stu[i]=new Student();
			stu[i]=students[i];
		}
		stu[students.length]=new Student();
		students=new Student[stu.length];
		for(int i=0;i<students.length;i++) {
			students[i]=new Student();
			students[i]=stu[i];
		}
		
	}
	public void delStudent(String b) {
		int a=-1;
		for(int i=0;i<students.length;i++) {
			if(students[i].getName().equals(b)||students[i].getRollNumber().equals(b)) {
				a=i;
			}
		}
		if(a==-1) {
			System.out.println(b+" not found");
		}
		else {
			stu=new Student[students.length-1];
			for(int i=0;i<a;i++) {
				stu[i]=new Student();
				stu[i]=students[i];
		}	
			for(int i=a;i<stu.length;i++) {
				stu[i]=new Student();
				stu[i]=students[i+1];
		}	
			students=new Student[stu.length];
			for(int i=0;i<students.length;i++) {
				students[i]=new Student();
				students[i]=stu[i];
			}
		}
	}
	public void modifyStudent(String s) {
		int a=-1;
		for(int i=0;i<students.length;i++) {
			if(students[i].getName().equals(s)||students[i].getRollNumber().equals(s)) {
				a=i;
			}
		}
		if(a==-1) {
			System.out.println(s+" not found");
		}
		students[a]=new Student();
	}
	public void modifyStudent(String s,String a,String b,String c,String[]d) {
		int j=-1;
		for(int i=0;i<students.length;i++) {
			if(students[i].getName().equals(s)||students[i].getRollNumber().equals(s)) {
				j=i;
			}
		}
		if(j==-1) {
			System.out.println(s+" not found");
		}
		else {
			students[j]=new Student(a,b,c,d);
		}
	}
	public void searchStudent(String s) {
		int j=-1;
		for(int i=0;i<students.length;i++) {
			if(students[i].getName().equals(s)||students[i].getRollNumber().equals(s)) {
				j=i;
			}
		}
		if(j==-1) {
			System.out.println(s+" not found");
		}
		else {
			students[j].print();
		}
	}
	public void displayStudents() {
		for(int i=0;i<students.length;i++) {
			students[i].print();
		}
	}
}
