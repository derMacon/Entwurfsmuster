package Kapitel.Kapitel2_ObserverMuster.Code_Wetterstation.Code_MitStandardBibliothek;

import Kapitel.Kapitel2_ObserverMuster.Code_Wetterstation.Code_OhneStandardBibliothek.AnzeigeElement;
import java.util.Observable;
import java.util.Observer;

/**
 * Uebung auf S. 69, Loesugn auf S. 78
 * @author silas
 */
public class VorhersageAnzeige implements Observer, AnzeigeElement {
    private float aktuellerLuftdruck = 29.92f; 
    private float letzterLuftdruck;
    
    public VorhersageAnzeige(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object arg) {
        if(observable instanceof WetterDaten) {
            WetterDaten wetterDaten = (WetterDaten)observable; 
            this.aktuellerLuftdruck = this.letzterLuftdruck; 
            this.letzterLuftdruck = wetterDaten.getLuftdruck();
            anzeigen(); 
        }
    }

    @Override
    public void anzeigen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
