package exe;

import java.util.Scanner;

public class swappingTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		int y;
		int temp;
		System.out.println("Enter x and y");
		Scanner s = new Scanner(System.in);

		x = s.nextInt();
		y = s.nextInt();
		System.out.println("Before Swapping X=" + x + " y=" + y);
		temp = x;
		x = y;
		y = temp;
		System.out.println("After swapping X= " + x + " Y=" + y);

	}

}
