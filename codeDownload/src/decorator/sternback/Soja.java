package headfirst.decorator.sternback;

public class Soja extends ZutatDekorierer {
	Getraenk getränk;

	public Soja(Getraenk getränk) {
		this.getränk = getränk;
	}

	public String getBeschreibung() {
		return getränk.getBeschreibung() + ", Soja";
	}

	public double preis() {
		return .15 + getränk.preis();
	}
}
