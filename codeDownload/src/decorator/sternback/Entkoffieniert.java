package headfirst.decorator.sternback;

public class Entkoffieniert extends Getraenk {
	public Entkoffieniert() {
		beschreibung = "Entkoffienierter Kaffee";
	}
 
	public double preis() {
		return 1.05;
	}
}

