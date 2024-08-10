package arraysAndMethods;
import java.util.Scanner;

public class Methods {
		static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		//methodTwo();
		
		int [] numbers = {123, 456, 789, 987, 654, 321};
		
		System.out.println("Enter 1 to display all numbers. Enter 2 to view an index number");
		int choice = sc.nextInt();
		
		if (choice == 1) {
			displayAll(numbers);
		}
		if (choice == 2) {
			displayIndexNumber(numbers);
		}
	}
	
	/*public static void methodTwo() {
		System.out.println("We are in method 2");
		methodThree();
		System.out.println("Back to method 2");
	}
	
	public static void methodThree() {
		System.out.println("We are in method 3");
	} */
	
	public static void displayAll(int [] numbers) {
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
	
	public static void displayIndexNumber(int [] numbers) {
		System.out.println("Which index number do you want to view? ");
		int num = sc.nextInt();
		
		System.out.println(numbers[num - 1]);
	}

}
