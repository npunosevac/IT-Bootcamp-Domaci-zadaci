package domaciZadatakFor22042021;

import java.util.Scanner;

public class For3 {

	public static void main(String[] args) {

		/*
		 For3: Napraviti program koji ce odstampati na standardnom izlazu trougao od
		 zvezdica. Ako je unet broj 5 (korisnik unosi broj), trougao ce izgledati
		 ovako:
		 */

		// *****
		// ****
		// ***
		// **
		// *

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi broj zvezdica: ");
		int brojZvezda = sc.nextInt();
		
		for (int i = 1; i <= brojZvezda; i++) {
			for (int j = brojZvezda; j >= i; j--) {
				System.out.print("*");
			}	
			System.out.println();
		}
	}

}
