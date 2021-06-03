package domaciZadaciJava05052021;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		// 1. Napisati program koji ispisuje koliko cifara ima uneti broj n.
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite n broj: ");
		int broj = sc.nextInt();
		int count = 0;

	    while (broj != 0) {
	    	
	      broj = broj / 10;
	      
	      count++;
	    }
	    System.out.println("Broj cifara: " + count);

	}

	}


