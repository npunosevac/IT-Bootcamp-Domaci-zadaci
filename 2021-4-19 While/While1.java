package whilePetljeDomaci;

import java.util.Scanner;

public class While1 {

	public static void main(String[] args) {

		/*Napisati program koji unosi i sabira brojeve dokle god nije unesen negativan
		 * broj, i ispisuje njihov zbir (zbir pozitivnih brojeva). primer: ako korisnik
		 * unese 1 2 5 3 -1, program treba da ispise 11*/

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int zbir = 0;

		while (x >= 0) {
			zbir = zbir + x;
			x = sc.nextInt();
		}
		System.out.println(zbir);
	}

}
