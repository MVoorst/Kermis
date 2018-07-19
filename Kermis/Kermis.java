package Kermis;

import java.util.Scanner;

public class Kermis {
	Attractie[] attracties;
	Kassa kassa;
	
	Kermis() {
        Botsautos botsauto = new Botsautos();
        Spin spin = new Spin();
        Spiegelpaleis spiegelpaleis = new Spiegelpaleis();
        Spookhuis spookhuis = new Spookhuis();
        Hawaii hawaii = new Hawaii();
        Ladderklimmen ladderklimmen = new Ladderklimmen();
        kassa = new Kassa();

        attracties = new Attractie[6];
        attracties[0] = botsauto;
        attracties[1] = spin;
        attracties[2] = spiegelpaleis;
        attracties[3] = spookhuis;
        attracties[4] = hawaii;
        attracties[5] = ladderklimmen;
	}
	
	public void ticketGekocht(int keuzeVoorAttractie, int keuzeVoorPersonen) {

        if (keuzeVoorAttractie < 0 || keuzeVoorAttractie > attracties.length - 1) {
            System.out.println("Dit is niet bekend.");
        } else {
            Attractie attractie = attracties[keuzeVoorAttractie];
            System.out.println("U heeft gekozen voor de " + attractie.naam);
            kassa.omzet(attractie.getPrijs());
            attractie.draaien();
        }
       
    }
	
	public static void main (String [] args) {
		Kermis kermis = new Kermis();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welkom bij KermisKassa 3000! \nU heeft de keuze uit de onderstaande keuzes: \n0 -- Botsauto's \n1 -- Spin \n2 -- Spiegelpaleis \n3 -- Spookhuis \n4 -- Hawaii \n5 -- Ladderklimmen \nVoer Uw Keuze in:");
        int keuzeVoorAttractie = sc.nextInt();
        System.out.println("Hoeveel personen willen in de attractie?");
        int keuzeVoorPersonen = sc.nextInt();
        kermis.ticketGekocht(keuzeVoorAttractie-1, keuzeVoorPersonen);
	
	}
}
