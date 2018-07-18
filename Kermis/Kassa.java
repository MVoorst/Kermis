package Kermis;
import java.util.Random;
import java.util.Scanner;

public class Kassa {
	double standVanZaken = 0;

	public double omzet (Attractie ba) {
		System.out.println("Hoeveel personen willen in de attractie?");
		Scanner sc = new Scanner(System.in);
		int keuze = sc.nextInt();
		double omzet = Botsautos.prijs * keuze;
		ba.counter = keuze;
		System.out.println(omzet);
		System.out.println(Botsautos.prijs);
		standVanZaken = omzet + standVanZaken;
		return omzet;
	}
	
	public void kiezen() {
		int i = 0;
		System.out.println("Welkom bij KermisKassa 3000 \nU heeft de keuze uit de onderstaande keuzes: \n1 -- Botsauto's \n2 -- Spin \n3 -- Spiegelpaleis \n4 -- Spookhuis \n5 -- Hawaii \n6 -- Ladderklimmen \nVoer Uw Keuze in:");
		Scanner sc = new Scanner(System.in);
		int keuze = sc.nextInt();
		int keuzeDraaien = keuze;
		switch (keuze) {
			case 1:
				System.out.println("U heeft gekozen voor de Botsauto's!");
//				omzet(botsauto);
//				botsauto.draaien();
				break;
			case 2:
				System.out.println("U heeft gekozen voor Spin");
//				omzet(spin);
//				spin.draaien();
				break;
			case 3:
				System.out.println("U heeft gekozen voor het Spiegelpaleis");
//				omzet(spiegelpaleis);
//				spiegelpaleis.draaien();
				break;
			case 4:
				System.out.println("U heeft gekozen voor het Spookhuis");
//				omzet(spookhuis);
//				spookhuis.draaien();
				break;
			case 5:
				System.out.println("U heeft gekozen voor Hawaii");
//				omzet(hawaii);
//				hawaii.draaien();
				break;
			case 6:
				System.out.println("U heeft gekozen voor Ladderklimmen");
//				omzet(ladderklimmen);
//				ladderklimmen.draaien();
				break;
			}
		
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
