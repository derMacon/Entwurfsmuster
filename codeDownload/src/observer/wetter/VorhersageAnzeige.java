package headfirst.observer.wetter;

import java.util.*;

public class VorhersageAnzeige implements Beobachter, AnzeigeElement {
	private float aktuellerLuftdruck = 29.92f;  
	private float letzterLuftdruck;
	private WetterDaten wetterDaten;

	public VorhersageAnzeige(WetterDaten wetterDaten) {
		this.wetterDaten = wetterDaten;
		wetterDaten.registriereBeobachter(this);
	}

	public void aktualisieren(float temp, float feucht, float druck) {
                letzterLuftdruck = aktuellerLuftdruck;
		aktuellerLuftdruck = druck;

		anzeigen();
	}

	public void anzeigen() {
		System.out.print("Vorhersage: ");
		if (aktuellerLuftdruck > letzterLuftdruck) {
			System.out.println("Wetter-Besserung in Sicht!");
		} else if (aktuellerLuftdruck == letzterLuftdruck) {
			System.out.println("Wetter geht weiter so.");
		} else if (aktuellerLuftdruck < letzterLuftdruck) {
			System.out.println("Gehen Sie von kälterem, regnerischem Wetter aus.");
		}
	}
}
