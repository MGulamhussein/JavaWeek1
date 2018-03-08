
public class PaintTins {

	private String brand;
	private int tinCapacity;
	private double pricePerTin;
	private int coveragePerLitre;

	public PaintTins(String brand, int tinCapacity, double pricePerTin, int coveragePerLitre) {

		this.brand = brand;
		this.tinCapacity = tinCapacity;
		this.pricePerTin = pricePerTin;
		this.coveragePerLitre = coveragePerLitre;
	}

	public String getBrand() {
		return brand;
	}
	
	public String setBrand() {
		return brand;
	}
	public int getTinCapacity() {
		return tinCapacity;
	}

	public void setTinCapacity(int tinCapacity) {
		this.tinCapacity = tinCapacity;
	}

	public double getPricePerTin() {
		return pricePerTin;
	}

	public void setPricePerTin(double pricePerTin) {
		this.pricePerTin = pricePerTin;
	}

	public int getCoveragePerLitre() {
		return coveragePerLitre;
	}

	public void setCoveragePerLitre(int coveragePerLitre) {
		this.coveragePerLitre = coveragePerLitre;
	}
	
}
