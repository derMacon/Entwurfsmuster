package headfirst.factory.pizzaaf;

public class ThunfischPizza extends Pizza {
	PizzaZutatenFabrik zutatenFabrik;
 
	public ThunfischPizza(PizzaZutatenFabrik zutatenFabrik) {
		this.zutatenFabrik = zutatenFabrik;
	}
 
	void vorbereiten() {
		System.out.println("Mache " + name);
		teig = zutatenFabrik.erstelleTeig();
		soße = zutatenFabrik.erstelleSoße();
		käse = zutatenFabrik.erstelleKäse();
		gemüse = zutatenFabrik.erstelleGemüse();
		thunfisch = zutatenFabrik.erstelleThunfisch();
	}
}
