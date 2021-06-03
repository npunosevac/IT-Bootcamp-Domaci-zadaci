package domaciZadatakVezbanje23042021;

import java.util.Scanner;

public class Vezbanje1 {

	public static void main(String[] args) {
		/*Napisati program koji ima meni za samousluznu kasu u prodavnici. Meni za potrosace sadrzi sledece opcije:
		0 - Izlaz iz programa (zatvaranje kase)
		1 - dodavanje cene proizvoda na racun (ubacivanje u potrosacku korpu)
		2 - naplata racuna
		Ukoliko korisnik unese opciju 0 program se zavrsava.
		Ukoliko korisnik unese opciju 1 program pita korisnika da unese cenu proizvoda i ta cena se dodaje na racun u prodavnici.
		Ukoliko korisnik unese opciju 2 program pita korisnika da unese kolicinu novca za naplatu racuna.
		Ukoliko korisnik unese vrednost manju od vrednosti racuna, potrebno je da se ispise greska, bez umanjenja racuna 
		i da se ponovo ispise meni.
		Ukoliko korisnik unese vrednost vecu ili jednaku od cene racuna ispisuje se kusur i racun se ponovo postavlja na nulu.
		Zatim se ponovo ispisuje meni.*/
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Izaberite opciju: ");
		int opcija = 0;
		opcija = sc.nextInt();		
		
		int cenaProizvoda = 0;
		int racun = 0;
		int novac = 0;
		int kusur = 0;
		
		switch (opcija) {
			case 0: 
				System.out.println("Program se zavrsava.");
				break;
			case 1:
				System.out.println("Unesite cenu proizvoda: ");
				cenaProizvoda = sc.nextInt();
				racun = cenaProizvoda + racun;
				System.out.println("Vas racun je: " + racun + " dinara.");				
				break;
			case 2: 
				System.out.println("Unesite kolicinu novca: ");	
				novac = sc.nextInt();
				System.out.println("Unesite cenu proizvoda: ");	
				cenaProizvoda = sc.nextInt();	
				if (novac - cenaProizvoda < racun) {
					novac = novac - cenaProizvoda;
				 	System.out.println("Greska!");
				}
				if (novac - cenaProizvoda >= racun) {
					racun = novac - cenaProizvoda;
					System.out.println("Kusur: " + racun);
					racun = 0;
				}
				default:
					System.out.println("Meni: ");
					System.out.println("0. Izlaz iz programa (zatvaranje kase)");
					System.out.println("1. Dodavanje cene proizvoda na racun (ubacivanje u potrosacku korpu)");
					System.out.println("2. Naplata racuna");
					break;
			}
	}
}
