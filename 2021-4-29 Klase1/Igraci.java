package sportista;

public class Igraci {

	public static void main(String[] args) {
		
		Sportista s1 = new Sportista("Nikola Nikolic", "Kosarka");
		Sportista s2 = new Sportista("Marko Markovic", "Fudbal");
		Sportista s3 = new Sportista("Jovan Jovanovic", "Odbojka", "Betis", 4);
		
		s1.setKlub("Kinder");
		s1.setBrojDresa(8);
		
		System.out.println(s1.getKlub());
		System.out.println(s1.getBrojDresa());
		
		s2.setKlub("Madrid");
		s2.setBrojDresa(31);
		
		System.out.println(s2.getKlub());
		System.out.println(s2.getBrojDresa());
		
		s3.setBrojDresa(21);
		System.out.println(s3.getBrojDresa());
		
		s3.setKlub("Roma");
		s3.setBrojDresa(55);
		
		System.out.println(s3.getKlub());
		System.out.println(s3.getBrojDresa());
		
		s1.setKlub("Denver");
		s1.setBrojDresa(99);
		System.out.println(s1.getKlub());
		System.out.println(s1.getBrojDresa());
	}

}
