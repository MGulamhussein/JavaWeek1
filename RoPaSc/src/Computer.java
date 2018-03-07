
public class Computer {

	private int computerIn;

	public void setComputerIn() {
		computerIn = (int) (Math.random() * 6);
		if (computerIn == 0) {
			computerIn = 1;
		}
	}

	public int getComputerIn() {
		return computerIn;
	}

	public void showComputerIn() {
		switch (computerIn) {
		case 1:
			System.out.println("Computer chooses rock");
			return;
		case 2:
			System.out.println("Computer chooses paper");
			return;
		case 3:
			System.out.println("Computer chooses scissors");
			return;
		case 4:
			System.out.println("Computer chooses lizard");
			return;
		case 5:
			System.out.println("Computer chooses spock");
			return;

		}
	}

}
