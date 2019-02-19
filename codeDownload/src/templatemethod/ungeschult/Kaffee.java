package headfirst.templatemethod.ungeschult;

public class Kaffee {
 
	void zubereitungsRezept() {
		kocheWasser();
		kocheKaffee();
		inTasseSchütten();
		zuckerUndMilchHinzufügen();
	}
 
	public void kocheWasser() {
		System.out.println("Koche Wasser");
	}
 
	public void kocheKaffee() {
		System.out.println("Lasse Kaffee durch Filter laufen");
	}
 
	public void inTasseSchütten() {
		System.out.println("Schütte Kaffee in Tasse");
	}
 
	public void zuckerUndMilchHinzufügen() {
		System.out.println("Füge Zucker und Milch hinzu");
	}
}
