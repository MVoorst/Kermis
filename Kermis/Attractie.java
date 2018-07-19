package Kermis;

public abstract class Attractie {
	String naam;
	int counter; 
	double oppervlakte;
	abstract double getPrijs();
	
	public void draaien() {}
}
