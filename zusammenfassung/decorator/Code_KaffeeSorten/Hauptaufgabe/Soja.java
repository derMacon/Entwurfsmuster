package Kapitel.Kapitel3_DecoratorMuster.Code_KaffeeSorten.Hauptaufgabe;

/**
 *
 * @author silas
 */
public class Soja extends Getraenk {

    private static final double PREIS = .15;
    private static final String BESCHREIBUNG = "Soja";

    private final Getraenk getraenk;

    public Soja(Getraenk getraenk) {
        this.getraenk = getraenk;
    }

    @Override
    public String getBeschreibung() {
        return getraenk.getBeschreibung() + ", " + BESCHREIBUNG;
    }

    @Override
    public double preis() {
        return PREIS + getraenk.preis();
    }

}
