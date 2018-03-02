
public class RunnerClass {

	public static void main(String[] args) {
	
		Swamp s = new Swamp ();
		PlayerOne p = new PlayerOne();
		p.positionx = 4;
		p.positiony = 4;
		s.mapGenerate();
		p.move(s);
		

	}

}
