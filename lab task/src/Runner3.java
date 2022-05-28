import java.util.Scanner;

public class Runner3 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String[]ab={"english","urdu","math"};
		Section B = new Section("ahemd","1","86",ab);
		Section C = new Section("ALi","50","96",ab);
        int opt=0;
		do{
        	int c;
        	System.out.println("Press 1 to access class B");
        	System.out.println("Press 2 to access class C");
        	c=input.nextInt();
        	System.out.println("Add Student      [1]");
            System.out.println("Delete Student   [2]");
            System.out.println("Modify Student   [3]");
            System.out.println("Search Student   [4]");
            System.out.println("View Student     [5]");
            System.out.println("Exit             [0]");
            opt = input.nextInt();
            if(opt==1) {
            	 System.out.println("add student with Empty parameters[1]");
                 System.out.println("add student with 4 parameters    [2]");
                 int r=input.nextInt();
                 switch(r){
               		case 1:
               			if(c==1) 
               				B.addStudent();
               			else if(c==2)
               				C.addStudent();
               			break;
               		case 2:
               			if(c==1) { 
               				System.out.println("enter remaining parameters");
               				String aa=input.nextLine();
               				String b=input.nextLine();
               				String d=input.nextLine();
               				System.out.println("Enter number of subjects");
               				int size=input.nextInt();
               				String[]sub=new String[size];
               				System.out.println("Enter subjects");
               				for(int i=0;i<size;i++) {
               					sub[i]=input.nextLine();
               				}
               				B.addStudent(aa,b,d,sub);
               			}
               			else if(c==2) {
               				System.out.println("enter remaining parameters");
               				String aa=input.nextLine();
               				String b=input.nextLine();
               				String d=input.nextLine();
               				System.out.println("Enter number of subjects");
               				int size=input.nextInt();
               				String[]sub=new String[size];
               				System.out.println("Enter subjects");
               				for(int i=0;i<size;i++) {
               					sub[i]=input.nextLine();
               				}
               				C.addStudent(aa,b,d,sub);
              				
               			}
                   		break;
                 }
            }
            else if(opt==2) {
                System.out.println("Enter name or Rollnumber of the studnet you wanna delete.");
                if(c==1) {
                	String s = input.next();
                	B.delStudent(s);
                }
                else if(c==2) {
                	String s = input.next();
                	C.delStudent(s);
                }
            }
            else if(opt==3) {
                 	System.out.println("modify with 1 parameters[1]");
                    System.out.println("modify Contact with 5 parameters 	 [3]");
                    int r=input.nextInt();
                    switch(r){
                  		case 1:
                  			System.out.println("Enter name or number you wish to modify");
                  			String w = input.nextLine();
                  			if(c==1) 
                  				B.modifyStudent(w);
                  			else if(c==2)
                  				C.modifyStudent(w);
                  			break;
                  		case 2:
                  			System.out.println("Enter name or number you wish to modify");
                  			String w2 = input.nextLine();
                  			if(c==1) { 
                  				System.out.println("enter remaining parameters");
                  				String a=input.nextLine();
                  				String b=input.nextLine();
                  				String d=input.nextLine();
                  				System.out.println("Enter number of subjects");
                  				int size=input.nextInt();
                  				String[]sub=new String[size];
                  				System.out.println("Enter subjects");
                  				for(int i=0;i<size;i++) {
                  					sub[i]=input.nextLine();
                  				}
                  				B.modifyStudent(w2,a,b,d,sub);
                  			}
                  			else if(c==2) {
                  				System.out.println("enter remaining parameters");
                  				String a=input.nextLine();
                  				String b=input.nextLine();
                  				String d=input.nextLine();
                  				System.out.println("Enter number of subjects");
                  				int size=input.nextInt();
                  				String[]sub=new String[size];
                  				System.out.println("Enter subjects");
                  				for(int i=0;i<size;i++) {
                  					sub[i]=input.nextLine();
                  				}
                  				C.modifyStudent(w2,a,b,d,sub);
                 				
                  			}
                      		break;
                    }
               }
            else if(opt==4) {
            	if(c==1) {
            		String SEARCH;
                   	System.out.println("Enter name or number of the contact you wanna search.");
                   	SEARCH = input.next();
                   	B.searchStudent(SEARCH);}
            	else if(c==2) {
            		String SEARCH;
                    System.out.println("Enter name or number of the contact you wanna search.");
                    SEARCH = input.next();
                    C.searchStudent(SEARCH);}
            
            	}
            
            else if(opt==5) {
                if(c==1) 
                	B.displayStudents();
                else if(c==2) 
                	C.displayStudents();
           	}
        }while(opt != 0);
	}
}
