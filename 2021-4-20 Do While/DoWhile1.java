package doWhileDomaci2042021;

import java.util.Scanner;

public class DoWhile1 {

	public static void main(String[] args) {
		/* DoWhile1: Napisati program koji ce omoguciti Peri da unese sa koliko novca
		 * raspolaze. On moze da kupuje sve dok mu ne ostane samo 89 dinara jer mu
		 * toliko novca treba da kupi BUSPLUS kartu i vrati se kuci sa novogodisnjim
		 * poklonima. Pera treba da unosi pojedinacne cene poklona, a program treba da
		 * ga obavesti kada potrosi sav predvidjeni novac, to jest kada za sledeci
		 * poklon vise nema kinte. */
		
		//Nisam predao iz razloga sto nisam bio siguran da li sam dobro ocenio poentu zadatka

		Scanner sc = new Scanner(System.in);

		System.out.println("Uneti sa koliko novca raspolaze Pera: ");
		int novac = sc.nextInt();
		int cenaPoklona;

		do {
			System.out.println("Uneti cenu poklona: ");
			cenaPoklona = sc.nextInt();
			if (novac - cenaPoklona < 89) {
				break;
			}
			novac = novac - cenaPoklona;
		} while (novac > 89);

		System.out.println("Pera nema vise novca");
		System.out.println(novac);
	}

}
