package dogadjaj;

public class Main {

	public static void main(String[] args) {
		
		Dvorana d1 = new Dvorana ("Kombank Arena", "Beogradu", 25000);
		Dvorana d2 = new Dvorana ("Saradis", "Krusevcu", 1000);
		Dvorana d3 = new Dvorana ("Spens", "Novom Sadu", 12000);
		
		Event e1 = new Event ("suncano", d1, "utakmica");
		Event e2 = new Event ("oblacno", d2, "vencanje");
		
		StringBuilder sb = new StringBuilder();
		
		System.out.println(e1.getTip());
		System.out.println(d1.getIme());
		
		System.out.println(d1.getIme() + " se nalazi u " + d1.getGrad() + ".");
		System.out.println("Vreme je bilo " + e1.getVreme() + " u " + d2.getGrad() + " na dan " + e2.getTip() + ".");
		System.out.println("Na dan " + e1.getTip() + " u " + d3.getGrad() + " pred " + d3.getKapacitet() + " ljudi " + "je bilo " + e2.getVreme() + ".");
		
		System.out.println(d2.getKapacitet());
		d2.setKapacitet(2000);
		System.out.println(d2.getKapacitet());
		
		System.out.println("U " + d1.getGrad() + " se igrala " + e1.getTip() + " pred " + e1.getDvorana().getKapacitet() + " gledalaca.");
		System.out.println("Na " + e2.getTip() + " je bilo " + e1.getVreme() + " u " + d2.getGrad() + ".");
		System.out.println("U " + d3.getIme() + " na dan " + e1.getTip() + " su ljudi dosli iz " + e1.getDvorana().getGrad());
		System.out.println("Pred " + d3.getKapacitet() + " posetilaca odrazana je " + e1.getTip() + " u " + e1.getDvorana().getGrad());
		
		System.out.println(" ");
		
		//sb.append("U " + d1.getGrad() + " na " + e1.getTip() + " u " + e1.getDvorana().getIme() + " je bilo " + e1.getVreme());		
		//System.out.println(sb.toString()); // ne treba ovako
		
		sb.append("U " + d1.getGrad());
		sb.append(" se igrala " + e1.getTip());
		sb.append(" pred " + e1.getDvorana().getKapacitet());
		sb.append(" gledalaca.");
		System.out.println(sb.toString());
		
	}

}
