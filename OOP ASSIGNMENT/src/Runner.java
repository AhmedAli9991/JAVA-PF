import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int opt=0;
		do {
			System.out.println("Enter 1 to enter CNIC or ISBN (without \"-\")");
			System.out.println("Enter 2 to view the Data");
			System.out.println("Enter 0 to Exit program");
			//all the data will be entered in file thus not lost
			opt=input.nextInt();
			switch(opt){
				case 1:
					Scanner in=new Scanner (System.in);
					System.out.print("Enter what you wish to enter: ");
					String a= in.nextLine();
					if(a.length()<13) {
						System.out.println("too short");}
					else {
						Enter_CNIC_ISBN cb=new Enter_CNIC_ISBN(a);
						}
				
					break;
				case 2:
					View v=new View();
					break;
				case 0:
					break;
				default:
					System.out.println("Invalid option");
			}
		}while(opt!=0);
		
	}

}
