package Kapitel.Kapitel4_FactoryMuster.BspPizzeria.Code_PizzeriaZutatenKontrolle;

/**
 *
 * @author silas
 */
public class BerlinerSalamiPizza extends Pizza {
    
    public BerlinerSalamiPizza() {
        this.name = "Salami-Pizza Berliner Art";
        this.teig = "Tei mit knuspriger Kruste"; 
        this.sosse = "Marinara-Sosse"; 
        
        this.belaege.add("Geriebener Parmesan");
        this.belaege.add("Salami in Scheiben");
    }
    
}
