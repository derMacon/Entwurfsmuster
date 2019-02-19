package headfirst.factory.pizzafm;

public class BerlinPizzeria extends Pizzeria {

	Pizza erstellePizza(String element) {
		if (element.equals("Salami")) {
			return new BerlinerSalamiPizza();
		} else if (element.equals("Vegetarisch")) {
			return new BerlinerVegetarischePizza();
		} else if (element.equals("Krabben")) {
			return new BerlinerKrabbenPizza();
		} else if (element.equals("Thunfisch")) {
			return new BerlinerThunfischPizza();
		} else return null;
	}
}
