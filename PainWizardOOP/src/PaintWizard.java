
public class PaintWizard {

	public String costCalculator(PaintTins tin1, PaintTins tin2, PaintTins tin3, int requiredCoverage) {

		int coveragePerTin1 = tin1.getTinCapacity() * tin1.getCoveragePerLitre();
		int coveragePerTin2 = tin2.getTinCapacity() * tin2.getCoveragePerLitre();
		int coveragePerTin3 = tin3.getTinCapacity() * tin3.getCoveragePerLitre();

		double cost1 = 0.00;
		double cost2 = 0.00;
		double cost3 = 0.00;

		if (requiredCoverage % coveragePerTin1 != 0) {
			cost1 = ((requiredCoverage / coveragePerTin1) + 1) * tin1.getPricePerTin();

		}

		else {
			cost1 = (requiredCoverage / coveragePerTin1) * tin1.getPricePerTin();

		}
		if (requiredCoverage % coveragePerTin2 != 0) {
			cost2 = ((requiredCoverage / coveragePerTin2) + 1) * tin2.getPricePerTin();

		}

		else {
			cost2 = (requiredCoverage / coveragePerTin2) * tin2.getPricePerTin();

		}
		if (requiredCoverage % coveragePerTin3 != 0) {
			cost3 = ((requiredCoverage / coveragePerTin3) + 1) * tin3.getPricePerTin();

		}

		else {
			cost3 = (requiredCoverage / coveragePerTin3) * tin3.getPricePerTin();

		}

		String cheapest = "";

		if (cost1 < cost2 && cost1 < cost3) {

			cheapest = tin1.getBrand() + " is the cheapest tin at £" + cost1;
		}

		else if (cost2 < cost1 && cost2 < cost3) {

			cheapest = tin2.getBrand() + " is the cheapest tin at £" + cost2;
		}

		else if (cost3 < cost1 && cost3 < cost2) {

			cheapest = tin3.getBrand() + " is the cheapest tin at £" + cost3;
		}
		return cheapest;
	}

	public String wasteCalculator(PaintTins tin1, PaintTins tin2, PaintTins tin3, int requiredCoverage) {
		
		int coveragePerTin1 = tin1.getTinCapacity() * tin1.getCoveragePerLitre();
		int coveragePerTin2 = tin2.getTinCapacity() * tin2.getCoveragePerLitre();
		int coveragePerTin3 = tin3.getTinCapacity() * tin3.getCoveragePerLitre();
		
		int waste1 = (coveragePerTin1-(requiredCoverage % coveragePerTin1))/tin1.getCoveragePerLitre();
		int waste2 = (coveragePerTin2-(requiredCoverage % coveragePerTin2))/tin2.getCoveragePerLitre();
		int waste3 = (coveragePerTin3 - (requiredCoverage % coveragePerTin3))/tin3.getCoveragePerLitre();
		
		String leastWasteful ="";

		if (waste1 < waste2 && waste1 < waste3) {

			leastWasteful = tin1.getBrand() + " wastes the least with " + waste1 + " litres wasted";
		}

		else if (waste2 < waste1 && waste2 < waste3) {

			leastWasteful = tin2.getBrand() + " wastes the least with " + waste2 + " litres wasted";
		}

		else if (waste3 < waste1 && waste3 < waste2) {

			leastWasteful = tin3.getBrand() + " wastes the least with " + waste3 + " litres wasted";
		}
		else if (waste1 == waste2 && waste1< waste3) {
			leastWasteful = tin1.getBrand() + " and "+ tin2.getBrand()+" waste the least with " + waste1 + " litres wasted";
		}
		else if (waste1 == waste3 && waste1< waste2) {
			leastWasteful = tin1.getBrand() + " and "+ tin3.getBrand()+" waste the least with " + waste1 + " litres wasted";
		}
		else if (waste2 == waste3 && waste2< waste1) {
			leastWasteful = tin2.getBrand() + " and "+ tin3.getBrand()+" waste the least with " + waste2 + " litres wasted";
		}
		else if (waste1 == waste2 && waste1 == waste3) {
			leastWasteful = "All tins waste the same amount with " + waste1 + " litres wasted";
		}
		return leastWasteful;

		
	}

}
