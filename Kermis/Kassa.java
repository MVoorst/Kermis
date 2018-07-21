package Kermis;
import java.util.Random;
import java.util.Scanner;

public class Kassa {
	static double standVanZaken;
	static int aantalKaartjes;
	
	public static int aantalKaartjesBerekenen(Attractie nul, Attractie een, Attractie twee,Attractie drie, Attractie vier, Attractie vijf) {
		//System.out.println(nul.getKaartjes() + een.getKaartjes() + twee.getKaartjes() + drie.getKaartjes() + vier.getKaartjes() + vijf.getKaartjes());
		int aantalKaartjesB = nul.getKaartjes() + een.getKaartjes() + twee.getKaartjes() + drie.getKaartjes() + vier.getKaartjes() + vijf.getKaartjes(); 
		//System.out.println("Botsautos: " + nul.getKaartjes() + "\nSpin: " + een.getKaartjes() + "\nSpiegelPaleis: " + twee.getKaartjes() +"\nSpookhuis: " + drie.getKaartjes() + "\nHawaii: " + vier.getKaartjes() + "\nLadderKlimmen: " + vijf.getKaartjes());
		return aantalKaartjes + aantalKaartjesB;
	}

	public double omzet (double prijsAttractie, int keuzeVP) {
		double omzet = prijsAttractie * keuzeVP;
		standVanZaken = omzet + standVanZaken;
		return omzet;
	}
	

	public static void menuKiezen (Kermis km, Attractie[] arr2) {
		System.out.println("Typ [o] voor de omzet, typ [k] voor aantal kaartjes verkocht. Typ [v] voor verkoop.");
		Scanner sc = new Scanner(System.in);
		String check = sc.nextLine();
		switch (check) {
		case "o" : 
			System.out.println("De totale omzet is " + standVanZaken + " euro.");
			break;
		case "k" :
			System.out.println("Het totale aantal kaartjes verkocht is: " + aantalKaartjesBerekenen(arr2[0], arr2[1], arr2[2],arr2[3],arr2[4], arr2[5]));
			System.out.println("Botsautos: " + arr2[0].getKaartjes() + "\nSpin: " + arr2[1].getKaartjes() + "\nSpiegelPaleis: " + arr2[2].getKaartjes() +"\nSpookhuis: " + arr2[3].getKaartjes() + "\nHawaii: " + arr2[4].getKaartjes() + "\nLadderKlimmen: " + arr2[5].getKaartjes());
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
