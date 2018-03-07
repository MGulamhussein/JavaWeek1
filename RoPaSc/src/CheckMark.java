
public class CheckMark {

	int draw = 0;
	int win = 1;
	int lose = 2;

	public int check(int playerMove, int computerMove) {
		if (playerMove == computerMove) {
			return draw;
		} else if (playerMove == 1 && computerMove == 2) {
			return lose;
		} else if (playerMove == 2 && computerMove == 1) {
			return win;
		} else if (playerMove == 1 && computerMove == 3) {
			return win;
		} else if (playerMove == 3 && computerMove == 1) {
			return lose;
		} else if (playerMove == 1 && computerMove == 4) {
			return win;
		} else if (playerMove == 4 && computerMove == 1) {
			return lose;
		} else if (playerMove == 1 && computerMove == 5) {
			return lose;
		} else if (playerMove == 5 && computerMove == 1) {
			return win;
		} else if (playerMove == 2 && computerMove == 3) {
			return lose;
		} else if (playerMove == 3 && computerMove == 2) {
			return win;
		} else if (playerMove == 2 && computerMove == 4) {
			return lose;
		} else if (playerMove == 4 && computerMove == 2) {
			return win;
		} else if (playerMove == 2 && computerMove == 5) {
			return win;
		} else if (playerMove == 5 && computerMove == 2) {
			return lose;
		} else if (playerMove == 3 && computerMove == 4) {
			return win;
		} else if (playerMove == 4 && computerMove == 3) {
			return lose;
		} else if (playerMove == 3 && computerMove == 5) {
			return lose;
		} else if (playerMove == 3 && computerMove == 3) {
			return win;
		} else if (playerMove == 4 && computerMove == 5) {
			return win;
		} else if (playerMove == 5 && computerMove == 4) {
			return lose;
		}
		return 0;

	}
}
