package Kermis;
import java.util.Random;
import java.util.Scanner;

public class Kassa {
	static double standVanZaken;
	static int aantalKaartjes;

	public double omzet (double prijsAttractie, int keuzeVP) {
		double omzet = prijsAttractie * keuzeVP;
		System.out.println(omzet);
		standVanZaken = omzet + standVanZaken;
		return omzet;
	}
	

	public static void menuKiezen (Kermis km) {
		System.out.println("Typ [o] voor de omzet, typ [k] voor aantal kaartjes verkocht. Typ [v] voor verkoop.");
		Scanner sc = new Scanner(System.in);
		String check = sc.nextLine();
		switch (check) {
		case "o" : 
			System.out.println("De totale omzet is " + standVanZaken + " euro.");
			//moet het onderstaande menu nog ff fixen
			System.out.println("Botsautos:" );
			break;
		case "k" :
			System.out.println("Het totale aantal kaartjes verkocht is: " + aantalKaartjes);
			//moet ook dit onderstaande menu nog ff fixen
			System.out.println("Botsautos:" );
			break;
		case "v" :
			System.out.println("Verkoop");
			Scanner sc1 = new Scanner(System.in);
	        System.out.println("Welkom bij KermisKassa 3000! \nU heeft de keuze uit de onderstaande keuzes: \n0 -- Botsauto's \n1 -- Spin \n2 -- Spiegelpaleis \n3 -- Spookhuis \n4 -- Hawaii \n5 -- Ladderklimmen \nVoer Uw Keuze in:");
	        int keuzeVoorAttractie = sc1.nextInt();
	        System.out.println("Hoeveel personen willen in de attractie?");
	        int keuzeVoorPersonen = sc1.nextInt();
	        km.ticketGekocht(keuzeVoorAttractie, keuzeVoorPersonen);
	  
		}
	}
	
}
