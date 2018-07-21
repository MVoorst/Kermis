package Kermis;

public class Spiegelpaleis extends Attractie{
	private String naam;
	static double prijs = 2.75; 
	double oppervlakte = 25;
	private int aantalKaartjes;
	
	public Spiegelpaleis() {
		this.naam = "Spiegelpaleis";
	}
	public String getNaam() {
		return this.naam;
	}
	public double getPrijs() {
		return this.prijs;
	}
	public double getKaartjes() {
		return this.aantalKaartjes;
	}
	public void draaien() {
		System.out.println("De attractie Spiegelpaleis draait!");
	}
	
}	
