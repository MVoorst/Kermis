package Kermis;

public class Hawaii extends Attractie{
	private String naam;
	static double prijs = 2.90; 
	int aantalKaartjes;
	
	
	public Hawaii() {
		this.naam = "Hawaii";
	}
	public String getNaam() {
		return this.naam;
	}
	public void draaien() {
		System.out.println("De attractie Hawaii draait!");
	}
	
	public double getPrijs() {
		return this.prijs;
	}
	public int getKaartjes() {
		return this.aantalKaartjes;
	}
	public void setKaartjes(int sk) {
		aantalKaartjes = aantalKaartjes + sk;
	}
	
}