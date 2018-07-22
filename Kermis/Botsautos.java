package Kermis;

public class Botsautos extends Attractie{
	private String naam;
	private static final double prijs = 2.50; 
	double oppervlakte = 21;
	int aantalKaartjes;
	int aantalKeerGedraaid;
	
	public Botsautos() {
		this.naam = "Botsautos";
	}
	public String getNaam() {
		return this.naam;
	}
	public int getKaartjes() {
		return this.aantalKaartjes;
	}
	
	public int setKaartjes(int sk) {
		this.aantalKaartjes = aantalKaartjes + sk;
		return this.aantalKaartjes;
	}
	
	public int draaien() {
		System.out.println("De attractie Botsauto's draait!");
		return this.aantalKeerGedraaid++;
	}
	
	public int getDraaien() {
		return this.aantalKeerGedraaid;
	}
	
	public double getPrijs() {
		return this.prijs;
	}
	
}
