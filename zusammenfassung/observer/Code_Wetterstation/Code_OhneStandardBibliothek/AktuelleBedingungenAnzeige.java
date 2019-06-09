package Kapitel.Kapitel2_ObserverMuster.Code_Wetterstation.Code_OhneStandardBibliothek;

/**
 *
 * @author silas
 */
public class AktuelleBedingungenAnzeige implements Beobachter, AnzeigeElement {

    private float temperatur; 
    private float feuchtigkeit; 
    private float waermeIndex; 
    private Subjekt wetterDaten; 

    public AktuelleBedingungenAnzeige(Subjekt wetterDaten) {
        this.wetterDaten = wetterDaten;
        wetterDaten.registriereBeobachter(this);
    }
    
    @Override
    public void aktualisieren(float temp, float feucht, float druck, float waermeIdx) {
        this.temperatur = temp; 
        this.feuchtigkeit = feucht; 
        this.waermeIndex = waermeIdx;
        anzeigen();
    }

    @Override
    public void anzeigen() {
        System.out.println("Aktuelle Wetterbedingungen: " + this.temperatur
            + "Grad C und " + this.feuchtigkeit + "% Feuchtigkeit, Waerme-Index: "
            + this.waermeIndex);
    }
    
}
