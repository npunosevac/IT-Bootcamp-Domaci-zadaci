package kompanija;

public class Zaposleni { 
	
	private String ime;
	private String prezime;
	private String pozicija;
	private int zarada;
	
	public Zaposleni(String ime, String prezime, String pozicija, int zarada) {
		this.ime = ime;
		this.prezime = prezime;
		this.pozicija = pozicija;
		this.zarada = zarada;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getPozicija() {
		return pozicija;
	}

	public void setPozicija(String pozicija) {
		this.pozicija = pozicija;
	}

	public int getZarada() {
		return zarada;
	}

	public void setZarada(int zarada) {
		this.zarada = zarada;
	}
	
	

}
