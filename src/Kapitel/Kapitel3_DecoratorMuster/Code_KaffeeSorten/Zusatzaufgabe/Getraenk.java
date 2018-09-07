package Kapitel.Kapitel3_DecoratorMuster.Code_KaffeeSorten.Zusatzaufgabe;

/**
 *
 * @author silas
 */
public abstract class Getraenk {

    public static final String WAEHRUNG = "Euro";
    public static final Groesse defaultGroesse = Groesse.MITTEL;
    
    protected String beschreibung = "Unbekanntes Getraenk";
    protected Groesse groesse;

    public enum Groesse {
        KLEIN, MITTEL, GROSS
    }

    public String getBeschreibung() {
        return this.beschreibung;
    }

    public Groesse getGroesse() {
        return this.groesse;
    }

    public void setGroesse(Groesse groesse) {
        this.groesse = groesse;
    }

    public abstract double preis();

}
