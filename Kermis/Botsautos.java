package Kermis;

public class Botsautos extends Attractie{
	String naam = "Botsautos";
	private static final double prijs = 2.50; 
	double oppervlakte = 21;
	
	public void draaien() {
		System.out.println("De attractie Botsauto's draait!");
	}
	
	public double getPrijs() {
		return prijs;
	}
}
