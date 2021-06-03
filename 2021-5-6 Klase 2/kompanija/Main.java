package kompanija;

public class Main {

	public static void main(String[] args) {
		
		Zaposleni z1 = new Zaposleni("Petar", "Petrovic", "menadzer", 82000);
		Zaposleni z2 = new Zaposleni("Jovan", "Jovanovic", "programer", 55000);
		Zaposleni z3 = new Zaposleni("Marko", "Markovic", "tester", 36000);

		Zaposleni[] zaposleni1 = { z1, z2, z3 };

		Firma f1 = new Firma("Avast", "Beograd", 106123, zaposleni1);
		
		Zaposleni z4 = new Zaposleni("Nikola", "Nikolic", "blagajnik", 32000);
		Zaposleni z5 = new Zaposleni("Pregrad", "Karadzic", "mesar", 35000);
		Zaposleni z6 = new Zaposleni("Ratko", "Kecman", "kurir", 28000);
		
		Zaposleni[] zaposleni2 = { z4, z5, z6};
		
		Firma f2 = new Firma("Gurman", "Subotica", 187111, zaposleni2);
	
		Zaposleni z7 = new Zaposleni("Boris", "Krstovic", "glumac", 66000);
		Zaposleni z8 = new Zaposleni("Slavica", "Slavic", "glumica", 77000);
		Zaposleni z9 = new Zaposleni("Misko", "Miskovic", "higijenicar", 12000);
		
		Zaposleni[] zaposleni3 = { z7, z8, z9};
		
		Firma f3 = new Firma("Atelje", "Kragujevac", 187111, zaposleni3);
		
		System.out.println("U firmi " + f1.getNaziv() + ": ");
		
		System.out.println(z1.getPrezime());
		System.out.println(z2.getPrezime());
		System.out.println(z3.getPrezime());
		System.out.println(" ");
		
		System.out.println("U firmi " + f2.getNaziv() + ": ");
		
		System.out.println(z4.getPrezime());
		System.out.println(z5.getPrezime());
		System.out.println(z6.getPrezime());
		System.out.println(" ");
		
		System.out.println("U firmi " + f3.getNaziv() + ": ");
		
		System.out.println(z7.getPrezime());
		System.out.println(z8.getPrezime());
		System.out.println(z9.getPrezime());
		System.out.println(" ");
		
		//Zaposlenog ispisati u obliku IME_PREZIME: POZICIJA (mesecna zarada)
		
		System.out.println((z1.getIme() + "_" + z1.getPrezime() + ": " + z1.getPozicija()).toUpperCase() + " (" + z1.getZarada() + ")");
		System.out.println((z2.getIme() + "_" + z2.getPrezime() + ": " + z2.getPozicija()).toUpperCase() + " (" + z2.getZarada() + ")");
		System.out.println((z3.getIme() + "_" + z3.getPrezime() + ": " + z3.getPozicija()).toUpperCase() + " (" + z3.getZarada() + ")");
		System.out.println(" ");
		System.out.println((z4.getIme() + "_" + z4.getPrezime() + ": " + z4.getPozicija()).toUpperCase() + " (" + z4.getZarada() + ")");
		System.out.println((z5.getIme() + "_" + z5.getPrezime() + ": " + z5.getPozicija()).toUpperCase() + " (" + z5.getZarada() + ")");
		System.out.println((z6.getIme() + "_" + z6.getPrezime() + ": " + z6.getPozicija()).toUpperCase() + " (" + z6.getZarada() + ")");
		System.out.println(" ");
		System.out.println((z7.getIme() + "_" + z7.getPrezime() + ": " + z7.getPozicija()).toUpperCase() + " (" + z7.getZarada() + ")");
		System.out.println((z8.getIme() + "_" + z8.getPrezime() + ": " + z8.getPozicija()).toUpperCase() + " (" + z8.getZarada() + ")");
		System.out.println((z9.getIme() + "_" + z9.getPrezime() + ": " + z9.getPozicija()).toUpperCase() + " (" + z9.getZarada() + ")");
		System.out.println(" ");
		
		//f2.setNaziv("Delta Funghi");
		//System.out.println(f2.getNaziv());
		
		
	} 
}
