package headfirst.factory.pizzaaf;

public class BerlinerPizzeria extends Pizzeria {
 
	protected Pizza erstellePizza(String item) {
		Pizza pizza = null;
		PizzaZutatenFabrik zutatenFabrik = 
			new BerlinerPizzaZutatenFabrik();
 
		if (item.equals("Salami")) {
  
			pizza = new SalamiPizza(zutatenFabrik);
			pizza.setName("Salami-Pizza Berliner Art");
  
		} else if (item.equals("Vegetarisch")) {
 
			pizza = new VegetarischePizza(zutatenFabrik);
			pizza.setName("Vegetarische Pizza Berliner Art");
 
		} else if (item.equals("Krabben")) {
 
			pizza = new KrabbenPizza(zutatenFabrik);
			pizza.setName("Krabben-Pizza Berliner Art");
 
		} else if (item.equals("Thunfisch")) {

			pizza = new ThunfischPizza(zutatenFabrik);
			pizza.setName("ThunfischPizza Berliner Art");
 
		} 
		return pizza;
	}
}
