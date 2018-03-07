import java.util.Scanner;

public class multiGame {

	String yn;

	Scanner input = new Scanner(System.in);
	Score score = new Score();
	CheckMark check = new CheckMark();
	Player playerClass = new Player();
	Computer computer = new Computer();



	public void gameContinue() {
		while (true) {
			playerClass.setUserIn();
			computer.setComputerIn();
			computer.showComputerIn();
			if (check.check(playerClass.getUserIn(), computer.getComputerIn()) == 0) {
				System.out.println("Tie!");
				score.scoreRec(0);
				score.showScore();

			} else if (check.check(playerClass.getUserIn(), computer.getComputerIn()) == 1) {
				System.out.println("Win!");
				score.scoreRec(1);
				score.showScore();

			} else if (check.check(playerClass.getUserIn(), computer.getComputerIn()) == 2) {
				System.out.println("Lose");
				score.scoreRec(2);
				score.showScore();
				

			}

		}
	}

}
