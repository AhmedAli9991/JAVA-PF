import java.util.*;
import java.io.*;
import javax.swing.*;
public class SemesterProject {
	public static void main(String[]args)throws IOException,FileNotFoundException {
		String[][]StudentRecords = null;
		String[][]TeacherRecords = null;
		File file = new File("StudentsRecords.txt");
		file.createNewFile();
		File file2 = new File("FacultyRecords.txt");
		file2.createNewFile();
		System.out.println(file2.exists());
		Scanner input = new Scanner(System.in);
		int Choice;
		String Username = "admin";
		String Password = "admin1234";
		for(int i = 3; i>0;i--) {
			String GuessUsername = JOptionPane.showInputDialog("Enter username");
			String GuessPassword = JOptionPane.showInputDialog("Enter Password");
			if(GuessUsername.equals(Username) && GuessPassword.equals(Password)) {
				JOptionPane.showMessageDialog(null, "Successfully Logged In!"+"\n"+"---------------------------------------------------------------------"+"\n"+"WELCOME TO LEARNING MANAGEMENT SYSTEM"+"\n"+"---------------------------------------------------------------------");
				break;
			}
			else if (!GuessUsername.equals(Username) || !GuessPassword.equals(Password)) {
				JOptionPane.showMessageDialog(null,"Wronng username or Password ");
			}
			JOptionPane.showMessageDialog(null, "You have "+(i-1)+" try(s) left");
			if (i<=1) {
			    JOptionPane.showMessageDialog(null, "You entered wrong username or password multiple times! GOODBYE");
				System.exit(0);
			}
		}
		while(true) {
			try{
				String choice = JOptionPane.showInputDialog("Enter 1 for Student Panel"+"\n"+"Enter 2 for Teacher Panel"+"\n"+"Enter 3 to end Program");
				int Choice1 = Integer.parseInt(choice);
				
				if (Choice1 == 1)
				{
					StudentPanel(file,StudentRecords);
				}	
				else if (Choice1 == 2)
				{
					TeacherPanel(file2,TeacherRecords);
				}
				else if (Choice1 == 3)
				{
					System.exit(0);
				}
				else {
					System.out.print("Wrong input!"+"\n"+"Please Try Again!"+"\n");
				}
			}catch(IOException ex) {
				System.out.println("Input Output Error!");
			}
		
	}
		}
public static void StudentPanel(File file,String[][]StudentRecords)throws IOException,FileNotFoundException
{
	File file3 = new File("EdittedStudentsRecords.txt");
	BufferedReader reader = new BufferedReader(new FileReader(file));
	String line = "",oldtext = "";
	while((line = reader.readLine()) != null)
	{
		oldtext += line + "\n";
	}
	reader.close();
	System.out.println(oldtext);
	String Rollno,Name,Department,Semester;
	Scanner input = new Scanner(System.in);
	Scanner input1 = new Scanner(file);
	PrintWriter output = new PrintWriter(new FileWriter(file,true));
	PrintWriter output2 = new PrintWriter(new FileWriter(file3,true));
	JOptionPane.showMessageDialog(null, "WELCOME TO THE STUDENTS PANEL!");
	while(true)
	{
	String Choice = JOptionPane.showInputDialog("Enter 1 to add records"+"\n"+"Enter 2 to view records"+"\n"+"Enter 3 to Search Records"+"\n"+"Enter 4 to Edit Records"+"\n"+"Enter any number to exit");
	int choice = Integer.parseInt(Choice);
	if(choice == 1)
	{
		
			String Length = JOptionPane.showInputDialog("Enter the number of Students you want to add record for");
			int length = Integer.parseInt(Length);
			StudentRecords = new String[length][4];
			for(int i=0;i<length;i++)
			{
				Rollno = JOptionPane.showInputDialog("Enter roll no of Student");
				StudentRecords[i][0] = Rollno;
				for(int k = i;k<(i+1);k++) 
				{
					Name = JOptionPane.showInputDialog("Enter Name of Student");
					StudentRecords[k][1] = Name;
				}
				for(int l = i ;l<(i+1);l++)
				{
					Department = JOptionPane.showInputDialog("Enter Department of Student");
					StudentRecords[l][2] = Department;
				}
				for(int j = i;j<(i+1);j++)
					
				{
					Semester = JOptionPane.showInputDialog("Enter Semester of Student");
					StudentRecords[j][3] = Semester;
				}
				
			
			
				
			}
			for(int x = 0;x<length;x++) {
				for(int y = 0;y<4;y++) {
					output.println(StudentRecords[x][y]);
					output2.println(StudentRecords[x][y]);
					
				}
			}
			output.close();
			output2.close();
			break;
		}
		
	
	else if(choice == 2)
	{
			while(input1.hasNextLine())
			{
				String i = input1.nextLine();
				JOptionPane.showMessageDialog(null, i);
			}
		break;
	}
	else if(choice == 3)
	{
		if(file3 != null)
		{
			Scanner input2 = new Scanner(file3);
			String i,j;
			String RollNo = JOptionPane.showInputDialog("Enter the Roll no of student you want to Search.");
			while(input2.hasNext())
			{
				j = input2.nextLine();
				if(j.matches(RollNo))
				{
					JOptionPane.showMessageDialog(null,"Roll no: "+j);
					j = input2.nextLine();
					JOptionPane.showMessageDialog(null,"Name: "+j);
					j = input2.nextLine();
					JOptionPane.showMessageDialog(null,"Department: "+j);
					j = input2.nextLine();
					JOptionPane.showMessageDialog(null,"Semester "+j);
					break;
				}
				if(!input2.hasNext()) {
					JOptionPane.showMessageDialog(null, "Uh Oh! The Entered Roll no Doesn't Exist.");
						}
		}
		}
		else
		{
			String i,j;
			String RollNo = JOptionPane.showInputDialog("Enter the Roll no of student you want to Search.");
			while(input1.hasNext())
			{
				j = input1.nextLine();
				if(j.matches(RollNo))
				{
					JOptionPane.showMessageDialog(null,"Roll no: "+j);
					j = input1.nextLine();
					JOptionPane.showMessageDialog(null,"Name: "+j);
					j = input1.nextLine();
					JOptionPane.showMessageDialog(null,"Department: "+j);
					j = input1.nextLine();
					JOptionPane.showMessageDialog(null,"Semester "+j);
					break;
				}
				if(!input1.hasNext()) {
					JOptionPane.showMessageDialog(null, "Uh Oh! The Entered Roll no Doesn't Exist.");
						}
				
				
			}
			break;


		}
			}
	else if (choice == 4)
	{
		
		FileWriter writer = new FileWriter(file3);
		String i,j;
			String RollNO = JOptionPane.showInputDialog("Enter the roll no of the student you want to edit records of");
			while(input1.hasNext())
			{
				i = input1.nextLine();
				if(i.equals(RollNO))
				{
					String choose = JOptionPane.showInputDialog("Enter 1 if you want to edit the Roll no"+"\n"+"Enter 2 if you want to edit the Name"+"\n"+"Enter 3 if you want to edit the Department"+"\n"+"Enter 4 if you want to edit the Semester");
					int Choose = Integer.parseInt(choose);
					if(Choose == 1)
					{
						String rollno = JOptionPane.showInputDialog(null,"Enter the modified Roll no");
						String newText = oldtext.replaceAll(i, rollno);
						writer.write(newText);
						writer.close();
						break;
					}
					i = input1.nextLine();
					if(Choose == 2)
					{
						String name = JOptionPane.showInputDialog(null,"Enter the modified Name");
						String newt = oldtext.replaceAll(i, name);
						writer.write(newt);
						writer.close();
						break;
					}
					i = input1.nextLine();
					if(Choose == 3)
					{
						String department = JOptionPane.showInputDialog(null,"Enter the modified Department");
						String newtext = oldtext.replaceAll(i, department);
						writer.write(newtext);
						writer.close();
						break;
					}
					i = input1.nextLine();
					if(Choose == 4)
					{
						String semester = JOptionPane.showInputDialog(null,"Enter the modified Semester");
						String newT = oldtext.replaceAll(i, semester);
						writer.write(newT);
						writer.close();
						break;
					}
				}
				
			}
			
		}
	else
	{
		break;
	}
	}
}

public static void TeacherPanel(File file2,String[][]TeacherRecords)throws IOException,FileNotFoundException,NoSuchElementException
{
	File file3 = new File("EdittedTeacherRecords.txt");
	PrintWriter output1 = new PrintWriter(new FileWriter(file3,true));
	String TeacherID,TeacherName,TeacherDepartment,Qualification;
	BufferedReader reader = new BufferedReader(new FileReader(file2));
	PrintWriter output2 = new PrintWriter(new FileWriter(file2,true));
	BufferedWriter writer1 = new BufferedWriter(new FileWriter(file2,true));
	Scanner input2 = new Scanner(file3);
	Scanner input = new Scanner(System.in);
	Scanner input1 = new Scanner(file2);
	JOptionPane.showMessageDialog(null,"WELCOME TO THE TEACHERS PANEL!");
	while(true)
	{
	String Choice = JOptionPane.showInputDialog(null,"Enter 1 to Add Records"+"\n"+"Enter 2 to view Records"+"\n"+"Enter 3 to Search Records"+"\n"+"Enter 4 to Edit Records"+"\n"+"Enter any number to exit the panel");
	int choice = Integer.parseInt(Choice);
	if(choice == 1)
	{
		String num = JOptionPane.showInputDialog("Enter the number of teachers you want to add");
		int Num = Integer.parseInt(num);
		TeacherRecords = new String[Num][4];
		for(int i = 0; i<Num;i++) {
			TeacherID = JOptionPane.showInputDialog("Enter the ID of Teacher");
			TeacherRecords[i][0] = TeacherID;
			for(int j = 1;j<(i+1);j++) 
			{
				TeacherName = JOptionPane.showInputDialog("Enter the Name of Teacher");
				TeacherRecords[j][1] = TeacherName;
			}
			for(int k = i; k<(i+1);k++)
			{
				TeacherDepartment = JOptionPane.showInputDialog("Enter the Department of Teacher");
				TeacherRecords[k][2] = TeacherDepartment;
				
			}
			for(int l = i; l<(i+1);l++)
			{
				Qualification = JOptionPane.showInputDialog("Enter the Qualification of Teacher");
				TeacherRecords[l][3] = Qualification;
			
			}
			
			}
		for(int x = 0;x<Num;x++) {
			for(int y = 0;y<4;y++) {
				output2.println(TeacherRecords[x][y]);
				output1.println(TeacherRecords[x][y]);
			}
		}
		output2.close();
		output1.close();
		break;

	}
	else if(choice == 2)
	{
		if(file3 != null)
		{
			while(input2.hasNextLine()) 
			{
				String j = input2.nextLine();
				JOptionPane.showMessageDialog(null,j);
			}
			break;
		}
		else
		{
			while(input1.hasNextLine()) 
			{
				String j = input1.nextLine();
				JOptionPane.showMessageDialog(null,j);
			}
			break;

		}
			}
	else if(choice == 3)
	{
		if(file3 != null)
		{
			String TeacherId = JOptionPane.showInputDialog("Enter the ID of the Teacher you want to Search.");
			while(input2.hasNext())
			{
				String i = input2.nextLine();
				if(i.matches(TeacherId))
				{
					JOptionPane.showMessageDialog(null,"ID: "+i);
					i = input2.nextLine();
					JOptionPane.showMessageDialog(null,"Name: "+i);
					i = input2.nextLine();
					JOptionPane.showMessageDialog(null,"Department: "+i);
					i = input2.nextLine();
					JOptionPane.showMessageDialog(null,"Qualification: "+i);
					break;
				}
			}
			if(!input1.hasNext())
			{
			JOptionPane.showMessageDialog(null, "Uh Oh! The Entered ID Doesn't Exist.");

		}
		}
		else
		{
			String TeacherId = JOptionPane.showInputDialog("Enter the ID of the Teacher you want to Search.");
			while(input1.hasNext())
			{
				String i = input1.nextLine();
				if(i.matches(TeacherId))
				{
					JOptionPane.showMessageDialog(null,"ID: "+i);
					i = input1.nextLine();
					JOptionPane.showMessageDialog(null,"Name: "+i);
					i = input1.nextLine();
					JOptionPane.showMessageDialog(null,"Department: "+i);
					i = input1.nextLine();
					JOptionPane.showMessageDialog(null,"Qualification: "+i);
					break;
				}
			}
			if(!input1.hasNext())
			{
			JOptionPane.showMessageDialog(null, "Uh Oh! The Entered ID Doesn't Exist.");
		}
		}
	
		break;

	}
	else if (choice == 4)
	{
		String line = "",oldtext = "";
		while((line = reader.readLine())!= null) {
			oldtext += line + "\n";
		}
		reader.close();
		String Teacherid = JOptionPane.showInputDialog("Enter the ID of the Teacher you want to edit records of");
		while(input1.hasNext())
		{
			String j = input1.nextLine();
			if(j.contains(Teacherid))
			{
				String choose = JOptionPane.showInputDialog("Enter 1 if you to edit the ID"+"\n"+"Enter 2 if you want to edit the Name"+"Enter 3 if you want to edit the Department"+"\n"+"Enter 4 if you want to edit the Qualification");
				int Choose = Integer.parseInt(choose);
				if(Choose == 1)
				{
					String ID = JOptionPane.showInputDialog(null,"Enter the modified ID");
					String newText = oldtext.replaceAll(j, ID);
					writer1.write(newText);
					writer1.close();
					break;
				}
				j = input1.nextLine();
				if(Choose == 2)
				{
					String Name = JOptionPane.showInputDialog(null,"Enter the modified Name");
					String newT = oldtext.replaceAll(j, Name);
					writer1.write(newT);
					writer1.close();
					break;
				}
				j = input1.nextLine();
				if(Choose == 3)
				{
					String Department = JOptionPane.showInputDialog(null,"Enter the modified Department");
					String newtext = oldtext.replaceAll(j,Department);
					writer1.close();
					break;
				}
				j = input1.nextLine();
				if(Choose == 4)
				{
					String qualification = JOptionPane.showInputDialog(null,"Enter the modified Qualification");
					String newt = oldtext.replaceAll(j, qualification);
					writer1.write(j);
					writer1.flush();
					writer1.close();
					break;

	}

	}
}
break;

}
	else
	{
		break;
	}
	}
}
}



