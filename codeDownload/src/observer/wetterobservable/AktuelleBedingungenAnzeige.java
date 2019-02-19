package headfirst.observer.wetterobservable;

import java.util.Observable;
import java.util.Observer;
	
public class AktuelleBedingungenAnzeige implements Observer, AnzeigeElement {
	Observable observable;
	private float temperatur;
	private float feuchtigkeit;
	
	public AktuelleBedingungenAnzeige(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}
	
	public void update(Observable obs, Object arg) {
		if (obs instanceof WetterDaten) {
			WetterDaten wetterDaten = (WetterDaten)obs;
			this.temperatur = wetterDaten.getTemperatur();
			this.feuchtigkeit = wetterDaten.getFeuchtigkeit();
			anzeigen();
		}
	}
	
	public void anzeigen() {
		System.out.println("Aktuelle Bedingungen: " + temperatur 
			+ " Grad C und " + feuchtigkeit + "% Luftfeuchtigkeit");
	}
}
