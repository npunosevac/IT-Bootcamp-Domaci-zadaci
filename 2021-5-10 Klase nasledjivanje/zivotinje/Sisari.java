package zivotinje;

public class Sisari extends Kicmenjaci {
	
	private String bojaDlake;
	private int brojNogu;
	
	public Sisari(String naziv, String omiljenaHrana, String bojaDlake, int brojNogu) {
		super(naziv, omiljenaHrana);
		this.bojaDlake = bojaDlake;
		this.brojNogu = brojNogu;
	}

	public String getBojaDlake() {
		return bojaDlake;
	}

	public void setBojaDlake(String bojaDlake) {
		this.bojaDlake = bojaDlake;
	}

	public int getBrojNogu() {
		return brojNogu;
	}

	public void setBrojNogu(int brojNogu) {
		this.brojNogu = brojNogu;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Vrsta zivotinje kod sisara: ");
		sb.append(naziv);
		return sb.toString();
	}
	

}
