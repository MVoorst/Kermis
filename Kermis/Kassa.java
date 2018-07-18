package Kermis;
import java.util.Random;
import java.util.Scanner;

public class Kassa {
	double totaleOmzet;
	
	public double omzet (Attractie ba) {
		System.out.println("Hoeveel personen willen in de attractie?");
		Scanner sc = new Scanner(System.in);
		int keuze = sc.nextInt();
		double omzet = ba.prijs * keuze;
		System.out.println(omzet);
		System.out.println(Botsautos.prijs);
		return omzet;
	}
	
	
}
