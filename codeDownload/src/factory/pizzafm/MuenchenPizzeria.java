package headfirst.factory.pizzafm;

public class MuenchenPizzeria extends Pizzeria {

	Pizza erstellePizza(String element) {
        	if (element.equals("Salami")) {
            		return new MuenchenerSalamiPizza();
        	} else if (element.equals("Vegetarisch")) {
        	    	return new MuenchenerVegetarischePizza();
        	} else if (element.equals("Krabben")) {
        	    	return new MuenchenerKrabbenPizza();
        	} else if (element.equals("Thunfisch")) {
            		return new MuenchenerThunfischPizza();
        	} else return null;
	}
}
