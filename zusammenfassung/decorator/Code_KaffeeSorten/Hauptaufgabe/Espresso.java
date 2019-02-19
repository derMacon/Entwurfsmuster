package Kapitel.Kapitel3_DecoratorMuster.Code_KaffeeSorten.Hauptaufgabe;

/**
 *
 * @author silas
 */
public class Espresso extends Getraenk {

    private static final double PREIS = 1.99;
    private static final String BESCHREIBUNG = "Espresso";

    public Espresso() {
        this.beschreibung = BESCHREIBUNG;
    }

    @Override
    public double preis() {
        return PREIS;
    }

}
