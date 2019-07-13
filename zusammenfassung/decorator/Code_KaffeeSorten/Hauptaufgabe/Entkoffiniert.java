package Kapitel.Kapitel3_DecoratorMuster.Code_KaffeeSorten.Hauptaufgabe;

/**
 *
 * @author silas
 */
public class Entkoffiniert extends Getraenk {
    
    private static final double PREIS = 1.05; 
    private static final String BESCHREIBUNG = "Entkoffiniert"; 

    public Entkoffiniert() {
        this.beschreibung = BESCHREIBUNG;
    }

    @Override
    public double preis() {
        return PREIS; 
    }
    
}
