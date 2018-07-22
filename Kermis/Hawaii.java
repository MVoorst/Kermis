package Kermis;

public class Hawaii extends Attractie implements RisicoRijkeAttracties{
	private String naam;
	static double prijs = 2.90; 
	int aantalKaartjes;
	int aantalKeerGedraaid;
	
	public Hawaii() {
		this.naam = "Hawaii";
	}
	public String getNaam() {
		return this.naam;
	}
	public int draaien() {
		System.out.println("De attractie Hawaii draait!");
		return this.aantalKeerGedraaid++;
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
	
	public boolean opstellingsKeuring() {
		if (aantalKeerGedraaid == 10) {
			
			return true;
		}else {
			return false;
		}
	}
	public int getDraaien() {
		return this.aantalKeerGedraaid;
	}
}