package domaciZadatak27042021Nizovi;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		/* Napisati program koji izracunava proizvod elemenata niza tipa int, koji su
		 * veci od njihovog indeksa. Za unos niza i za proizvod koristiti zasebno
		 * metode. Duzina niza i unos niza ucitavaju se sa standardnog ulaza. Primer
		 * ucitanog niza: 3 7 1 4 2 5 Primer izracunatog proizvoda: 84  */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Uneti duzinu niza: ");
		int duzina = sc.nextInt();
		
		int niz[] = new int [duzina];
		
		for (int i = 0; i < duzina; i++) {
			System.out.println("Unesite " + (i + 1) + ". element niza.");
			niz[i] = sc.nextInt();
	}
		mnozenje(niz);
		int proizvod = mnozenje(niz);
		System.out.println("Proizvod elementa niza je: " + proizvod);
		

	}
	public static int mnozenje(int [] nizic) {
		int proizvod = 1;
		
		for (int i = 0; i < nizic.length; i++) {
			proizvod = proizvod * nizic[i];
		}
		return proizvod;
	}
	
}