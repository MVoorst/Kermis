package Kermis;

import java.util.Scanner;

public class Kermis {
	public static void main (String [] args) {
		Attractie botsauto = new Botsautos();
		Attractie spin = new Spin();
		Attractie spiegelpaleis = new Spiegelpaleis();
		Attractie spookhuis = new Spookhuis();
		Attractie hawaii = new Hawaii();
		Attractie ladderklimmen = new Ladderklimmen();
		Kassa kassa = new Kassa();
		
		int i = 0;
		do {
			System.out.println("Welkom bij KermisKassa 3000 \nU heeft de keuze uit de onderstaande keuzes: \n1 -- Botsauto's \n2 -- Spin \n3 -- Spiegelpaleis \n4 -- Spookhuis \n5 -- Hawaii \n6 -- Ladderklimmen \nVoer Uw Keuze in:");
			Scanner sc = new Scanner(System.in);
			int keuze = sc.nextInt();
			int keuzeDraaien = keuze;
			switch (keuze) {
				case 1:
					System.out.println("U heeft gekozen voor de Botsauto's!");
					kassa.omzet(botsauto);
					botsauto.draaien();
					break;
				case 2:
					System.out.println("U heeft gekozen voor Spin");
					kassa.omzet(spin);
					spin.draaien();
					break;
				case 3:
					System.out.println("U heeft gekozen voor het Spiegelpaleis");
					kassa.omzet(spiegelpaleis);
					spiegelpaleis.draaien();
					break;
				case 4:
					System.out.println("U heeft gekozen voor het Spookhuis");
					kassa.omzet(spookhuis);
					spookhuis.draaien();
					break;
				case 5:
					System.out.println("U heeft gekozen voor Hawaii");
					kassa.omzet(hawaii);
					hawaii.draaien();
					break;
				case 6:
					System.out.println("U heeft gekozen voor Ladderklimmen");
					kassa.omzet(ladderklimmen);
					ladderklimmen.draaien();
					break;
				}
			i++;
			System.out.println(kassa.standVanZaken);
		} while ( i  < 3);
		System.out.println("De totale omzet is " + kassa.standVanZaken + " euro.");
	}
}
