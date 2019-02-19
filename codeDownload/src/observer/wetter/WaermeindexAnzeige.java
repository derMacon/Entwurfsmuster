package headfirst.observer.wetter;

public class WaermeindexAnzeige implements Beobachter, AnzeigeElement {
	float wärmeIndex = 0.0f;
	private WetterDaten wetterDaten;

	public WaermeindexAnzeige(WetterDaten wetterDaten) {
		this.wetterDaten = wetterDaten;
		wetterDaten.registriereBeobachter(this);
	}

	public void aktualisieren(float t, float rl, float druck) {
		wärmeIndex = wärmeindexBerechnen(t*9/5+32 , rl);
		anzeigen();
	}
	
	private float wärmeindexBerechnen(float t, float rl) {
		float index = (float)(16.923 + (0.185212 * t) + (5.37941 * rl) - (0.100254 * t * rl) +
				(0.00941695 * (t * t)) + (0.00728898 * (rl * rl)) +
	            (0.000345372 * (t * t * rl)) - (0.000814971 * (t * rl * rl)) +
	            (0.0000102102 * (t * t * rl * rl)) - (0.000038646 * (t * t * t)) + (0.0000291583 *  
	            (rl * rl * rl)) + (0.00000142721 * (t * t * t * rl)) +
	            (0.000000197483 * (t * rl * rl * rl)) - (0.0000000218429 * (t * t * t * rl * rl)) +     
	            (0.000000000843296 * (t * t * rl * rl * rl)) -
	            (0.0000000000481975 * (t * t * t * rl * rl * rl)));
		return (float)((index-32)/1.8);
	}

	public void anzeigen() {
		System.out.println("Der Wärmeindex ist: " + wärmeIndex);
	}
}
