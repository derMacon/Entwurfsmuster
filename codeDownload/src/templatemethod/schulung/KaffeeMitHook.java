package headfirst.templatemethod.schulung;

import java.io.*;

public class KaffeeMitHook extends KoffeinhaltigesGetraenkMitHook {
 
	public void aufschütten() {
		System.out.println("Lasse Kaffe durch Filter laufen");
	}
 
	public void zutatenHinzufügen() {
		System.out.println("Füge Zucker und Milch hinzu");
	}
 
	public boolean kundeWillZutaten() {

		String antwort = benutzereingabeAbfragen();

		if (antwort.toLowerCase().startsWith("j")) {
			return true;
		} else {
			return false;
		}
	}
 
	private String benutzereingabeAbfragen() {
		String antwort = null;

		System.out.print("Möchten Sie Milch und Zucker in Ihren Kaffee (j/n)? ");

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			antwort = in.readLine();
		} catch (IOException ioe) {
			System.err.println("IO-Fehler beim Lesen Ihrer Eingabe");
		}
		if (antwort == null) {
			return "nein";
		}
		return antwort;
	}
}
