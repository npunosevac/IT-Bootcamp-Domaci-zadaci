package domaciZadatak26042021;

import java.util.Scanner;

public class Funkcije1 {

	public static void main(String[] args) {
		/*Funkcije1: Napisati program koji ce procitati 3 cela broja sa standardnog ulaza
		  (znaci da korisnik unosi tri broja) i taj program treba da pozove
		  i ispise (u mainu) najmanji od ta tri unesena broja.*/
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Uneti broj a: ");
		int a = sc.nextInt();
		System.out.println("Uneti broj b: ");
		int b = sc.nextInt();
		System.out.println("Uneti broj c: ");
		int c = sc.nextInt();			
		
		min(a, b, c);
		
	}
	
	public static void min(int a, int b, int c) {
		
		if (a < b && a < c) {
			System.out.println("Najmanji je " + a);
		}
		else if (b < c) { 
			System.out.println("Najmanji je " + b);
		}
		else {
			System.out.println("Najmanji je " + c);
		}
		
	}

}
