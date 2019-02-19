package headfirst.factory.pizzas;

public class PizzaTestlauf {
 
	public static void main(String[] args) {
		EinfachePizzaFabrik fabrik = new EinfachePizzaFabrik();
		Pizzeria pizzeria = new Pizzeria(fabrik);

		Pizza pizza = pizzeria.bestellePizza("Salami");
		System.out.println("Wir haben eine " + pizza.getName() + " bestellt\n");
 
		pizza = pizzeria.bestellePizza("Thunfisch");
		System.out.println("Wir haben eine " + pizza.getName() + " bestellt\n");
	}
}
