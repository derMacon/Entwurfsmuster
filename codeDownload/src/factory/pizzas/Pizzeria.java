package headfirst.factory.pizzas;

public class Pizzeria {
	EinfachePizzaFabrik fabrik;
 
	public Pizzeria(EinfachePizzaFabrik fabrik) { 
		this.fabrik = fabrik;
	}
 
	public Pizza bestellePizza(String typ) {
		Pizza pizza;
 
		pizza = fabrik.createPizza(typ);
 
		pizza.vorbereiten();
		pizza.backen();
		pizza.schneiden();
		pizza.einpacken();

		return pizza;
	}

}
