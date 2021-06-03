package zivotinje;

import java.util.List;

public class Staniste {
	
	/* Napraviti klasu Staniste u kom se nalazi lista zivotinja koje u tom stanistu
	 zive. Staniste takodje ima naziv koji moze da se dohvati ali ne i postavi.*/
	
	private String nazivStanista;
	private List<Kicmenjaci> zivotinje;
	
	public Staniste(String nazivStanista, List<Kicmenjaci> zivotinje) {
		super();
		this.nazivStanista = nazivStanista;
		this.zivotinje = zivotinje;
	}

	public List<Kicmenjaci> getZivotinje() {
		return zivotinje;
	}

	public void setZivotinje(List<Kicmenjaci> zivotinje) {
		this.zivotinje = zivotinje;
	}

	public String getNazivStanista() {
		return nazivStanista;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Staniste: ");
		sb.append(nazivStanista);
		sb.append(" ");
		sb.append("Vrste zivotinja: ");
		sb.append(zivotinje.get(0).getNaziv());
		return sb.toString();
	}
	
		
}
