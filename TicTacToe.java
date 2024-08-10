package arraysAndMethods;
import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String [][] board = {{" - ", " - ", " - "},
						{" - ", " - ", " - "},
						{" - ", " - ", " - "}};
		
		while (true) {
			System.out.println("Please enter a row where you want to put you X or O");
			int rowChoice = sc.nextInt();
			System.out.println("Please enter a column where you want to put your X or O");
			int colChoice = sc.nextInt();
			System.out.println("Are you X or O?");
			String symbol = sc.next();
			board[rowChoice - 1][colChoice - 1] = symbol;
			
			for(int row = 0; row < board.length; row++) {
				for(int col = 0; col < board.length; col++) {
					System.out.print(board[row][col]);
				}
				System.out.println("");
			}
		}

	}

}
