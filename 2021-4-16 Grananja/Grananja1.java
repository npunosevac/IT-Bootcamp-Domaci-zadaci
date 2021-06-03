package domacizadatak;

import java.util.Scanner;

public class Grananja1 {

	public static void main(String[] args) {

		/*Grananja1: Napisati program koji proverava da li je uneti broj paran. Ukoliko
		 * jeste, program treba da ispise poruku: Broj je paran! Ukoliko nije, program
		 * treba da ispise poruku: Broj je neparan!*/

		System.out.println("Unesite broj: ");
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("Broj je paran!");
		} 
		else {
			System.out.println("Broj je neparan!");
		}
	}
}
