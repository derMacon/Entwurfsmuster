package headfirst.decorator.sternback;

public class Espresso extends Getraenk {
  
	public Espresso() {
		beschreibung = "Espresso";
	}
  
	public double preis() {
		return 1.99;
	}
}

