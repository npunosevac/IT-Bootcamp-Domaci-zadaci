package prvi;

import java.util.Scanner;

public class DomaciPovrsinaProstorije {

	public static void main(String[] args) {

		/* Napisati program koji ce racunati povrsinu okrecene prostorije, tako sto se
		 ivice prostorije ucitavaju preko konzole. (za pretpostavku uzeti da
		 prostorija ima zidove oblika pravougaonika i da nema prozora i vrata).*/

		Scanner s = new Scanner(System.in);

		System.out.println("Unesite duzinu zida:");
		double a = s.nextDouble();

		System.out.println("Unesite sirinu zida:");
		double b = s.nextDouble();

		System.out.println("Unesite visinu zida:");
		double h = s.nextDouble();

		double povrsinaProstorije = 2*(a+b)*h+(a*b);

		System.out.println("Prikazi povrsinu prostorije = " + povrsinaProstorije);
		double Povrsina = s.nextDouble();
	}
}