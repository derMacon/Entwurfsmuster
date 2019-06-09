package Kapitel.Kapitel3_DecoratorMuster.Code_KaffeeSorten.Zusatzaufgabe;

import Kapitel.Kapitel3_DecoratorMuster.Code_KaffeeSorten.Hauptaufgabe.*;

/**
 * Kaffee-Sorten mit Preisen: 
 * 
 * Kaffees: 
 * 0.89 - Hausmischung
 * 0.99 - Dunkle Roestung
 * 1.05 - Entkoffiniert
 * 1.99 - Espresso
 * 
 * Zutaten (Bonus): 
 * 0.10 - Heisse Milch
 * 0.20 - Schoko
 * 0.15 - Soja
 * 0.10 - Milchschaum
 * 
 * @author silas
 */
public class SternbackKaffeeMain {

    /**
     * S. 107
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Getraenk getraenk = new Espresso(); 
        System.out.println(getraenk.getBeschreibung() + ", " + getraenk.getGroesse().name().toLowerCase()
                + "-gross,  " + getraenk.preis() + " " + Getraenk.WAEHRUNG);
        
        Getraenk getraenk2 = new Soja(new Espresso());
        System.out.println(getraenk2.getBeschreibung() + ", " + getraenk2.getGroesse().name().toLowerCase()
                + "-gross,  " + getraenk2.preis() + " " + Getraenk.WAEHRUNG);
        
        Getraenk getraenk3 =new Soja( new Soja(new Espresso()));
        System.out.println(getraenk3.getBeschreibung() + ", " + getraenk3.getGroesse().name().toLowerCase()
                + "-gross,  " + getraenk3.preis() + " " + Getraenk.WAEHRUNG);
    }
    
}
