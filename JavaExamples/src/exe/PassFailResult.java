package exe;

import java.util.Scanner;

public class PassFailResult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int markedObtained, passingMarks;
		passingMarks = 40;
		System.out.println("Enter your marks");
		Scanner s = new Scanner(System.in);

		markedObtained = s.nextInt();
		if (markedObtained > 40) {
			System.out.println("Congratulations,You are passed");
		} else {
			System.out.println("You are failed");
		}
	}

}
