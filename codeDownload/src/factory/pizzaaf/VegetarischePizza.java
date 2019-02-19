package headfirst.factory.pizzaaf;

public class VegetarischePizza extends Pizza {
	PizzaZutatenFabrik zutatenFabrik;
 
	public VegetarischePizza(PizzaZutatenFabrik zutatenFabrik) {
		this.zutatenFabrik = zutatenFabrik;
	}
 
	void vorbereiten() {
		System.out.println("Mache " + name);
		teig = zutatenFabrik.erstelleTeig();
		soße = zutatenFabrik.erstelleSoße();
		käse = zutatenFabrik.erstelleKäse();
		gemüse = zutatenFabrik.erstelleGemüse();
	}
}
