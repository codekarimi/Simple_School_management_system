package studentdatabase;

import java.util.Scanner;

public class student {
	
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String classl;
	private String studentID;
	private String courses = "";
	private float tutionBalance = 0;
	private static int id =1000; //constant value
	private static int costOfCourse =600; //constant value
	
	
	//constructor prompt user to enter student s and year
	public student() {
		Scanner in = new Scanner(System.in);// created object for user input
		
		System.out.print("\nEnter Student First Name:");
		this.firstName =in.nextLine();
		
		
		System.out.print("Enter Student Last Name:");
		this.lastName =in.nextLine();
		
		
		System.out.println("Enter Student grade Year:\n"
				+ "1 - freshman\n"
				+ "2 - sophmore\n"
				+ "3 - junior\n"
				+ "4 - senior");
		this.gradeYear =in.nextInt();
		
		
			classLevel(gradeYear);
			setStudentID();
			
			
			
	}
	
public void  classLevel(int gradeYear) {
	
	if(gradeYear == 1) {
		System.out.println("freshmore");
			}else if(gradeYear == 2) {
				System.out.println("freshmore");
				}else if(gradeYear ==3 ) {
					System.out.println("junior");
					}else if(gradeYear == 4 ) {
						System.out.println("Senior");
						}
}
	
	//generate ID
private void setStudentID() {
	
	id++; //when we create a student id increase by one
	
	 //Grade level plus static id (studentID)
	this.studentID= gradeYear + "/"+ id;
	
}
	
	  //enroll in course
public void enroll() {
	
	//Get inside a loop ,user hits 0
	
	do {
		System.out.print("Enter course to enroll (Q to quit): ");
		Scanner in =new Scanner(System.in);
		
		String course =in.nextLine();
		
		if(!course.equals("Q")) {  //equals() method compares two strings, and returns true if the strings are equal, and false if not.
			courses = courses + "\n" + course;
			tutionBalance = tutionBalance+costOfCourse;
			
		}else {break;}
		
		//if course equal to q will break it  if not equal to q continue looping
		
	}while(1 != 0);
	
	
	
	

}

	//view balance
public void viewBalance() {
	System.out.println("The Balance = " + tutionBalance);
}

	
	//pay tuition(assuming they have paid the balance)
public void payTution() {
	viewBalance();
	System.out.print("Enter Payment $  ");
	Scanner in = new Scanner(System.in);
	float payment =in.nextFloat();
	tutionBalance = tutionBalance - payment;
	System.out.println("Thank you for paying of $  " + payment);
	viewBalance();
}
	
	//show status
public String showInfo() {
	return "\nNAME :"+firstName+" "+lastName
			+ "\nCOURSES Enrolled :" +" "+ courses
			+ "\nBALANCE  :" +" "+ tutionBalance;
}


}
