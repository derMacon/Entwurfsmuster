package headfirst.factory.pizzafm;

public class PizzaTestlauf {
 
	public static void main(String[] args) {
		Pizzeria berlinPizzeria = new BerlinPizzeria();
		Pizzeria münchenPizzeria = new MuenchenPizzeria();
 
		Pizza pizza = berlinPizzeria.bestellePizza("Salami");
		System.out.println("Ethan hat eine " + pizza.getName() + " bestellt\n");
 
		pizza = münchenPizzeria.bestellePizza("Salami");
		System.out.println("Joel hat eine " + pizza.getName() + " bestellt\n");

		pizza = berlinPizzeria.bestellePizza("Krabben");
		System.out.println("Ethan hat eine " + pizza.getName() + " bestellt\n");
 
		pizza = münchenPizzeria.bestellePizza("Krabben");
		System.out.println("Joel hat eine " + pizza.getName() + " bestellt\n");

		pizza = berlinPizzeria.bestellePizza("Thunfisch");
		System.out.println("Ethan hat eine " + pizza.getName() + " bestellt\n");
 
		pizza = münchenPizzeria.bestellePizza("Thunfisch");
		System.out.println("Joel hat eine " + pizza.getName() + " bestellt\n");

		pizza = berlinPizzeria.bestellePizza("Vegetarisch");
		System.out.println("Ethan hat eine " + pizza.getName() + " bestellt\n");
 
		pizza = münchenPizzeria.bestellePizza("Vegetarisch");
		System.out.println("Joel hat eine " + pizza.getName() + " bestellt\n");
 	}
}
