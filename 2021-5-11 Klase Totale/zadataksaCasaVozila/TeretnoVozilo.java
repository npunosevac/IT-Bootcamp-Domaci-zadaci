package zadataksaCasaVozila;

public class TeretnoVozilo extends Vozilo {

	/* Teretno vozilo je vozilo koje je natovareno teretom odredjene tezine. Moguce
	 * je dodati teret zadate tezine, odnosno istovariti teret zadate tezine.
	 * Tekstualni opis je proizvodjac-model[ukupna tezina]  */

	private double teret;

	public TeretnoVozilo(String nazivProizvodjaca, String model, double tezina, double teret) {
		super(nazivProizvodjaca, model, tezina);
		this.teret = teret;
	}
	
	public TeretnoVozilo(String nazivProizvodjaca, String model, double tezina) {  //bez tereta
		super(nazivProizvodjaca, model, tezina);
		teret = 0;
	}

	public double getTeret() {
		return teret;
	}

	public void setTeret(double teret) {
		this.teret = teret;
	}

	public void dodajTeret (double tezina) {
		teret = teret + tezina;
	}
	
	public void istovariTeret (double tezina) {
		teret = teret - tezina;
	}
	//proizvodjac-model[ukupna tezina]
	@Override
	public String toString() {
		double ukupnaTezina = super.getTezina() + teret;
		StringBuilder sb = new StringBuilder();
		sb.append(super.getNazivProizvodjaca());
		sb.append("-");
		sb.append(super.getModel());
		sb.append("[");
		sb.append(ukupnaTezina); // ili sb.append(super.getTezina() + teret); odmah bez jednacine
		sb.append("]");
		return sb.toString();
	}
	
	
}
