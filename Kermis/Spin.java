package Kermis;

public class Spin extends Attractie implements RisicoRijkeAttracties{
	private String naam;
	private double prijs = 2.25; 
	double oppervlakte = 21;
	int aantalKaartjes;
	int aantalKeerGedraaid;
	
	public Spin() {
		this.naam = "Spin";
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
		System.out.println("De attractie Spin draait!");
		return this.aantalKeerGedraaid++;
	}
	
	public boolean opstellingsKeuring() {
		if (this.aantalKeerGedraaid > 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public int getDraaien() {
		return this.aantalKeerGedraaid;
	}
	
	public int setAantalDraaien() {
		this.aantalKeerGedraaid = 0;
		return this.aantalKeerGedraaid;
	}
}
