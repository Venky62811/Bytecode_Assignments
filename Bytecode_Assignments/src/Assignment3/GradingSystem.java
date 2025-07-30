package Assignment3;

import java.util.Scanner;

public class GradingSystem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numOfStudents= sc.nextInt();
		int grade_A=0, grade_B=0, grade_C=0, grade_D=0, grade_F=0;
		System.out.println("Enter the marks of " + numOfStudents + " students:");
		for(int i=0; i<numOfStudents; i++) {
			int marks = sc.nextInt();
			if(marks >= 90) {
				grade_A++;
			} else if(marks >= 80) {
				grade_B++;
			} else if(marks >= 40) {
				grade_C++;
			} else if(marks >= 30) {
				grade_D++;
			} else {
				grade_F++;
			}
			int highest = (marks > 100) ? 100 : marks;
			int lowest = (marks < 0) ? 0 : marks;
			
			
		 } System.out.println("Grade A: " + grade_A);
		System.out.println("Grade B: " + grade_B);
		System.out.println("Grade C: " + grade_C);
		System.out.println("Grade D: " + grade_D);
		System.out.println("Grade F: " + grade_F);
		
		
		sc.close();
	}
}
