package Kapitel.Kapitel4_FactoryMuster.BspPizzeria.Code_Pizzeria;

/**
 *
 * @author silas
 */
public class MuenchenPizzeria extends Pizzeria {

    @Override
    public Pizza erstellePizza(String element) {
        Pizza pizza = null; 
        switch(element) {
            case "Salami": pizza = new MuenchenerSalamiPizza();
            break;
            // Es folgen weitere Sorten
        }
        return pizza;
    }
    
    
    
}
