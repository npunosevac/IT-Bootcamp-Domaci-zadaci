package domaciZadatakFor22042021;

import java.util.Scanner;

public class For1 {

	public static void main(String[] args) {
		
		/*For1: Napisati program koji omoguciti korisniku da unosi reci,
		 sve dok ne unese rec “stop”, nebitno da li je koristio mala,
		 velika slova ili kombinaciju. Mozete pri radu koristiti petlju po izboru.
		 */
		
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Unesi rec: ");
		String s1 = "";
		
		while (!s1.equals("stop")) {
			
			s1=sc.nextLine();
			s1=s1.toLowerCase();
			}
		System.out.println("Prekid programa.");
	}

} 
