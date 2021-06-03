package zivotinje;

import java.util.ArrayList;
import java.util.List;

public class GPZivotinje {

	public static void main(String[] args) {

		
		Kicmenjaci k1 = new Kicmenjaci ("Sova", "glodari");
		Kicmenjaci k2 = new Kicmenjaci ("Reptil", "sisari");
		
		Sisari s1 = new Sisari ("Tigar", "sisari", "bela-zuta-crna", 4);
		Sisari s2 = new Sisari ("Sismis", "krv", "bela-crna", 2);
		
		Ribe r1 = new Ribe ("Saran", "biljni plodovi", "slatkovodna", "sva moguca peraja");
		Ribe r2 = new Ribe ("Zubatac", "riba", "morska", "ledjna i bocna");
		
		List<Kicmenjaci> zivotinje1 = new ArrayList<Kicmenjaci>();
		zivotinje1.add(k1);
		zivotinje1.add(k2);
		
		List<Kicmenjaci> zivotinje2 = new ArrayList<Kicmenjaci>();
		zivotinje2.add(r1);
		zivotinje2.add(r2);
		
		Staniste st1 = new Staniste ("Kopneno", zivotinje1);
		Staniste st2 = new Staniste ("Vodeno", zivotinje2);
		
		System.out.println(st1.getZivotinje().get(1).getNaziv() + " " + st1.getZivotinje().get(0).getNaziv());
		
		//Ispisati bar jedno staniste. 
		
		System.out.println(st1.getNazivStanista());
		// ili 
		System.out.println(st2.toString());
		
		//Jednom sisaru zameniti boju dlake.
		s2.setBojaDlake("Crna");
		System.out.println(s2.getBojaDlake());
		
		//Ispisati bar jednog sisara i jednu ribu kao vrstu zivotinje.
		
		System.out.println("Vrsta zivotinje: " + r2.getNaziv());
		System.out.println("Vrsta zivotinje: " + s1.getNaziv());
		// ili 
		System.out.println(r1.toString());
		System.out.println(s2.toString());
		
		// ili vrsta zivotinje kod riba
		
		if (zivotinje2.get(1) instanceof Ribe) {
			System.out.println("Vrsta zivotinje kod riba: ");
			Ribe r = (Ribe) zivotinje2.get(1);
			System.out.println(r2.getNaziv());
		}
	}

}
