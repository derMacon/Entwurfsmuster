package headfirst.decorator.sternback;
 
public class Milchschaum extends ZutatDekorierer {
	Getraenk getränk;
 
	public Milchschaum(Getraenk getränk) {
		this.getränk = getränk;
	}
 
	public String getBeschreibung() {
		return getränk.getBeschreibung() + ", Milchschaum";
	}
 
	public double preis() {
		return .10 + getränk.preis();
	}
}
