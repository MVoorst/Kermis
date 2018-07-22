package Kermis;

public abstract class Attractie {
	String naam;
	int counter; 
	double oppervlakte;
	static double prijs;
	static int aantalKaartjes;
	int aantalKeerGedraaid;
	
	public abstract int setKaartjes(int sk);
	
	public int getKaartjes() {
		return this.aantalKaartjes;
	}
	
	public double getPrijs() {
		return this.prijs;
	}

	public abstract int draaien();
	
	public int getDraaien() {
		return this.aantalKeerGedraaid;
	}
	
	public abstract String getNaam();
}
