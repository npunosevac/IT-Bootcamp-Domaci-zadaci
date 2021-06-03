package whilePetljeDomaci;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		
		/*Napisati program koji ce na standardnom izlazu ispisati poruku “Laku noc!”
		 	onoliko puta koliko je korisnik zadao preko konzole.
			Primer: ako korisnik unese broj 20, poruku Laku noc! treba ispisati 20 puta */
		
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		System.out.println("Unestite y vrednost numericki: ");
		int y = sc.nextInt();
		
		while (x < y) {
			System.out.println("Laku noc!");
			x++;
		}
	}
}
