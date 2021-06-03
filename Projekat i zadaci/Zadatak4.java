package domaciZadaciJava05052021;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		// 4. Napisati program koji za tri unete ocene ispisuje srednju vrednost i u
		// numerièkom i opisnom obliku (opisan oblik - odlican, vrlo dobar, dobar,
		// dovoljan, nedovoljan)

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite prvu ocenu: ");
		int ocena1 = sc.nextInt();
		System.out.println("Unesite drugu ocenu: ");
		int ocena2 = sc.nextInt();
		System.out.println("Unesite trecu ocenu: ");
		int ocena3 = sc.nextInt();

		double srednjaOcena = (ocena1 + ocena2 + ocena3) / 3;

		System.out.print("Srednja ocena je " + srednjaOcena);

		if (srednjaOcena > 4.5) {
			System.out.println(" Odlican.");
		} 
		else if (srednjaOcena > 3.5) {
			System.out.println(" Vrlo dobar.");
		} 
		else if (srednjaOcena > 2.5) {
			System.out.println(" Dobar.");
		} 
		else if (srednjaOcena > 2) {
			System.out.println(" Dovoljan.");
		} 
		else {
			System.out.println(" Nedovoljan.");
		}

	}

}
