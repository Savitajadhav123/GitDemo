package exe;

import java.util.Scanner;

public class LagestNumberInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y, z;
		System.out.println("Enter three integers ");
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		y = in.nextInt();
		z = in.nextInt();
		if (x > y && x > z) {
			System.out.println("First is a largest number");
		} else if (y > x && y > z) {
			System.out.println("Second is largest number");

		} else if (z > x && z > y) {
			System.out.println("Third is largest number");
		} else {
			System.out.println("Entered number is not distinct");
		}
	}

}
