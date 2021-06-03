package domaciZadaciJava05052021;

import java.util.Scanner;

public class Zadatak6 {

	public static void main(String[] args) {
		// 6. Napisati program koji ucitava duzinu niza, niz i ispisuje niz inverznim
		// redosledom.
		// Primer niza: 32 54 123 18
		// Ispis: 18 123 54 32

		Scanner sc = new Scanner(System.in);
		
		int [] niz = new int [] {32, 54, 123, 18};
		System.out.println("Duzina niza je: " + niz.length);
		
		System.out.println(" ");
		
		System.out.println("Postojeci niz: ");
		
	    for(int i=0; i < niz.length; i++)
	         System.out.print(niz[i] + " ");
	     
	    System.out.println(" ");
	    System.out.println(" ");
	     	   
	    System.out.println("Postojeci niz inverznim redosledom:");
	    
	         for(int i = niz.length-1; i >= 0; i--)
	         System.out.print(niz[i] + " ");
	}
}
