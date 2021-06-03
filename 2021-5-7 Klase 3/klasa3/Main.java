package klasa3;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Putovanje p1 = new Putovanje ("Spanija", 1000); // putovanje1
		
		Putnici put1 = new Putnici("Jack", "Black", 987654);
		Putnici put2 = new Putnici("Jova", "Jovic", 123456);
		
		List<Putnici> putnici2 = new ArrayList<Putnici>();
		putnici2.add(put1);
		putnici2.add(put2);
		
		Putovanje p2 = new Putovanje ("Havaji", 2500, putnici2); // putovanje2
		
		Putovanje p3 = new Putovanje ("Aljaska", 3000, null); // putovanje3
		
		List<Putovanje> ponuda = new ArrayList<Putovanje>(); // putovanja u listi koja se zove ponuda
		ponuda.add(p1);
		ponuda.add(p2);
		ponuda.add(p3);
		
		System.out.println("Na " + p2.getDestinacija() + " je " + p2.getPutnik().get(0).getIme() + " posao sa " + p3.getDestinacija() + ".");
		System.out.println(p2.getPutnik().get(1).getIme() + " je doputovao do " + p1.getDestinacija() + " sa pasosem " + p2.getPutnik().get(1).getBrojPasosa() + ".");
		System.out.println("G-dina " + p2.getPutnik().get(0).getPrezime() + "-a je putovanje do " + p3.getDestinacija() + " kostalo " + p3.getCena() + " $.");
		
		System.out.println(ponuda.get(1).getCena() + " $");
		ponuda.get(1).setCena(4000);
		System.out.println(ponuda.get(1).getCena() + " $"); // promena cene aranzmana za jedno putovanje
		
		System.out.println(ponuda.size()); // tri putovanja
		ponuda.remove(2);					
		System.out.println(ponuda.size()); // izbaceno jedno putovanje iz ponude
		
		System.out.println(p2.getPutnik().size()); // izbacen jedan od putnika sa putovanja
		p2.getPutnik().remove(1);
		System.out.println(p2.getPutnik().size());

	}

}
