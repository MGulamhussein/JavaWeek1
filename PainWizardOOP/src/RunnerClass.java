
public class RunnerClass {

	public static void main(String[] args) {

		PaintWizard wizard = new PaintWizard();
		PaintTins cheapoMax = new PaintTins("Cheapo Max", 20, 19.99, 10);
		PaintTins averageJoes = new PaintTins("Average Joes", 15, 17.99, 11);
		PaintTins duluxourousPaints = new PaintTins("Duluxourous Paints", 10, 25.00, 20);

	System.out.println(wizard.costCalculator(cheapoMax, averageJoes, duluxourousPaints, 220));
		System.out.println(wizard.wasteCalculator(cheapoMax, averageJoes, duluxourousPaints, 220));
		

	}

}
