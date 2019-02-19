package Kapitel.Kapitel2_ObserverMuster.Code_Wetterstation.Code_OhneStandardBibliothek;

/**
 * Entsprechender Aufruf
 *
 * @author silas
 */
public class MainWetterStation {

    public static void main(String[] args) {
        WetterDaten wetterDaten = new WetterDaten();

        AktuelleBedingungenAnzeige aktuelleAnzeige = new AktuelleBedingungenAnzeige(wetterDaten);

        wetterDaten.setMesswerte(30, 65, 30.4f);
        wetterDaten.setMesswerte(32, 70, 29.2f);
        wetterDaten.setMesswerte(28, 90, 29.2f);
    }
}
