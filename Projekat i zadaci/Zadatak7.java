package domaciZadaciJava05052021;

import java.util.Scanner;

public class Zadatak7 {
	
	public static void main(String[] args) {
		//Napisati program koji ucitava duzinu niza, niz i proverava da li je niz rastuci.
		//Primer1 niza: 3 54 123 18
		//Ispis: Niz nije rastuci.
		//Primer2 niza: 71 422 1001 5054
		//Ispis: Niz je rastuci.
		

		Scanner sc = new Scanner(System.in);
		
		int [] niz = new int [] {3, 54, 123, 18};
		System.out.println("Duzina niza je: " + niz.length);
		
		int n = niz[0];
		
		boolean rastuci = false;
		
		    for (int i = 1; i < niz.length; i++) {
		        if (n < niz[i]) {
		        	n = niz[i];
		        }
		        else {
		        	rastuci = true;
		        	break;
		        }
		    }
		    if (rastuci) {
		    	System.out.println("Niz nije rastuci!");
		    }
		    else {
		    	System.out.println("Niz je rastuci!");
		    }
	}

}
