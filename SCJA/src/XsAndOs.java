import java.util.Scanner;

public class XsAndOs {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		char[][] board = new char[3][3];
		Scanner keybord = new Scanner(System.in);
		int choice;
		char xRo = 'X';
		boolean playing = true;
		int counter=0;
		
		setBoard(board);
		display(board);

		while (playing) {
			System.out.println("Enter a location for " + xRo + ": ");
			choice = keybord.nextInt();

			changeBoard(board, choice, xRo);
			display(board);

			playing = stillPlaying(board);
			if(playing == false)
			System.out.println("\n" + xRo + " is the winner!!!");
			
			
			counter++;
			if(counter == 10 && playing){
				System.out.println("DRAW");
				setBoard(board);
				display(board);
				counter = 1;
			}
			
			
			if (xRo == 'X')
				xRo = 'O';
			else
				xRo = 'X';

		}
	}

	
	public static boolean stillPlaying(char board[][]) {
		boolean playing = true;
		
		//Checks Across
		if (board[0][0] == board[0][1] && board[0][1] == board[0][2])
			playing = false;
		if (board[1][0] == board[1][1] && board[1][1] == board[1][2])
			playing = false;
		if (board[2][0] == board[2][1] && board[2][1] == board[2][2])
			playing = false;
		
		// Checks Up
		if (board[0][0] == board[1][0] && board[1][0] == board[2][0])
		playing = false;
		if (board[0][1] == board[1][1] && board[1][1] == board[2][1])
			playing = false;
		if (board[0][2] == board[1][2] && board[1][2] == board[2][2])
			playing = false;
		
		// Checks Diag
		if (board[0][0] == board[1][1] && board[1][1] == board[2][2])
			playing = false;
		if (board[0][2] == board[1][1] && board[1][1] == board[2][0])
			playing = false;
	
		return playing;
	}

	
	public static void changeBoard(char board[][], int choice, char xRo) {
		switch (choice) { // Better using the SWITCH statement instead of many
							// IF statements
		case 1:
			board[0][0] = xRo;
			break;
		case 2:
			board[0][1] = xRo;
			break;
		case 3:
			board[0][2] = xRo;
			break;
		case 4:
			board[1][0] = xRo;
			break;
		case 5:
			board[1][1] = xRo;
			break;
		case 6:
			board[1][2] = xRo;
			break;
		case 7:
			board[2][0] = xRo;
			break;
		case 8:
			board[2][1] = xRo;
			break;
		case 9:
			board[2][2] = xRo;
			break;

		default:
			System.out.println("Invalid Choice");

		}

	}

	public static void display(char board[][]) {
		for (int row = 0; row < board.length; row++) {
			for (int column = 0; column < board[row].length; column++) {

				System.out.print(board[row][column] + " ");
			}
			System.out.println();

		}
	}

	public static void setBoard(char board[][]) { // this method resets the
													// board
		char num = '1';
		for (int row = 0; row < board.length; row++) {
			for (int column = 0; column < board[row].length; column++) {

				board[row][column] = num++;
			}
		}
	}
}