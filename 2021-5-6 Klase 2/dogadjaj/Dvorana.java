package dogadjaj;

public class Dvorana {

	public String ime;
	public String grad;
	public int kapacitet;

	public Dvorana(String ime, String grad, int kapacitet) {
		super();
		this.ime = ime;
		this.grad = grad;
		this.kapacitet = kapacitet;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getGrad() {
		return grad;
	}

	public void setGrad(String grad) {
		this.grad = grad;
	}

	public int getKapacitet() {
		return kapacitet;
	}

	public void setKapacitet(int kapacitet) {
		this.kapacitet = kapacitet;
	}

}
