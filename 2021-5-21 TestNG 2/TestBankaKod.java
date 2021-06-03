package bankaDom;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestBankaKod {

	/* Po uzoru na rad na casu (zadatak sa klasama Account i TestAccount), napraviti
	 * klasu TestBankaKod i : 
	 * proveriti da li konstruktor dobro postavlja argumente, kao i da li get metode
	 * vracaju odgovarajuce vrednosti. Kada se napravi racun, na stanju je 0 dinara. */
	
	@Test
	public void testKonstruktor() {
		BankaKod bk = new BankaKod ("Nikola", "789456123-80");
		
		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals(bk.dohvatiIme(), "Nikola");
		sa.assertEquals(bk.dohvatiZiroRacun(), "789456123-80");
		sa.assertEquals(bk.dohvatiIznos(), 0d);
		
		//get metoda za ime, ne vraca pravu vrednost
		//ispravljeno u originalnom kodu
		
		sa.assertAll();		
	}
	
}
