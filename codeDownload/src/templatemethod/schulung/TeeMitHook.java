package headfirst.templatemethod.schulung;

import java.io.*;

public class TeeMitHook extends KoffeinhaltigesGetraenkMitHook {
 
	public void aufschütten() {
		System.out.println("Lasse den Teebeutel ziehen");
	}
 
	public void zutatenHinzufügen() {
		System.out.println("Füge Zitrone hinzu");
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
		// Die Benutzereingabe abfragen
		String antwort = null;

		System.out.print("Hätten Sie gern Zitrone in Ihren Tee (j/n)? ");

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
