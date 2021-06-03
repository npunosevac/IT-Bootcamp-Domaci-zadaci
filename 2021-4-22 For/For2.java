package domaciZadatakFor22042021;

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {
		
		/*
		For2: Napisati program koji ce na standardnom izlazu ispisati zbir prirodnih brojeva do n na sledeci nacin:
		1) u zbir nece ulaziti brojevi deljivi brojem 5
		2) ako se naidje na broj 13, sabiranje ce se zavrsiti i ispisace se zbir brojeva do tog trenutka.
		 */
	
		Scanner sc = new Scanner (System.in); // Nisam siguran da je dobar rezultat, za drugi if uslov, ispada mi 76
											  //Mozda bi trebalo da bude 78, 
		int i = 1;
		int zbir = 0;
		System.out.println("Do broja n: ");
		int n = sc.nextInt();
		
		while (i < n) {
			if (i % 5 != 0)	{
				zbir = zbir + i;
			}	
			if (i == 13) {	
				break;
			}
			i++;
		}
		System.out.println(zbir);
	}

}

