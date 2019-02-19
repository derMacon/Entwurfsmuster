package Kapitel.Kapitel4_FactoryMuster.BspPizzeria.Code_Pizzeria;

import java.util.ArrayList;

/**
 *
 * @author silas
 */
public abstract class Pizza {
    protected String name; 
    protected String teig;
    protected String sosse; 
    ArrayList belaege = new ArrayList();

    public String getName() {
        return this.name; 
    }
    
    public void vorbereiten() {
        System.out.println("Bereite " + this.name);
        System.out.println("Werfe Teig ...");
        System.out.println("Fuege Sosse hinzu ...");
        System.out.println("Fuege Belaege hinzu:");
        for (int i = 0; i < this.belaege.size(); i++) {
            System.out.println("   " + this.belaege.get(i));
        }
    }
    
    public void backen() {
        System.out.println("Backe 25 Minuten bei 350 Grad");
    }
    
    public void schneiden() {
        System.out.println("Schneide die Pizza diagonal in Stuecke");
    }
    
    public void verpacken() {
        System.out.println("Packe die Pizza in die offizielle Pizzeria-Schachtel");
    }
    
}
