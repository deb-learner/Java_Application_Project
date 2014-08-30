import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.io.*;

public class Main 
{
	
	private static final String FILE_NAME = "StudentData.txt";

	public static void main(String[] args) throws FileNotFoundException 
	{
		
		List<StudentData> students = new ArrayList<StudentData>();
		Scanner input = new Scanner(System.in);
		
		options();
		int choice = input.nextInt();
		
		while (true) 
		{
			switch (choice) 
			{
			case 1:
				insertStudentToFile(students, input);
				break;
			case 2:
				for (StudentData std : students) 
				{
					System.out.println(std);
				}
				System.out.println();
				break;
			case 3:
				searchStudent(students, input);
				break;
			case 4:
				sortStudents(students, input);
				break;
			case -1:
				System.out.println("You have chosen to quit the application..");
				System.out.println("You have successfully got out of the system..!!");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid input!");
				System.out.println("PLease choose only from the given options..");
			}
			options();
			choice = input.nextInt();
		}
		
	}

	private static void options() 
	{
		System.out.println("Choose one operation from the following options:");
		System.out.println("Enter 1 to Insert a Student's data");
		System.out.println("Enter 2 to Display all Students' data");
		System.out.println("Enter 3 to Search for a Student");
		System.out.println("Enter 4 to Sort Students' data");
		System.out.println("or -1 to quit");
		System.out.print("\nEnter your Choice:");
	}
	
	private static void insertStudentToFile(List<StudentData> students, Scanner input) 
	{
		PrintWriter outputFile = null;
		try {
			
			outputFile = new PrintWriter(FILE_NAME);
			StudentData student = new StudentData();
			System.out.print("Enter the student Id :");
			student.setStudentId(input.nextInt());

			System.out.print("Enter the firstname :");
			student.setFirstName(input.next());

			System.out.print("Enter the lastname : ");
			student.setLastName(input.next());

			System.out.print("Enter the PhoneNumber : ");
			student.setPhone(input.nextLong());

			System.out.print("Enter the GPA : ");
			student.setGpa(input.nextFloat());

			System.out.print("Enter the Major : ");
			student.setMajor(input.next());

			Date dt = new Date();
			System.out.print("Enter only the date of the Birthday : ");
			dt.setDate(input.nextInt());

			System.out.print("Enter only the month of the Birthday : ");
			dt.setMonth(input.nextInt());

			System.out.print("Enter only the year of the Birthday : ");
			dt.setYear(input.nextInt());
			student.setBirthDate(dt);
			
			outputFile.println(student);
			
			students.add(student);
			
			System.out.println("Student is inserted successfully");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (outputFile != null) {
				outputFile.close();
			}
		}
	}
	
	private static void searchStudent(List<StudentData> students, Scanner input) 
	{
		System.out.println("Select one of the following option:");
		System.out.println("Enter 1 to search by Student Id");
		System.out.println("Enter 2 to Search by last name");
		System.out.println("Enter 3 to Search by major");
		int choice = input.nextInt();
		
		switch (choice) 
		{
		case 1:
			System.out.println("Enter student id");
			int id = input.nextInt();
			StudentData found = null;
			for (StudentData std : students) 
			{
				if (id == std.getStudentId()) 
				{
					found = std;
					break;
				}
			}
			if (found != null) 
			{
				System.out.println("Student Found : " + found + "\n");
			} 
			else {
				System.out.println("No such student found" + "\n");
			}
			break;
			
		case 2: 
			System.out.println("Enter student last name");
			String lastname = input.next();
			StudentData found1 = null;
			for (StudentData std : students) 
			{
				if (lastname.equalsIgnoreCase(std.getLastName())) 
				{
					found1 = std;
					break;
				}
			}
			if (found1 != null) 
			{
				System.out.println("Student Found : " + found1 + "\n");
			} else {
				System.out.println("No such student found" + "\n");
			}
			break;
			
		case 3:
			System.out.println("Enter student major");
			String major = input.next();
			StudentData found2 = null;
			for (StudentData std : students) 
			{
				if (major.equalsIgnoreCase(std.getMajor())) 
				{
					found2 = std;
					break;
				}
			}
			if (found2 != null) {
				System.out.println("Student Found : " + found2 + "\n");
			} else {
				System.out.println("No such student found" + "\n");
			}
			break;
			
		default:
				System.out.println("Invalid choice!");
		}
	}
	
	
	private static void sortStudents(List<StudentData> students, Scanner input) 
	{
		System.out.println("Select one of the following option:");
		System.out.println("Enter 1 to Sort by First Name");
		System.out.println("Enter 2 to Sort by Last Name");
		System.out.println("Enter 3 to Sort by Major");
	
		int choice = input.nextInt();
		
		switch (choice) 
		{
		case 1:
			Collections.sort(students, new Comparator<StudentData>() {

				@Override
				public int compare(StudentData o1, StudentData o2) 
				{
					return o1.getFirstName().compareTo(o2.getFirstName());
				}

			});
			
			for (StudentData std : students) 
			{
				System.out.println(std);
			}
			System.out.println();
			break;
			
		case 2:
			Collections.sort(students, new Comparator<StudentData>() {

				@Override
				public int compare(StudentData o1, StudentData o2) 
				{
					return o1.getLastName().compareTo(o2.getLastName());
				}

			});
			
			for (StudentData std : students) 
			{
				System.out.println(std);
			}
			System.out.println();
			break;
			
		case 3:
			Collections.sort(students, new Comparator<StudentData>() {

				@Override
				public int compare(StudentData o1, StudentData o2) 
				{
					return o1.getMajor().compareTo(o2.getMajor());
				}

			});
			
			for (StudentData std : students) 
			{
				System.out.println(std);
			}
			System.out.println();
			break;
			
		default:
			System.out.println("Invalid Choice!");
		}
	}
	
}
