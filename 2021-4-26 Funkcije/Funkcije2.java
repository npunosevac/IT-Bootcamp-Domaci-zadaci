package domaciZadatak26042021;

import java.util.Scanner;

public class Funkcije2 {

	public static void main(String[] args) {
		/*Funkcije2: Napisati program koji ce procitati 3 cela broja sa standardnog ulaza
		  i taj program treba da pozove i vrati (u mainu) proizvod unetih brojeva.*/
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Uneti broj a: ");
		int a = sc.nextInt();
		System.out.println("Uneti broj b: ");
		int b = sc.nextInt();
		System.out.println("Uneti broj c: ");
		int c = sc.nextInt();	
		
		int proizvod = mnozenje(a,b,c);
		System.out.println("Proizvod unetih brojeva je: " + proizvod);

	}
	
	public static int mnozenje(int a, int b, int c) {
		return a * b * c;
	}
		

}
