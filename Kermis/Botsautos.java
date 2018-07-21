package Kermis;

public class Botsautos extends Attractie{
	private String naam;
	private static final double prijs = 2.50; 
	double oppervlakte = 21;
	private int aantalKaartjes;
	
	public Botsautos() {
		this.naam = "Botsautos";
	}
	public String getNaam() {
		return this.naam;
	}
	public double getKaartjes() {
		return this.aantalKaartjes;
	}
	public void draaien() {
		System.out.println("De attractie Botsauto's draait!");
	}
	
	public double getPrijs() {
		return this.prijs;
	}
	
}
