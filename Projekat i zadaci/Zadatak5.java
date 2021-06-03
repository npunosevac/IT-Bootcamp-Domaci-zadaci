package domaciZadaciJava05052021;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		// 5. Cest zadatak na intervju:
		// Napisati program gde korisnik unosi n brojeva i ispisuje maksimalni i
		// minimalni broj.

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite duzinu niza brojeva: ");
		int n = sc.nextInt();
		int niz[] = new int [n];
		int i;
		int min, max;

		for (i = 0; i < n; i++) {
			System.out.println("Unesite broj: " + (i + 1) + " ");
			niz[i] = sc.nextInt();
		}
		max = niz[0];
		min = niz[0];
			for (i = 0; i < n; i++) {
				if (min > niz[i]) {
					min = niz[i];
				} 
				if (max < niz[i]) {
					max = niz[i];
				} 
			}			
		
		System.out.println("Maksimalni broj je: " + max);
		System.out.println("Minimalni broj je: " + min);	
	}
}
