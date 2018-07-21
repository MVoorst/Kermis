package Kermis;

public abstract class Attractie {
	String naam;
	int counter; 
	double oppervlakte;
	static double prijs;
	private int aantalKaartjes;
	
	public double getPrijs() {
		return this.prijs;
	}
	
	
	public void draaien() {}
	public abstract String getNaam();
}
