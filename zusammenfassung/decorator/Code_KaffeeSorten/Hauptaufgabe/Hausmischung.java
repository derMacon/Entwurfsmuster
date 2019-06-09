package Kapitel.Kapitel3_DecoratorMuster.Code_KaffeeSorten.Hauptaufgabe;

/**
 *
 * @author silas
 */
public class Hausmischung extends Getraenk {

    private static final double PREIS = .89; 
    private static final String BESCHREIBUNG = "Hausmischung"; 

    public Hausmischung() {
        this.beschreibung = BESCHREIBUNG;
    }

    @Override
    public double preis() {
        return PREIS; 
    }
    
}
