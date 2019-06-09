package Kapitel.Kapitel3_DecoratorMuster.Code_KaffeeSorten.Hauptaufgabe;

/**
 *
 * @author silas
 */
public class Milchschaum extends Getraenk {

    private static final double PREIS = .1;
    private static final String BESCHREIBUNG = "Milchschaum";
    
    private Getraenk getraenk; 

    public Milchschaum(Getraenk getraenk) {
        this.getraenk = getraenk;
    }
    
    @Override
    public String getBeschreibung(){
        return getraenk.getBeschreibung() + ", " + BESCHREIBUNG;
    }
    
    @Override
    public double preis() {
        return PREIS + getraenk.preis();
    }
    
    
}
