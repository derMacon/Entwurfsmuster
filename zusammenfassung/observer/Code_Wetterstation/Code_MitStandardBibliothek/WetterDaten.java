package Kapitel.Kapitel2_ObserverMuster.Code_Wetterstation.Code_MitStandardBibliothek;

import java.util.Observable;
import java.util.Observer;

/**
 * Wetterstation mit der Standardbibliothek util implementiert.
 *
 * Anleitung, sowie wichtige Punkte die es zu beachten gilt: <br>
 * 1. Secherstellen,dass wir die richtigen Observer/Observable importieren. <br>
 * 2. Es wird eine Unterklasse (extends) von Observable gebildet. <br>
 * 3. Wir muessen die Beobachter nicht mehr selbst nachhalten oder uns selbst um
 * ihre Registerierung und Entfernung kuemmern (das erledigt jetzt die
 * Superklasse), deswegen haben wir den Code zum Hinzufuegen, Entfernen und
 * Benachrichtigen entfernt. <br>
 * 4. Unser Konstruktor muss keine Datenstruktur mehr erstellen, die die
 * Beobachter festhaelt. (Beachten Sie, dass wir mit dem Aufruf von
 * notifyObservers kein Daten-Objekt versenden. Das heisst, dass wir das
 * Hearausziehen-Modell verwenden werden.)<br>
 * 5. Bei messwerteGeandert muss zuerst setChanged() aufgerufen werden, um
 * anzuzeigen, dass sich der Zustand geandert hat, bevor wir notifyObservvers()
 * aufrufen. setChanged dient bei dieser API als "Schalter" um zu bestaetigen,
 * dass die zu vermittelnden Daten ueberhaupt geaendert wurden. Man muss die
 * Uebermittlung also vorher "anmelden". <br>
 * 6. Die Getter-Methoden aendern sich nicht. Aber da wir das "Herausziehen"
 * verwenden werden, dachten wir, wir erinnern Sie mal daran, dass es sie gibt.
 * Die Beobachter werden sie nutzen um an den Zustand des Wetter-Daten-Objekts
 * zu erlangen. <br>
 *
 * @author silas
 */
public class WetterDaten extends Observable {

    private float temperatur;
    private float feuchtigkeit;
    private float luftdruck;

    public WetterDaten() {
    }

    ;

    public float getTemperatur() {
        return temperatur;
    }

    public float getFeuchtigkeit() {
        return feuchtigkeit;
    }

    public float getLuftdruck() {
        return luftdruck;
    }

    public void messwerteGeaendert() {
        setChanged();
        notifyObservers();
    }

    public void setMesswerte(float temp, float feucht, float druck) {
        this.temperatur = temp;
        this.feuchtigkeit = feucht;
        this.luftdruck = druck;
        messwerteGeaendert();
    }

}
