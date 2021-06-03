package zadataksaCasaVozila;

import java.util.ArrayList;
import java.util.List;

public class TestKlasa {
	
	public static void main(String[] args) {
		
		Putnik p1 = new Putnik ("Zivojin", 120);
		Putnik p2 = new Putnik ("Stanislav", 130);
		System.out.println(p1.toString());
		
		Vozilo v = new Vozilo ("Zastava", "Stojadin", 1200);
		System.out.println(v.toString());
		
		TeretnoVozilo tv = new TeretnoVozilo ("Iveco", "Daily", 3500); // bez tereta
		System.out.println(tv.toString());
		tv.dodajTeret(500);
		System.out.println(tv.toString());
		tv.istovariTeret(700);
		System.out.println(tv.toString());
		
		List<Putnik> putnici = new ArrayList<Putnik>();
		putnici.add(p1);
		putnici.add(p2);
		
		PutnickoVozilo pv = new PutnickoVozilo ("Peguot", "1001", 1800, putnici);
		System.out.println(pv.toString());
		
		pv.izbaciPutnika(1);
		System.out.println(pv.toString());
		
		pv.dodajPutnika(p1);
		System.out.println(pv.toString());
	}
}
