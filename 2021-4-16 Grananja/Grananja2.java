package domacizadatak;

import java.util.Scanner;

public class Grananja2 {

	public static void main(String[] args) {

		/* Grananja2: Prvi domaci zadatak od 15.4.2021. uraditi ponovo, koristeci
		 grananja kako bismo se ogradili od nemogucih izracunavanja povrsina (kakvi
		 celi brojevi moraju da budu visina, sirina i duzina?)*/

		Scanner sc = new Scanner(System.in);

		System.out.println("Duzina je: ");
		int a = sc.nextInt();

		System.out.println("Sirina je: ");
		int b = sc.nextInt();

		System.out.println("Visina je: ");
		int h = sc.nextInt();

		if (a <= 0 && b <= 0 && h <= 0) {
			System.out.println("Uneli ste negativan broj ili nulu.");
		} else {
			System.out.println("Povrsina prostorije je: " + 2*(a+b)*h+(a*b) );
		}
	}
}
