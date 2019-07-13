package Kapitel.Kapitel4_FactoryMuster.BspPizzeria.Code_Pizzeria;

/**
 *
 * @author silas
 */
public class MuenchenerSalamiPizza extends Pizza {
    
    public MuenchenerSalamiPizza() {
        this.name = "Deftige Salamipizza im Muenchener Stil"; 
        this.teig = "Teig mit extra dicker Kruste"; 
        this.sosse = "Tomatensosse"; 
        
        this.belaege.add("Mozzarella");
    }
    
    @Override
    public void schneiden() {
        System.out.println("Schneide die Pizza in rechteckige Stuecke");
    }
    
}
