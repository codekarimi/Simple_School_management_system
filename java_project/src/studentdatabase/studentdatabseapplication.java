package studentdatabase;

import java.util.Scanner;

public class studentdatabseapplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//ask how many user we want to add
		System.out.println("Enter number of new students to enroll :");
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		
		//an array of class student.java for inheritor to access objects in the student java(an aary of objects)
		student[]  students = new  student[number];
	
		//Create the  number of new students
		for( int n=0 ; n < number; n++) {
			students[n] =new student();
			students[n].enroll();
			students[n].payTution();
			
			
		}
		
				for( int n=0 ; n < number; n++) {
					
					System.out.println(students[n].showInfo());
					
				}
	}
	
	
	
		

}
