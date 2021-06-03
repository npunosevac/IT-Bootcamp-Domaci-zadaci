package nizovi;

import java.util.Scanner;

public class Nizovi {

	public static void main(String[] args) {
		/* Napisati program na programksom jeziku Java koji sluzi za pronalazenje
		 * minimuma u nizu. Korisnik preko standardnog ulaza unosi duzinu niza, a zatim
		 * i elemente niza koji su celi brojevi. Ukoliko korisnik unese nevalidnu
		 * vrednost za duzinu niza ispisati poruku o tome i prekinuti izvrsavanje
		 * programa. Pretpostaviti da ce korisnik uneti prirodne brojeve za elemente
		 * niza. Ucitavanje niza izvrsiti u zasbnoj funkciji. Napisati funkciju minimum
		 * kojoj se prosledjuje uneti niz. Funkcija pronalazi minimalan element niz i
		 * vraca njegovu vrednost. Napisati funkciju ponavljanja kojoj se prosledjuje
		 * zadati niz i koja vraca broj ponavljanja minimalnog elemenata niza (npr za
		 * niz 1 2 4 1 6 1 vraca 3). Ispisati na standardni izlaz minimalni element i
		 * broj njegovih ponavljanja.  */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite duzinu niza: ");
		int duzina = sc.nextInt();
		
		if (duzina <= 0) {
			System.out.println("Uneta je nevalidna vrednost duzine niza!");
		}
		else {
			int [] niz = new int [duzina];
			ucitaj(niz);
			int min = minimum(niz);
			System.out.println("Minimalni element je: " + min);
			int pon = ponavljanja(niz);
			System.out.println("Broj ponavljanja je " + pon);
		}	
		
	}
	
	public static void ucitaj(int [] niz) {
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < niz.length; i++) {
			System.out.println("Unesite " + (i + 1) + " element niza.");
			niz[i] = sc.nextInt();
		}
	}
	
	public static int minimum(int [] niz) {
		int min = niz[0];
		for (int i = 0; i < niz.length; i++) {
			if (niz [i] < min) {
				niz [i] = min;
			}
		}
		return min;
	}
	
	public static int ponavljanja(int [] niz) {
		int min = minimum(niz);
		int brojac = 0;
		for (int i = 0; i < niz.length; i++) {
			if (niz [i] == min) {
				brojac++;
			}
		}
		return brojac;
	}
}
