package studentDatabaseApp;

import java.util.Scanner;

public class Student1 {
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses= "null";
	private int tuitionBalance= 0;
	private static int costOfCourse=600;
	private static int id=1000;
	
// constructor : prompt user to enter student's name and year
	
	public Student1() {
		Scanner in =new Scanner(System.in);
		System.out.println("Enter user's first Name: " );
		this.firstName=in.nextLine();
		
		System.out.println("Enter user's Last Name : ");
		this.lastName= in.nextLine();
		
		System.out.println("1 - Freshman\n2 - Spohmore\n3 - Junior\n4 - Senior\nEnter user's class Level : ");
		this.gradeYear= in.nextInt();
		setStudentID();
		
		
	}
// generate an id
	
	private void setStudentID() {
		//Grade level+Id
		id++;
		this.studentID=gradeYear + "" + id;
	}
	
// Enroll in course
	public void enroll() {
		//Get inside a loop, user hits 0
		do {
		System.out.println("Enter the cource to enroll (Q to Quit) :");
		Scanner in =new Scanner(System.in);
		String course = in.nextLine();
		if(!course.equals("Q")) {
			
			courses =course +"\n" +course;
			tuitionBalance= tuitionBalance + costOfCourse;
		}
		else {
			System.out.println("Break");
		break;
			}
		
		}while (1!=0);
		//System.out.println("ENROLLED IN :" +courses);
		
	}
// View balance
	public void viewBalance() {
		System.out.println("Your balance is:"+ " "+tuitionBalance);
	}
	
// pay tuition
	public void payTuition() {
		viewBalance();
		System.out.println("Enter your payment:");
		Scanner in= new Scanner(System.in);
		int payment= in.nextInt();
tuitionBalance= tuitionBalance- payment;
System.out.println("Thank You for you payment of:" +" " +payment );
viewBalance();
	}
	
// Show status
	public String showInfo() {
		return  "\nYOUR NAME:" +firstName+" "+lastName+
				"\nGRADE YEAR:" +gradeYear+
				"\nCOURSES ENROLLED:" +courses+
				"\nBALANCE:" +tuitionBalance;
		
	}
}

