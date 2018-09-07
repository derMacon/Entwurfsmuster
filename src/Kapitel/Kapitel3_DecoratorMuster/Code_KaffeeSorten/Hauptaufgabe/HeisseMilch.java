package Kapitel.Kapitel3_DecoratorMuster.Code_KaffeeSorten.Hauptaufgabe;

/**
 *
 * @author silas
 */
public class HeisseMilch extends Getraenk {
    
    private static final double PREIS = .5;
    private static final String BESCHREIBUNG = "Heisse Milch"; 
    
    private Getraenk getraenk; 

    public HeisseMilch(Getraenk getraenk) {
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
