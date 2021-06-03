package grananjaDomaciZadatak;

import java.util.Scanner;

public class Grananja4 {

	public static void main(String[] args) {
		
		/*Napisati program koji na osnovu unete godine i meseca ispisuje koliko taj mesec ima dana.
		 (Vodite racuna o prestupnoj godini!)*/
		
		Scanner sc = new Scanner(System.in);
		
		int mesec;
		int godina;
		
		System.out.println("Unesite numericki broj meseca u godini:");
		mesec = sc.nextInt();
		
		System.out.println("Unesite numericki godinu:");
		godina = sc.nextInt();
		

		switch (mesec) {
		case 1:
			System.out.println("Januar " + godina + " ima 31 dan.");
			break;
		case 2:
			if (godina % 4 == 0) {
				System.out.println("Februar " + godina + " ima 29 dana.");
			} 
			else {
				System.out.println("Februar " + godina + " ima 28 dana.");
			}
			break;
		case 3:
			System.out.println("Mart " + godina + " ima 31 dan.");;
		case 4:
			System.out.println("April " + godina +" ima 30 dana.");
			break;
		case 5:
			System.out.println("Maj " + godina + " ima 31 dan.");
			break;
		case 6:;
			System.out.println("Jun " + godina + " ima 30 dana.");
			break;
		case 7:
			System.out.println("Jul " + godina + " ima 31 dan.");
			break;
		case 8:
			System.out.println("Avgust " + godina + " ima 31 dan.");;
		case 9:
			System.out.println("Septembar " + godina + " ima 30 dana.");
			break;
		case 10:
			System.out.println("Oktobar " + godina + " ima 31 dan.");
			break;
		case 11:
			System.out.println("Novembar " + godina + " ima 30 dana.");
			break;
		case 12:
			System.out.println("Decembar " + godina + " ima 31 dan.");
			break;
		default:
			System.out.println("Unesen nepostojeci mesec u godini.");
	}
}
}
