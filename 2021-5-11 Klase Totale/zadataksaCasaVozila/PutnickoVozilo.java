package zadataksaCasaVozila;

import java.util.List;

public class PutnickoVozilo extends Vozilo {

	/* Putnicko vozilo je vozilo u kome se nalaze putnici. Moguce je dohvatiti sve
	* putnike koji se nalaze u vozilu, dodati nekog putnika i izbacini putnika sa
	* neke pozicije. Tekstualni opis je proizvodjac-model[ukupna tezina]. */
		
	private List<Putnik> putnici;

	public PutnickoVozilo(String nazivProizvodjaca, String model, double tezina, List<Putnik> putnici) {
		super(nazivProizvodjaca, model, tezina);
		this.putnici = putnici;
	}

	public List<Putnik> getPutnici() {
		return putnici;
	}

	public void setPutnici(List<Putnik> putnici) {
		this.putnici = putnici;
	}
		
	public void dodajPutnika (Putnik p) {
		putnici.add(p);
	}
	
	public void izbaciPutnika (int pozicija) {
		putnici.remove(pozicija);
	}
	
	//proizvodjac-model[ukupna tezina]
	@Override
	public String toString() {
		
		double tezinaPutnika = 0;
		
		for (int i = 0; i < putnici.size(); i++) {
			tezinaPutnika = tezinaPutnika + putnici.get(i).getKg();
		}
		double ukupnaTezina = tezinaPutnika + super.getTezina();
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.getNazivProizvodjaca());
		sb.append("-");
		sb.append(super.getModel());
		sb.append("[");
		sb.append(ukupnaTezina);
		sb.append("]");
		return sb.toString();
	}
	
	
}
