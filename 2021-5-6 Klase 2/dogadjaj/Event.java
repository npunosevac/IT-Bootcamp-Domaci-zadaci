package dogadjaj;

public class Event {

	/* Dogadjaj
	 * Napraviti klasu Event koja sadrzi podatke o vremenu, dvorani u kojoj se
	 * dogadjaj organizuje i tip (koncert, utakmica, vencanje…) 
	 * Napraviti klasu Dvorana koja sadrzi podatke o nazivu dvorane, gradu gde se
	 * nalazi i kapacitetu (broju mesta).
	 * Uvezati ove klase i u glavnom programu se igrati sa njima. */
	
	private String vreme;
	private Dvorana dvorana;
	private String tip;

	public Event(String vreme, Dvorana dvorana, String tip) {
		super();
		this.vreme = vreme;
		this.dvorana = dvorana;
		this.tip = tip;
	}

	public String getVreme() {
		return vreme;
	}

	public void setVreme(String vreme) {
		this.vreme = vreme;
	}

	public Dvorana getDvorana() {
		return dvorana;
	}

	public void setDvorana(Dvorana dvorana) {
		this.dvorana = dvorana;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}
	
		
}
