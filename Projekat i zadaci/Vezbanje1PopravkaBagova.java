package domaciZadaciJava05052021;

import java.util.Scanner;

public class Vezbanje1PopravkaBagova {

	public static void main(String[] args) {
		/*Napisati program koji ima meni za samousluznu kasu u prodavnici. Meni za potrosace sadrzi sledece opcije:
		0 - Izlaz iz programa (zatvaranje kase)
		1 - dodavanje cene proizvoda na racun (ubacivanje u potrosacku korpu)
		2 - naplata racuna
		Ukoliko korisnik unese opciju 0 program se zavrsava.
		Ukoliko korisnik unese opciju 1 program pita korisnika da unese cenu proizvoda i ta cena se dodaje na racun u prodavnici.
		Ukoliko korisnik unese opciju 2 program pita korisnika da unese kolicinu novca za naplatu racuna.
		Ukoliko korisnik unese vrednost manju od vrednosti racuna, potrebno je da se ispise greska, bez umanjenja racuna 
		i da se ponovo ispise meni.
		Ukoliko korisnik unese vrednost vecu ili jednaku od cene racuna ispisuje se kusur i racun se ponovo postavlja na nulu.
		Zatim se ponovo ispisuje meni.*/
		
		Scanner sc = new Scanner(System.in);

        int opcija;
        double racun = 0;
        double kupovina = 0; 
        double naplata = 0;

        do {
            System.out.println("Kasa");
            System.out.println("Trenutna cena odabranih proizvoda iznosi: " + racun + " din.");
            System.out.println("Odaberite opciju iz menija:");
            System.out.println("  1) Kupovina novog proizvoda");
            System.out.println("  2) Naplata racuna");
            System.out.println("  0) Zatvaranje kase");
            opcija = sc.nextInt();

            switch (opcija) {
                case 1:
                    System.out.println("Unesite cenu novog proizvoda:");
                    kupovina = sc.nextDouble();
                    while (kupovina <= 0) {
                        System.out.println("Nemamo besplatnih proizvoda.");
                        System.out.println("Unesite cenu proizvoda:");
                        kupovina = sc.nextInt();
                    }
                    racun = racun + kupovina;
                    break;
                case 2:
                    if (racun == 0){
                        System.out.println("Nemamo sta da naplatimo");
                    }
                    else {

                        System.out.println("Vas racun iznosi " + racun + " din. Molimo unesite koliko novca stavljate u kasu:");
                        naplata = sc.nextInt();

                        if (naplata == 0) {
                            System.out.println("Odlucili ste se da vratite sve proizvode");
                            System.out.println("Pokusajte opet.");
                            racun = 0;
                            break;
                        }

                        while (naplata < racun && naplata != 0) {
                            System.out.println("Vas iznos ne pokriva troskove racuna: " + racun + " din. Molimo Vas ponovo unesite koliko novca dajete:");
                            naplata = sc.nextInt();
                        }
                        System.out.println("Vas kusur iznosi " + (naplata - racun) + " din. Hvala!");
                        racun = 0;
                    }
                    break;


                case 0:
                    if (racun > 0) {
                        System.out.println("Vas racun nije naplacen. Morate da platite racun ili vratite sve proizvode");
                        opcija = 2;
                    } else
                        System.out.println("Kasa se gasi. Izlazak iz programa.");
                        break;

                default:
                    System.out.println("Pogresan unos. Molimo Vas odaberite jednu od ponudjenih opcija iz menija.");
                    break;
            }
        }
        while (opcija != 0);

	}

}
