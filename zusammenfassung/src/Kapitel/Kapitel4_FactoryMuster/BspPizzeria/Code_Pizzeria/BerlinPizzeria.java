package Kapitel.Kapitel4_FactoryMuster.BspPizzeria.Code_Pizzeria;

/**
 *
 * @author silas
 */
public class BerlinPizzeria extends Pizzeria {

    @Override
    public Pizza erstellePizza(String element) {
        Pizza pizza = null;
        switch (element) {
            case "Salami":
                pizza = new BerlinerSalamiPizza();
                break;
            // Es folgen weitere Sorten
        }
        return pizza;
    }

}
