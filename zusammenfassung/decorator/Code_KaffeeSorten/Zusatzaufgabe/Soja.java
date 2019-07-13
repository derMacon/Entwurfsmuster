package Kapitel.Kapitel3_DecoratorMuster.Code_KaffeeSorten.Zusatzaufgabe;

/**
 *
 * @author silas
 */
public class Soja extends Getraenk {

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
    public Groesse getGroesse() {
        return getraenk.getGroesse();
    }

    @Override
    public double preis() throws RuntimeException {
        double preis = getraenk.preis();
        switch (this.getraenk.getGroesse().ordinal()) {
            case 0:
                preis += .10;
                break;
            case 1:
                preis += .15;
                break;
            case 2:
                preis += .20;
                break;
        }
        return preis;
    }

}
