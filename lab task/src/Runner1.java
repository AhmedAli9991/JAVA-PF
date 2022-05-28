import java.util.Scanner;

public class Runner1 {

	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
        int opt;
        PhoneBook pb=new PhoneBook("none","none","none");
        do{
            System.out.println("Add Contact      [1]");
            System.out.println("Delete Contact   [2]");
            System.out.println("Modify Contact   [3]");
            System.out.println("Search Contact   [4]");
            System.out.println("View Contact     [5]");
            System.out.println("Exit             [0]");
            opt = input.nextInt();
            if(opt==1) {
            	 System.out.println("add Contact with Empty parameters[1]");
                 System.out.println("add Contact with 3 parameters  	 [2]");
                 System.out.println("add Contact with 4 parameters 	 [3]");
                 int r=input.nextInt();
                 switch(r){
               		case 1:
               			pb.addContact();
               			break;
               		case 2:
               			String a=input.nextLine();
               			String b=input.nextLine();
               			String c=input.nextLine();
               			pb.addContact(a,b,c);
                   		break;
               		case 3:
               			String d=input.nextLine();
               			String e=input.nextLine();
               			String f=input.nextLine();
               			String g=input.nextLine();
               			pb.addContact(d,e,f,g);
                   		break;
                 }
            }
            else if(opt==2) {
                System.out.println("Enter name or number of the contact you wanna delete.");
                String s = input.next();
                pb.delContact(s);
         
            }
            else if(opt==3) {
                 	System.out.println("modify with 1 parameters[1]");
                    System.out.println("modify Contact with 4 parameters  	 [2]");
                    System.out.println("modify Contact with 5 parameters 	 [3]");
                    int r=input.nextInt();
                    switch(r){
                  		case 1:
                  			System.out.println("Enter name or number you wish to modify");
                  			String w = input.nextLine();
                  			pb.modifyContact(w);
                  			break;
                  		case 2:
                  			System.out.println("Enter name or number you wish to modify");
                  			String w1 = input.nextLine();
                  			System.out.println("Enter rest pf the parametrs");
                  			String a=input.nextLine();
                  			String b=input.nextLine();
                  			String c=input.nextLine();
                  			pb.addContact(a,b,c);
                      		break;
                  		case 3:
                  			System.out.println("Enter name or number you wish to modify");
                  			String w2 = input.nextLine();
                  			System.out.println("Enter rest pf the parametrs");
                  			String d=input.nextLine();
                  			String e=input.nextLine();
                  			String f=input.nextLine();
                  			String g=input.nextLine();
                  			pb.addContact(d,e,f,g);
                      		break;
                    }
            }
            else if(opt==4) {
            	   String SEARCH;
                   System.out.println("Enter name or number of the contact you wanna search.");
                   SEARCH = input.next();
                   pb.searchContact(SEARCH); 
            }
            else if(opt==5) {
                pb.displayContacts();
            }
        }while(opt != 0);
       
	}

}
