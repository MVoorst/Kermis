package Kermis;

import java.util.Scanner;

public class Kermis {
	Attractie[] attracties;
	static Kassa kassa;
	
	Kermis() {
        Botsautos botsauto = new Botsautos();
        Spin spin = new Spin();
        Attractie spiegelpaleis = new Spiegelpaleis();
        Attractie spookhuis = new Spookhuis();
        Attractie hawaii = new Hawaii();
        Attractie ladderklimmen = new Ladderklimmen();
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

        if (keuzeVoorAttractie > attracties.length - 1) {
            System.out.println("Dit is niet bekend.");
        } else {
        	System.out.println("U heeft gekozen voor de " + attracties[keuzeVoorAttractie].getNaam()); 
        	kassa.omzet(attracties[keuzeVoorAttractie].getPrijs(), keuzeVoorPersonen);
        	System.out.println(attracties[keuzeVoorAttractie].getPrijs());
        	attracties[keuzeVoorAttractie].draaien();
        }
       
    }
	
	public static void main (String [] args) {
		Kermis kermis = new Kermis();
		kassa.menuKiezen(kermis);
/*        Scanner sc = new Scanner(System.in);
        System.out.println("Welkom bij KermisKassa 3000! \nU heeft de keuze uit de onderstaande keuzes: \n0 -- Botsauto's \n1 -- Spin \n2 -- Spiegelpaleis \n3 -- Spookhuis \n4 -- Hawaii \n5 -- Ladderklimmen \nVoer Uw Keuze in:");
        int keuzeVoorAttractie = sc.nextInt();
        System.out.println("Hoeveel personen willen in de attractie?");
        int keuzeVoorPersonen = sc.nextInt();
        kermis.ticketGekocht(keuzeVoorAttractie, keuzeVoorPersonen);
  */
	}
}
