package headfirst.observer.wetter;

import java.util.*;

public class WetterStationWaermeIndex {

	public static void main(String[] args) {
		WetterDaten weatherData = new WetterDaten();
		AktuelleBedingungenAnzeige aktuelleBedingungen = new AktuelleBedingungenAnzeige(weatherData);
		StatistikAnzeige statistikAnzeige = new StatistikAnzeige(weatherData);
		VorhersageAnzeige vorhersageAnzeige = new VorhersageAnzeige(weatherData);
		WaermeindexAnzeige wärmeindexAnzeige = new WaermeindexAnzeige(weatherData);

		weatherData.setMesswerte(30, 65, 30.4f);
		weatherData.setMesswerte(32, 70, 29.2f);
		weatherData.setMesswerte(28, 90, 29.2f);
	}
}
