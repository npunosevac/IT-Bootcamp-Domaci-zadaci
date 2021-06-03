package domaciZadatak26042021;

import java.util.Scanner;

public class DodatniFunkcije3 {

	public static void main(String[] args) {
		/*DodatniFunkcije3: -> spojena prva dva zadatka sa malo izmenjenim zahtevima -> 
		 Napisati program koji ce procitati 3 cela broja sa standardnog ulaza
		 i poziva i ispisuje dve metode. Prva ispisuje zbir tri unesena broja, a druga vraca najveci od unetih brojeva.*/
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Uneti broj a: ");
		int a = sc.nextInt();
		System.out.println("Uneti broj b: ");
		int b = sc.nextInt();
		System.out.println("Uneti broj c: ");
		int c = sc.nextInt();	
		
		int zbir = zbirBrojeva(a, b, c);
		System.out.println("Zbir brojeva je: ." + zbir);
		
		int maks = max(a, b, c);
		System.out.println("Najveci od unetih brojeva je ." + maks);
	}
	
	public static int zbirBrojeva(int a, int b, int c) {
		return a + b + c;
	}
	
	public static int max(int a, int b, int c) {
		if (a > b && a > c) {
			return a;
		}
		else if (b > c) {
			return b;
		}
		else {
			return c;
		}
	}

}
