package studentDatabaseApp;
import java.util.Scanner;

public class StudentDatabase {
public static void main(String[] args){
	
	//Ask how many students we want to add
	System.out.println("Enter number of students to enroll:");
	Scanner sc = new Scanner(System.in);
	int numOfStudents= sc.nextInt();
	Student1[]students= new Student1[numOfStudents];
	
	
	//Create n number of new students
	for(int n=0; n<numOfStudents; n++) {
		students[n] = new Student1();
		students[n].enroll();
		students[n].payTuition();
	}
	
	for(int n=0; n<numOfStudents; n++) {
		System.out.println(students[n].showInfo());

}
}
}
