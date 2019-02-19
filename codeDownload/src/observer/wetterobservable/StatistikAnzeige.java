package headfirst.observer.wetterobservable;

import java.util.Observable;
import java.util.Observer;

public class StatistikAnzeige implements Observer, AnzeigeElement {
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum= 0.0f;
	private int anzMesswerte;

	public StatistikAnzeige(Observable observable) {
		observable.addObserver(this);
	}

	public void update(Observable observable, Object arg) {
		if (observable instanceof WetterDaten) {
			WetterDaten wetterDaten = (WetterDaten)observable;
			float temp = wetterDaten.getTemperatur();
			tempSum += temp;
			anzMesswerte++;

			if (temp > maxTemp) {
				maxTemp = temp;
			}
 
			if (temp < minTemp) {
				minTemp = temp;
			}

			anzeigen();
		}
	}

	public void anzeigen() {
		System.out.println("Mit/Max/Min Temperatur = " + (tempSum / anzMesswerte)
				+ "/" + maxTemp + "/" + minTemp);
	}
}
