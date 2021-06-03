package zadataksaCasaVozila;

public class Vozilo {
	
	private String nazivProizvodjaca;
	private String model;
	private double tezina;

	public Vozilo(String nazivProizvodjaca, String model, double tezina) {
		this.nazivProizvodjaca = nazivProizvodjaca;
		this.model = model;
		this.tezina = tezina;
	}

	public double getTezina() {
		return tezina;
	}

	public void setTezina(double tezina) {
		this.tezina = tezina;
	}

	public String getNazivProizvodjaca() {
		return nazivProizvodjaca;
	}

	public String getModel() {
		return model;
	}
	//proizvodjac-model[sopstvena tezina]

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(nazivProizvodjaca);
		sb.append("-");
		sb.append(model);
		sb.append("[");
		sb.append(tezina);
		sb.append("]");
		return sb.toString();
	}
	
	

}
