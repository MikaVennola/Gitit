import java.util.Scanner;
import java.util.Random;
import java.util.Scanner;

public class Gittiharjoitus {

	public static void main(String[] args) {
		
		Random random = new Random ();
		
		Scanner in = new Scanner(System.in);
		int [] guesses = new int [7];
		int [] rightnumbers = new int [7];
		int laskuri = 0;
		// Arpoo numerot
			for (int i = 0 ; i< rightnumbers.length ; i++) {
			int numerot = random.nextInt(6);
			System.out.print(numerot + " ");
			rightnumbers [i] = numerot;
			
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException ex){
				Thread.currentThread().interrupt();
			}
			
			}
			for (int i = 0; i < 20; i++) {
				System.out.println();
			}
			// Käyttäjän arvaukset
			for (int i = 0 ; i< guesses.length ; i++) {
				System.out.println("Syötä " + (i+1) + ". numero");
				int vastaus = Integer.parseInt(in.nextLine());
				guesses [i] = vastaus;
			}
		
		System.out.println("Käyttäjän arvaukset: ");
		for (int i = 0; i<guesses.length ; i++) {
		System.out.print(guesses[i] + " ");
		}
		System.out.println();
		System.out.println("Oikeat numerot: ");
		for (int i = 0; i<rightnumbers.length ; i++) {
			System.out.print(rightnumbers[i] + " ");
			}
		
		for (int i = 0 ; i < guesses.length; i++) {
		if (rightnumbers[i] == guesses[i]) {
			laskuri = laskuri + 1;
		}
	
		}
		float prosentti = (laskuri*100)/guesses.length;
		System.out.println();
		System.out.println("Oikeita numeroita oli: " + laskuri);
		System.out.println("Prosenttia oikein pelistä: " + prosentti);
	}
}
