package vozilo;

public class Voznja {

	public static void main(String[] args) {

		Automobil a1 = new Automobil("Citroen", "C1");
		Automobil a2 = new Automobil("Ford", "Fokus");
		Automobil a3 = new Automobil("Dodge", "Viper", 999, "Mirko");
		Automobil a4 = new Automobil("Ferrari", "F40", 888, "Sloba");
		
		System.out.println(a2.getMarka());
		
		a1.setVlasnik("Laza");
		System.out.println(a1.getVlasnik());
			
		a2.setVlasnik("Pera");
		System.out.println(a2.getVlasnik());
		
		a3.setVlasnik("Zika");
		System.out.println(a3.getVlasnik());
		
		System.out.println(a4.getVlasnik());
		
		System.out.println(a3.getSerijskiBroj());
		System.out.println(a4.getSerijskiBroj());
		
		System.out.println(a4.getModel());
		System.out.println(a4.getMarka());
		
		System.out.println(a1.getModel());
		System.out.println(a2.getModel());
		
		a4.setVlasnik("Misko");
		System.out.println(a4.getVlasnik());
		
		System.out.println(a1.getMarka());
		System.out.println(a2.getMarka());
	}

}
