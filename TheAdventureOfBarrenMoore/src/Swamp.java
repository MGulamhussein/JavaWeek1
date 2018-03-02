
public class Swamp {

	String[][] map = new String[10][10];

	public void outputGrid() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}

	}

	public String[][] mapGenerate() {

		for (int i = 0; i < 10; i++) {

			for (int j = 0; j < 10; j++) {
				map[i][j] = "[ ]";
				map[1][3] = "[O]";
				map[4][4] = "[X]";

				//System.out.print(map[i][j]);
			}
			//System.out.println();
		}

		return map;
	}

}
