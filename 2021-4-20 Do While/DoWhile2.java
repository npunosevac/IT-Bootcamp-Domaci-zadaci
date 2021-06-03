package doWhileDomaci2042021;

import java.util.Scanner;

public class DoWhile2 {

	public static void main(String[] args) {
		// Napisati program koji ce korisniku ispisati poruku
		// da li je ceo pozitivan broj koji je uneo palindrom ili nije palindrom.
		// (palindromi -> isto mu dodje citali sleva nadesno ili s desne na levu stranu).

		Scanner sc = new Scanner(System.in);
		
		int num;
		int x;
		int y;
		int zbir;

		System.out.println("Unesite broj: ");
		num = sc.nextInt();

		x = num;
		y = 0;
		zbir = 0;
		
		while (num > 0) {
			y = num % 10;
			zbir = zbir * 10 + y;
			num = num / 10;
		}
		if (x == zbir) {
			System.out.println("Broj je palindrom.");
		} 
		else {
			System.out.println("Broj nije palindrom.");
		}
	}

}
