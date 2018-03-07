import java.util.Scanner;

public class Player {

	public Scanner input = new Scanner(System.in);
	public int userIn;

	public void setUserIn() {
		System.out.println("Rock: 1, Paper: 2, Scissors: 3, Lizard: 4, Spock: 5");
		userIn = input.nextInt();
		if (userIn < 1 || userIn > 5) {
			System.out.println("Invalid Input, Try Again!");
			userIn = input.nextInt();
		}
	}

	public int getUserIn() {
		return userIn;

	}
}
