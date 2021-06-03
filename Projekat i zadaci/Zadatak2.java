package domaciZadaciJava05052021;

public class Zadatak2 {

	public static void main(String[] args) {
		// 2. Zadatak sa tehnickog intervjua: ako je x = 3, a y = 7, Napisati program tako da im se vrednosti zamene. 
		//Dostaviti oba resenja, sa i bez uvodjenja novih promenljivih

		int x = 3;
		int y = 7;
		
		System.out.println("x = " + x + " y = " + y);
		int promenljiva = x;
		x = y;
		y = promenljiva;
		System.out.println("x = " + x + " y = " + y);
		
		}
	}

	//ne znam kako bi bez uvodjenja promenljive
