package headfirst.decorator.sternback;

public class DunkleRoestung extends Getraenk {
	public DunkleRoestung() {
		beschreibung = "Dunkle Röstung";
	}
 
	public double preis() {
		return .99;
	}
}

