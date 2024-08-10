package arraysAndMethods;
import java.util.Scanner;

public class Assignment {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// EXERCISE 1
		// Adding to array
		int [] gradeList = new int [2];
		int total = 0;
		System.out.println("EXERCISE 1");
		for(int i = 0; i < gradeList.length; i++) {
			System.out.println("Enter a grade: ");
			gradeList[i] = sc.nextInt();
			total = total +gradeList[i];
		}
		// Displaying array forward
		System.out.println("GRADES DISPLAYED FORWARD");
		for(int i = 0; i < gradeList.length; i++) {
			System.out.println(gradeList[i]);
		}
		// Displaying array backwards
		System.out.println("GRADES DISPLAYED BACKWARD");
		for(int i = gradeList.length -1; i >= 0 ; i--) {
			System.out.println(gradeList[i]);
		}
		
		// Displaying AVERAGE
		System.out.println("The average is: "+(total/gradeList.length));
		sc.nextLine();
		//EXERCISE 2
		System.out.println("EXERCISE 2");
		String [] nameList = new String [2];
		String [] addressList = new String [2];
		// Entering info
		for(int i = 0; i < nameList.length; i++) {
			System.out.println("Enter a name: ");
			nameList[i] = sc.nextLine();
			System.out.println("Enter their address: ");
			addressList[i] = sc.nextLine();
		}
		// Displaying list
		for(int i = 0; i < nameList.length; i++) {
			System.out.println(nameList[i] + " lives at "+ addressList[i]);
		}
		
		// Search for name
		System.out.println("Search for a name: ");
		String nameSearch = sc.nextLine();
		boolean nameFound = false;
		for(int i = 0; i < nameList.length; i++) {
			if(nameList[i].equalsIgnoreCase(nameSearch)) {
				System.out.println(nameSearch + " lives at "+ addressList[i]);
				nameFound = true;
			} 
		}
		if(nameFound == false) {
			System.out.println("Name not found");
		}
	}

}
