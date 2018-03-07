
public class Score extends CheckMark {

	double wins = 0;
	double losses = 0;
	double draws = 0;
	

	public void scoreRec(int WLD) {
		if (WLD == 1) {
			wins++;
		} else if (WLD == 2)

		{
			losses++;
		} else if (WLD == 0) {
			draws++;
		}
	}

	public void showScore() {double winPerc = ((wins / (wins + losses + draws)) * 100);
		System.out.println("Wins	Losses	Ties\n" + (int) wins + "	" + (int) losses + "	" + (int) draws + "\n" +   winPerc + "%" +"\n");
		System.out.println("Total Games:" + (int) (wins + losses + draws));

	}

}
