package arraysAndMethods;
import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// Customizable Array
		Scanner sc = new Scanner(System.in);
		
		// Figured out number of students in the class
		System.out.println("How many students in the class: ");
		int students = sc.nextInt();
		sc.nextLine();
		
		// Created 3 blank arrays that we will be using 
		String [] classList = new String[students];
		int [] ages = new int [students];
		boolean [] g2 = new boolean [students];
		
		// Loop to GET values
		for(int i = 0; i < classList.length; i++) {
			System.out.println("Please enter your name: ");
			classList[i] = sc.nextLine();
			System.out.println("Please enter your age: ");
			ages[i] = sc.nextInt();
			System.out.println("Do you have your g2? True or False");
			g2 [i] = sc.nextBoolean();
			sc.nextLine();
		}
		
		// Loop to DISPLAY values
		for(int i = 0; i < classList.length; i++) {
			if (g2[i] == true) {
				System.out.println(classList[i]+" is "+ages[i]+" years old and IS eligible to drive on their own");
			} else {
				System.out.println(classList[i]+" is "+ages[i]+" years old and IS NOT eligible to drive on their own");
			}
		}

	}

}
