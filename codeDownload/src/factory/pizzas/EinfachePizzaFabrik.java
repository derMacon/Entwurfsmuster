package headfirst.factory.pizzas;

public class EinfachePizzaFabrik {

	public Pizza createPizza(String type) {
		Pizza pizza = null;

		if (type.equals("Salami")) {
			pizza = new SalamiPizza();
		} else if (type.equals("Thunfisch")) {
			pizza = new ThunfischPizza();
		} else if (type.equals("Krabben")) {
			pizza = new KrabbenPizza();
		} else if (type.equals("Vegetarisch")) {
			pizza = new VegetarischePizza();
		}
		return pizza;
	}
}
