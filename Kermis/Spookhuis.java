package Kermis;

public class Spookhuis extends Attractie{
	private String naam;
	static double prijs = 3.20;
	double oppervlakte = 22;
	int aantalKaartjes;
	int aantalKeerGedraaid;
	
	public Spookhuis() {
		this.naam = "Spookhuis";
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
		System.out.println("De attractie Spookhuis draait!");
		return this.aantalKeerGedraaid++;
	}
	
	public int getDraaien() {
		return this.aantalKeerGedraaid;
	}
	
}
