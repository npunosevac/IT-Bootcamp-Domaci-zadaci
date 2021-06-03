package zivotinje;

public class Ribe extends Kicmenjaci {
	
	private String vrstaVode;
	private String vrstaPeraja;
	
	public Ribe(String naziv, String omiljenaHrana, String vrstaVode, String vrstaPeraja) {
		super(naziv, omiljenaHrana);
		this.vrstaVode = vrstaVode;
		this.vrstaPeraja = vrstaPeraja;
	}

	public String getVrstaVode() {
		return vrstaVode;
	}

	public void setVrstaVode(String vrstaVode) {
		this.vrstaVode = vrstaVode;
	}

	public String getVrstaPeraja() {
		return vrstaPeraja;
	}

	public void setVrstaPeraja(String vrstaPeraja) {
		this.vrstaPeraja = vrstaPeraja;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Vrsta zivotinje kod riba: ");
		sb.append(naziv);
		return sb.toString();
	}
		
}
