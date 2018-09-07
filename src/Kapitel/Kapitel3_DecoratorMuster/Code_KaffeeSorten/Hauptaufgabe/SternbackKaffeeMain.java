package Kapitel.Kapitel3_DecoratorMuster.Code_KaffeeSorten.Hauptaufgabe;

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
     * S. 98
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Getraenk getraenk = new Espresso(); 
        System.out.println(getraenk.getBeschreibung() + " " + getraenk.preis() 
            + " " + Getraenk.WAEHRUNG);
        
        Getraenk getraenk2 = new DunkleRoestung(); 
        getraenk2 = new Schoko(getraenk2);
        getraenk2 = new Schoko(getraenk2);
        getraenk2 = new Milchschaum(getraenk2);
        System.out.println(getraenk2.getBeschreibung() + " " + getraenk2.preis()
            + " " + Getraenk.WAEHRUNG);
        
        Getraenk getraenk3 = new Hausmischung(); 
        getraenk3 = new Soja(getraenk3);
        getraenk3 = new Schoko(getraenk3);
        getraenk3 = new Milchschaum(getraenk3);
        System.out.println(getraenk3.getBeschreibung() + " " + getraenk3.preis()
            + " " + Getraenk.WAEHRUNG);
        
        Getraenk getraenk4 = new Milchschaum(new Schoko(new Soja(new Hausmischung())));
        System.out.println(getraenk3.getBeschreibung() + " " + getraenk3.preis()
            + " " + Getraenk.WAEHRUNG);
    }
    
}
