package Kapitel.Kapitel3_DecoratorMuster.Code_KaffeeSorten.Zusatzaufgabe;

/**
 *
 * @author silas
 */
public class Espresso extends Getraenk {

    private static final double PREIS = 1.99;
    private static final String BESCHREIBUNG = "Espresso";

    public Espresso(Groesse groesse) {
        setGroesse(groesse);
        this.beschreibung = BESCHREIBUNG;
    }

    public Espresso() {
        this(Getraenk.defaultGroesse);
    }
    
    @Override
    public double preis() {
        return PREIS;
    }

}
