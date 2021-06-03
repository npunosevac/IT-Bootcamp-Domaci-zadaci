package grananjaDomaciZadatak;

import java.util.Scanner;

public class Grananja3 {

	public static void main(String[] args) {
		
		/*Grananja3: Napisati program koji na osnovu unetog naziva meseca
		 ispisuje koliko ima meseci u godini koji pocinju na to slovo(na taj glas)
		 - za resavanje ovog zadatka koristiti switch*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesi naziv meseca: ");
		String month = sc.nextLine();
		
		switch (month) {
		case "Januar":
		case "januar":
		case "Jun":
		case "jun":
		case "Jul":
		case "jul":
			System.out.println("U godini ima 3 meseca koji pocinju na slovo J.");
			break;
		case "Mart":
		case "mart":
		case "Maj":
		case "maj":
			System.out.println("U godini ima 2 meseca koji pocinju na slovo M.");
			break;
		case "April":
		case "april":
		case "Avgust":
		case "avgust":
			System.out.println("U godini ima 2 meseca koji pocinju na slovo A.");
			break;
		case "Februar":
		case "februar":
			System.out.println("U godini ima 1 mesec koji pocinje na slovo F.");
			break;
		case "Septembar":
		case "septembar":
			System.out.println("U godini ima 1 mesec koji pocinje na slovo S.");
			break;
		case "Oktobar":
		case "oktobar":
			System.out.println("U godini ima 1 mesec koji pocinje na slovo O.");
			break;
		case "Novembar":
		case "novembar":
			System.out.println("U godini ima 1 mesec koji pocinje na slovo N.");
			break;
		case "Decembar":
		case "decembar":
			System.out.println("U godini ima 1 mesec koji pocinje na slovo D.");
			break;
		default:
			System.out.println("Nepostojeci mesec");
		}

	}

}
