package Kermis;

public class Hawaii extends Attractie{
	private String naam = "Spin";
	static double prijs = 2.90; 
	private int aantalKaartjes;
	
	public Hawaii() {
		this.naam = "Hawaii";
	}
	public String getNaam() {
		return this.naam;
	}
	public void draaien() {
		System.out.println("De attractie Hawaii draait!");
	}
	@Override
	public double getPrijs() {
		// TODO Auto-generated method stub
		return 0;
	}
}
