package Kapitel.Kapitel4_FactoryMuster.BspPizzeria.Code_PizzeriaZutatenKontrolle;

/**
 *
 * @author silas
 */
public class PizzaTestlaufMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pizzeria berlinPizzeria = new BerlinPizzeria(); 
        Pizzeria muenchenPizzeria = new MuenchenPizzeria(); 
        
        Pizza pizza = berlinPizzeria.bestellePizza("Salami"); 
        System.out.println("Ben hat eine " + pizza.getName() + " bestellt\n");
        
        pizza = muenchenPizzeria.bestellePizza("Salami"); 
        System.out.println("Tassilo hat eine " + pizza.getName() + " bestellt\n");
    }
    
}
