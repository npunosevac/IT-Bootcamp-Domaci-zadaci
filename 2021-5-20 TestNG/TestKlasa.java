package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestKlasa {
	
	/*Potrebno je u zasebnoj klasi (ali u istom paketu) 
	 * testirati metode iz klase Calc koristeci testNG.*/
	
	@Test
	public void testRacunajKrug () {
		Calc c1 = new Calc ();
		Double rez = c1.pKruga(2);
		Assert.assertEquals(rez, 12.56);
	}	
	
	@Test
	public void testRacunajKvadrat () {
		Calc c1 = new Calc ();
		Double rez = c1.pKvadrata(2);
		Assert.assertEquals(rez, 4);	
	}
	
	@Test
	public void testRacunajPravougaonik () {
		Calc c1 = new Calc ();
		Double rez = c1.pPravougaonika(2, 3);
		Assert.assertEquals(rez, 6.0);	
	}
		
}
