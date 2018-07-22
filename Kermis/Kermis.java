package Kermis;

import java.util.Scanner;

public class Kermis {
	static Attractie[] attracties;
	static Kassa kassa;
	
	Kermis() {
        Attractie botsauto = new Botsautos();
        RisicoRijkeAttracties spin = new Spin();
        Attractie spiegelpaleis = new Spiegelpaleis();
        Attractie spookhuis = new Spookhuis();
        RisicoRijkeAttracties hawaii = new Hawaii();
        Attractie ladderklimmen = new Ladderklimmen();
        kassa = new Kassa();

        attracties = new Attractie[6];
        attracties[0] = botsauto;
        attracties[1] = (Attractie) spin;
        attracties[2] = spiegelpaleis;
        attracties[3] = spookhuis;
        attracties[4] = (Attractie) hawaii;
        attracties[5] = ladderklimmen;
	}
	
	public void ticketGekocht(int keuzeVoorAttractie, int keuzeVoorPersonen) {

        if (keuzeVoorAttractie > attracties.length - 1) {
            System.out.println("Dit is niet bekend.");
        } else {
        	System.out.println("U heeft gekozen voor de " + attracties[keuzeVoorAttractie].getNaam() + " met " + keuzeVoorPersonen+ " perso(o)n(en)."); 
        	kassa.omzet(attracties[keuzeVoorAttractie].getPrijs(), keuzeVoorPersonen);
        	attracties[keuzeVoorAttractie].setKaartjes(keuzeVoorPersonen);
        	kassa.aantalKaartjesBerekenen(attracties[0], attracties[1], attracties[2], attracties[3], attracties[4], attracties[5]);
         	attracties[keuzeVoorAttractie].draaien();
         	System.out.println(attracties[keuzeVoorAttractie].getDraaien());
        }
       
    }
	
	public static void main (String [] args) {
		Kermis kermis = new Kermis();
		int i = 0;
		do {
		kassa.menuKiezen(kermis,attracties);
		if (((RisicoRijkeAttracties) attracties[1]).opstellingsKeuring() == true || ((RisicoRijkeAttracties) attracties[4]).opstellingsKeuring() == true) {
			Scanner sc1 = new Scanner(System.in);
			String monteur = sc1.nextLine();
			System.out.println("Attractie heeft onderhoud nodig, druk op [m] om een monteur in te huren om de Spin en Hawaii te laten repareren.");
			if (monteur == "m") {
				((RisicoRijkeAttracties) attracties[1]).setAantalDraaien();
				((RisicoRijkeAttracties) attracties[4]).setAantalDraaien();
				System.out.println("Hawaii en Spin zijn weer klaar voor gebruik!");
			}
		}else {
			kassa.menuKiezen(kermis,attracties);
		
		}
		i++;
		}while (i<100);
		
	}
}
