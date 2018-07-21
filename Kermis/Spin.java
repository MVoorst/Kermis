package Kermis;

public class Spin extends Attractie{
	private String naam;
	private double prijs = 2.25; 
	double oppervlakte = 21;
	private int aantalKaartjes;
	
	public Spin() {
		this.naam = "Spin";
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
		System.out.println("De attractie Spin draait!");
	}
}
