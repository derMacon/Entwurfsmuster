package headfirst.observer.wetterobservable;

import java.util.Observable;
import java.util.Observer;

public class VorhersageAnzeige implements Observer, AnzeigeElement {
	private float aktuellerLuftdruck = 29.92f;  
	private float letzterLuftdruck;

	public VorhersageAnzeige(Observable observable) {
		observable.addObserver(this);
	}

	public void update(Observable observable, Object arg) {
		if (observable instanceof WetterDaten) {
			WetterDaten wetterDaten = (WetterDaten)observable;
			letzterLuftdruck = aktuellerLuftdruck;
			aktuellerLuftdruck = wetterDaten.getLuftdruck();
			anzeigen();
		}
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
