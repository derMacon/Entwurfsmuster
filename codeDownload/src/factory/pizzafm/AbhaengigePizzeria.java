package headfirst.factory.pizzafm;

public class AbhaengigePizzeria {
 
	public Pizza erstellePizza(String art, String typ) {
		Pizza pizza = null;
		if (art.equals("Berlin")) {
			if (typ.equals("Salami")) {
				pizza = new BerlinerSalamiPizza();
			} else if (typ.equals("Vegetarisch")) {
				pizza = new BerlinerVegetarischePizza();
			} else if (typ.equals("Krabben")) {
				pizza = new BerlinerKrabbenPizza();
			} else if (typ.equals("Thunfisch")) {
				pizza = new BerlinerThunfischPizza();
			}
		} else if (art.equals("München")) {
			if (typ.equals("Salami")) {
				pizza = new MuenchenerSalamiPizza();
			} else if (typ.equals("Vegetarisch")) {
				pizza = new MuenchenerVegetarischePizza();
			} else if (typ.equals("Krabben")) {
				pizza = new MuenchenerKrabbenPizza();
			} else if (typ.equals("Thunfisch")) {
				pizza = new MuenchenerThunfischPizza();
			}
		} else {
			System.out.println("Fehler: Ungültiger Pizzatyp");
			return null;
		}
		pizza.vorbereiten();
		pizza.backen();
		pizza.schneiden();
		pizza.verpacken();
		return pizza;
	}
}
