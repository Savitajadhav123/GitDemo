package exe;

import java.util.Scanner;

public class ConvertFtoC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float temperature;
		Scanner in = new Scanner(System.in);
		System.out.println("Pleaser Enter temperature to fer");
		temperature = in.nextInt();

		temperature = (temperature - 32) * 5 / 9;
		System.out.println("Temperature in celsius " + temperature);

	}

}
