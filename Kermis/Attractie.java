package Kermis;

public abstract class Attractie {
	String naam;
	int counter; 
	double oppervlakte;
	static double prijs;
	static int aantalKaartjes;
	
	public abstract void setKaartjes(int sk);
	
	public int getKaartjes() {
		return this.aantalKaartjes;
	}
	
	public double getPrijs() {
		return this.prijs;
	}
	
	
	public void draaien() {}
	public abstract String getNaam();
}
