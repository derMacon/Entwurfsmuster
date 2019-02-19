package headfirst.decorator.sternback;

public class Milch extends ZutatDekorierer {
	Getraenk getränk;

	public Milch(Getraenk getränk) {
		this.getränk = getränk;
	}

	public String getBeschreibung() {
		return getränk.getBeschreibung() + ", Milch";
	}

	public double preis() {
		return .10 + getränk.preis();
	}
}
