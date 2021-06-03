package domaciZadaciJava05052021;

import java.util.Scanner;

public class Zadatak8 {

	public static void main(String[] args) {

		// Ovaj kod predstavlja kalkulator povrsina
		// kvadrata, pravougaonika i kruga.
		// Povrsina se bira tako sto se unese kao tekst odgovarajuca figura.
		// Ukoliko se unese 'izadji', program treba da se zavrsi.
		// Program treba da se ponavlja dokle god se ne unese izadji.

		// sve sto mogao naci a da nije bilo dobro napisano u kodu, upisao sam kao
		// komentar i promenio u kodu

		Scanner sc = new Scanner(System.in);
		String figura;
		while (true) {
			figura = sc.nextLine();
			switch (figura) {
			case "kvadrat":
				racunajKvadrat();
			case "pravougaonik": // treba pravougaonik a ne pravougaionik
				racunajPravougaonik();
			case "krug":
				racunajKrug();
			case "izadji":
				return;
			}
		}
	}

	public static void racunajKrug() {
		Scanner sc = new Scanner(System.in);
		double r;
		r = sc.nextDouble();
		if (r <= 0) {
			System.out.println("Los unos!"); // radi
			return;
		}
		System.out.println("Povrsina kruga je: " + pKruga(r)); // los unos sop-a umesto Povrsina pravougaionika, treba
																// povrsina kruga
	}

	public static void racunajPravougaonik() {
		Scanner sc = new Scanner(System.in);
		double a, b;
		a = sc.nextDouble();
		b = sc.nextDouble();
		if (a <= 0 || b <= 0) {
			System.out.println("Los unos!");
			return;
		}
		System.out.println("Povrsina pravougaionika je: " + pPravougaonika(a, b));

	}

	public static void racunajKvadrat() {
		Scanner sc = new Scanner(System.in);
		double a;
		a = sc.nextDouble();
		if (a <= 0) {
			System.out.println("Los unos!"); // radi
			return;
		}
		System.out.println("Povrsina kvadrata je: " + pKvadrata(a)); // umesto pKruga(a);

	}

	public static double pKruga(double r) {
		return r * r * 3.14;
	}

	public static double pKvadrata(double a) { // mora double a, a ne int a
		return a * a; // povrsina kvadrata nije bila dobra, bilo je a*a*a
	}

	public static double pPravougaonika(double a, double b) {
		return a * b;
	}
}
