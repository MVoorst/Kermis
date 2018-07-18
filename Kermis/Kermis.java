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
			
			kassa.checken();
			
			i++;
		}while (i < 4);
		System.out.println("De totale omzet is " + kassa.standVanZaken + " euro.");
	}
}
