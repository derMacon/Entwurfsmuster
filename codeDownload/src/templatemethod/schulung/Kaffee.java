package headfirst.templatemethod.schulung;

public class Kaffee extends KoffeinhaltigesGetraenk {
	public void aufschütten() {
		System.out.println("Lasse Kaffe durch Filter laufen");
	}
	public void zutatenHinzufügen() {
		System.out.println("Füge Zucker und Milch hinzu");
	}
}
