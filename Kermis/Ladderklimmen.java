package Kermis;

public class Ladderklimmen extends Attractie{
	private String naam;
	static double prijs = 5.00; 
	double oppervlakte = 5;
	int aantalKaartjes;
	
	public Ladderklimmen() {
		this.naam = "Ladderklimmen";
	}
	
	public String getNaam() {
		return this.naam;
	}
	
	public int getKaartjes() {
		return this.aantalKaartjes;
	}
	
	public void draaien() {
		System.out.println("De attractie Ladderklimmen draait!");
	}
	public double getPrijs() {
		return this.prijs;
	}

	public void setKaartjes(int sk) {
		aantalKaartjes = aantalKaartjes + sk;
	}
}
