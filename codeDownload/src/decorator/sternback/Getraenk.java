package headfirst.decorator.sternback;

public abstract class Getraenk {
	String beschreibung = "Unknown Beverage";
  
	public String getBeschreibung() {
		return beschreibung;
	}
 
	public abstract double preis();
}
