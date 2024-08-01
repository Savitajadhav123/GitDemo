package exe;

import java.util.Scanner;

public class passingGrades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int MarkObtained;
		int passingMarks = 40;
		char grade;
		System.out.println("Enter your marks");
		Scanner s = new Scanner(System.in);
		MarkObtained = s.nextInt();

		
		if (MarkObtained >= passingMarks) {

			if (MarkObtained > 90)
				grade = 'A';

			else if (MarkObtained > 75)
				grade = 'B';
			else if (MarkObtained > 60)
				grade = 'C';
			else
				grade = 'D';
			System.out.println("You passed the exam and your grade is " + grade);
		} else {
			grade = 'f';
			System.out.println("You are failed");
		}

	}
}
