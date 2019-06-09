package Kapitel.Kapitel4_FactoryMuster.BspPizzeria.Code_Pizzeria;

/**
 *
 * @author silas
 */
public abstract class Pizzeria {
    
    protected Pizza bestellePizza(String typ) {
        Pizza pizza = erstellePizza(typ); 

        pizza.vorbereiten();
        pizza.backen();
        pizza.schneiden();
        pizza.verpacken();

        return pizza;
    }
    
    public abstract Pizza erstellePizza(String typ);
    
}
