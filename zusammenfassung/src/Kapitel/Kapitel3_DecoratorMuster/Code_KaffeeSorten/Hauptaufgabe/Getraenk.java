package Kapitel.Kapitel3_DecoratorMuster.Code_KaffeeSorten.Hauptaufgabe;

/**
 *
 * @author silas
 */
public abstract class Getraenk {
    
    protected String beschreibung = "Unbekanntes Getraenk"; 
    public static final String WAEHRUNG = "Euro"; 
    
    public String getBeschreibung() {
        return this.beschreibung; 
    }
    
    public abstract double preis(); 
    
}
