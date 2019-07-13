package Kapitel.Kapitel2_ObserverMuster.Code_Wetterstation.Code_OhneStandardBibliothek;

/**
 * Soll von saemtlichen Anzeigeobjekten implementiert werden.
 * @author silas
 */
public interface Beobachter {
    public void aktualisieren(float temp, float feucht, float druck, float waermeIdx); 
}
