package exe;

import java.util.Scanner;

public class SwappingTwoNubmerwithoutVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y;
		System.out.println("Please enter x& y value");
		Scanner s = new Scanner(System.in);
		x = s.nextInt();
		y = s.nextInt();
		System.out.println("Before Swapping x is" + x + " y is" + y);
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After Swapping x is " + x + "y is " + y);

	}

}
