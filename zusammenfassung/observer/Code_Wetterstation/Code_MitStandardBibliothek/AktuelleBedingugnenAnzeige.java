package Kapitel.Kapitel2_ObserverMuster.Code_Wetterstation.Code_MitStandardBibliothek;

import Kapitel.Kapitel2_ObserverMuster.Code_Wetterstation.Code_OhneStandardBibliothek.AnzeigeElement;
import java.util.Observable;
import java.util.Observer;

/**
 * Anleitung, sowie wichtige Punkte die es zu beachten gilt: <br>
 * 1. Wieder sicherstellen, dass wir die richtigen Observer/Observable Daten
 * importiert haben. <br>
 * 2. Jetzt implementieren wir das Interface Observer aus java.util <br>
 * 3. Unser Konstruktor erwartet nun ein Argument vom Typ Observable, um die
 * aktuelle Bedingungen als Observer hinzuzufuegen. Hierbei muss ausserdem die
 * Referenz auf das Subjekt gesetzt werden. Mit dem letzten Aufruf wird das
 * akutelle Beobachter Objekt der Liste der Beobachter hinzugefuegt. <br>
 * 4. Wir haben die Methode upadate() so geaendert, dass Sie ein Observable und
 * das optimale Datenargument aktzeptiert. <br>
 * 5. In update() pruefen wir zunaechst, ob das Observable vom Tzp WetterDaten
 * ist, und verwenden dann seine Getter-Methdoen um die Messwerte fue Temperatur
 * und Luftdruckherauszuziehen. Danach koennen wir anzeigen() aufrufen. <br>
 *
 * @author silas
 */
public class AktuelleBedingugnenAnzeige implements Observer, AnzeigeElement {
    
    Observable observable; 
    private float temperatur; 
    private float feuchtigkeit;
    
    public AktuelleBedingugnenAnzeige(Observable observable) {
        this.observable = observable; 
        this.observable.addObserver(this);
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
        System.out.println("Aktuelle Bedingungen: " + this.temperatur + " Grad C und " 
                + feuchtigkeit + "% Luftfeuchtigkeit");
    }

    
    
}
