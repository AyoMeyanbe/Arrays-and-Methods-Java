package arraysAndMethods;
import java.util.Scanner;

public class Returning {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Please input a number: ");
		int number1 = sc.nextInt();
		System.out.println("Please input another number: ");
		int number2 = sc.nextInt();
		
		int total = calculate(number1, number2);
		System.out.println("The total is "+ total);
	}
	
	public static int calculate(int number1, int number2) {
		int total = number1 * number2;
		return total;
	}

}
