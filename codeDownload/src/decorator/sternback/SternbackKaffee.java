package headfirst.decorator.sternback;

public class SternbackKaffee {
 
	public static void main(String args[]) {
		Getraenk getränk = new Espresso();
		System.out.println(getränk.getBeschreibung() 
				+ " " + getränk.preis() + " €");
 
		Getraenk getränk2 = new DunkleRoestung();
		getränk2 = new Schoko(getränk2);
		getränk2 = new Schoko(getränk2);
		getränk2 = new Milchschaum(getränk2);
		System.out.println(getränk2.getBeschreibung() 
				+ " " + getränk2.preis() + " €");
 
		Getraenk getränk3 = new HausMischung();
		getränk3 = new Soja(getränk3);
		getränk3 = new Schoko(getränk3);
		getränk3 = new Milchschaum(getränk3);
		System.out.println(getränk3.getBeschreibung() 
				+ " " + getränk3.preis() + " €");
	}
}
