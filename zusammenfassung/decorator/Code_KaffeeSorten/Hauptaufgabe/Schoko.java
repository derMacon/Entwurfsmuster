package Kapitel.Kapitel3_DecoratorMuster.Code_KaffeeSorten.Hauptaufgabe;

/**
 *
 * @author silas
 */
public class Schoko extends ZutatDekorierer {

    private static final double PREIS = .2;
    private static final String BESCHREIBUNG = "Schoko"; 
    
    private Getraenk getraenk; 

    public Schoko(Getraenk getraenk) {
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
