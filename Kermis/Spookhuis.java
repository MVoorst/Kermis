package Kermis;

public class Spookhuis extends Attractie{
	private String naam;
	static double prijs = 3.20;
	double oppervlakte = 22;
	private int aantalKaartjes;
	
	public Spookhuis() {
		this.naam = "Spookhuis";
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
		System.out.println("De attractie Spookhuis draait!");
	}
	
}
