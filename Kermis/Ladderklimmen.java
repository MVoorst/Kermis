package Kermis;

public class Ladderklimmen extends Attractie implements GokBelasting{
	private String naam;
	static double prijs = 5.00; 
	double oppervlakte = 5;
	int aantalKaartjes;
	static double reservering;
	int aantalKeerGedraaid;
	
	public Ladderklimmen() {
		this.naam = "Ladderklimmen";
	}
	
	public String getNaam() {
		return this.naam;
	}
	
	public int getKaartjes() {
		return this.aantalKaartjes;
	}
	
	public int draaien() {
		System.out.println("De attractie Ladderklimmen draait!");
		return this.aantalKeerGedraaid++;
	}
	public double getPrijs() {
		return this.prijs;
	}

	public int setKaartjes(int sk) {
		this.aantalKaartjes = aantalKaartjes + sk;
		return this.aantalKaartjes;
	}
	public double kansSpelBelastingBetalen() {
		double reservering = Kassa.standVanZaken * 0.30;
		System.out.println(reservering);
		Kassa.reservering = reservering;
		return this.reservering;
	}
	public int getDraaien() {
		return this.aantalKeerGedraaid;
	}
	
}
