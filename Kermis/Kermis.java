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
        	
        	attracties[keuzeVoorAttractie].setKaartjes(keuzeVoorPersonen);
        	kassa.aantalKaartjesBerekenen(attracties[0], attracties[1], attracties[2], attracties[3], attracties[4], attracties[5]);
        	System.out.println(attracties[keuzeVoorAttractie].getKaartjes());
        	
        	//System.out.println(attracties[keuzeVoorAttractie].aantalKaartjes); // gaat niet want hij pakt niet de waarde van de child, maar de parent
        	System.out.println(attracties[keuzeVoorAttractie].getPrijs());
        	attracties[keuzeVoorAttractie].draaien();
        }
       
    }
	
	public static void main (String [] args) {
		Kermis kermis = new Kermis();
		int i = 0;
		do {
		kassa.menuKiezen(kermis);
		i++;
		}while (i<100);
		
	}
}
