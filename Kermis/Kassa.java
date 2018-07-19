package Kermis;
import java.util.Random;
import java.util.Scanner;

public class Kassa {
	double standVanZaken = 0;

	public double omzet (double prize) {
		double omzet = prijs * keuze;
		System.out.println(omzet);
		System.out.println(Botsautos.prijs);
		standVanZaken = omzet + standVanZaken;
		return omzet;
	}
	
	
	void checken () {
		System.out.println("Typ [o] voor de omzet, typ [k] voor aantal kaartjes verkocht. Typ [v] voor verkoop.");
		Scanner sc = new Scanner(System.in);
		String check = sc.nextLine();
		switch (check) {
		case "o" : 
			System.out.println("De totale omzet is " + standVanZaken + " euro.");
			break;
		case "k" :
			System.out.println("Het totale aantal kaartjes verkocht is: ");
			break;
		case "v" :
			
			kiezen();
			omzet(null);
			break;
		}
	}
	
}
