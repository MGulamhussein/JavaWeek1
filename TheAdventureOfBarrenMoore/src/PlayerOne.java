import java.util.Scanner;

public class PlayerOne {
	int positionx;
	int positiony;

	public void move(Swamp s) {

		Scanner userInput = new Scanner(System.in);

		while (true) {
			if (s.map[positionx][positiony] == s.map[1][3]) {
				System.out.println("You win!!!");
				break;
			}

			else {
				System.out.println("move or look?");

				String input1 = userInput.nextLine();

				if (input1.equals("move")) {

					System.out.println("north, east, south or west?");
					String move = userInput.nextLine();

					switch (move) {
					case "north":
					case "NORTH":
						if (positionx == 0) {
							System.out.println("Reached barrier! Try again");
						} else {
							s.map[positionx - 1][positiony] = "[X]";
							s.map[positionx][positiony] = "[ ]";
							positionx--;
						}
						break;

					case "south":
					case "SOUTH":
						if (positionx == 9) {
							System.out.println("Reached barrier! Try again");
						} else {
							s.map[positionx + 1][positiony] = "[X]";
							s.map[positionx][positiony] = "[ ]";
							positionx++;
						}
						break;

					case "west":
					case "WEST":
						if (positiony == 0) {
							System.out.println("Reached barrier! Try again");
						} else {
							s.map[positionx][positiony - 1] = "[X]";
							s.map[positionx][positiony] = "[ ]";
							positiony--;
						}
						break;

					case "east":
					case "EAST":
						if (positiony == 9) {
							System.out.println("Reached barrier! Try again");
						} else {
							s.map[positionx][positiony + 1] = "[X]";
							s.map[positionx][positiony] = "[ ]";
							positiony++;
						}
						break;

					default:
						System.out.println("Invalid Movement");
						break;
					}

				} else if (input1.equals("look")) {

					double distance = Math.sqrt(Math.pow((positionx - 1), 2.0) + (Math.pow((positiony - 3), 2.0)));
					System.out.println("You are " + distance + "m away from the treasure");

				} else {
					System.out.println("Invalid input");
				}
				// s.outputGrid();

			}

		}

	}
}
