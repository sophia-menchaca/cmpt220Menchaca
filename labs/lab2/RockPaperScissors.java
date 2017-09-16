//3.17
import java.util.Scanner;

public class RockPaperScissors {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);

		//generate a random integer( 0, 1, 2)
		int computer = (int)(Math.random() * 3);

		// Prompt user to enter a number (0, 1, 2)
		System.out.print("scissor (0), rock (1), paper (2): ");
		int user = input.nextInt();

		System.out.print("The computer played ");
		switch (computer)
		{
			case 0: System.out.print("scissors."); break;
			case 1: System.out.print("rock."); break;
			case 2: System.out.print("paper.");
		}

		System.out.print(" You played ");
		switch (user)
		{
			case 0: System.out.print("scissors."); break;
			case 1: System.out.print("rock."); break;
			case 2: System.out.print("paper.");
		}

		// Display result
		if (computer == user)
			System.out.println(" It is a draw.");
		else
		{
			boolean win = (user == 0 && computer == 2) ||
							  (user == 1 && computer == 0) || //rock to scissor
							  (user == 2 && computer == 1); //paper to rock
			if (win)
				System.out.println(" You won.");
			else
				System.out.println(" You lose.");
		}
	}
}