package Kermis;

public class Spiegelpaleis extends Attractie{
	private String naam;
	static double prijs = 2.75; 
	double oppervlakte = 25;
	int aantalKaartjes;
	int aantalKeerGedraaid;
	
	public Spiegelpaleis() {
		this.naam = "Spiegelpaleis";
	}
	public String getNaam() {
		return this.naam;
	}
	public double getPrijs() {
		return this.prijs;
	}
	
	public int getKaartjes() {
		return this.aantalKaartjes;
	}
	public int setKaartjes(int sk) {
		this.aantalKaartjes = aantalKaartjes + sk;
		return this.aantalKaartjes;
	}
	
	public int draaien() {
		System.out.println("De attractie Spiegelpaleis draait!");
		return this.aantalKeerGedraaid++;
	}
	public int getDraaien() {
		return this.aantalKeerGedraaid;
	}
	
}	
