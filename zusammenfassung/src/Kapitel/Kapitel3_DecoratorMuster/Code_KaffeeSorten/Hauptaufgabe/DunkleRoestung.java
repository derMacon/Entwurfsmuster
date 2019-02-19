package Kapitel.Kapitel3_DecoratorMuster.Code_KaffeeSorten.Hauptaufgabe;

/**
 *
 * @author silas
 */
public class DunkleRoestung extends Getraenk {
    
    private static final double PREIS = .99; 
    private static final String BESCHREIBUNG = "Dunkle Roestung"; 

    public DunkleRoestung() {
        this.beschreibung = BESCHREIBUNG;
    }

    @Override
    public double preis() {
        return PREIS; 
    }
    
}
