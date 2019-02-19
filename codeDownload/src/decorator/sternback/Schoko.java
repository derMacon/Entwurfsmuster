package headfirst.decorator.sternback;

public class Schoko extends ZutatDekorierer {
	Getraenk getränk;
 
	public Schoko(Getraenk getränk) {
		this.getränk = getränk;
	}
 
	public String getBeschreibung() {
		return getränk.getBeschreibung() + ", Schoko";
	}
 
	public double preis() {
		return .20 + getränk.preis();
	}
}
