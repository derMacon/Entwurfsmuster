package headfirst.factory.pizzaaf;

public class SalamiPizza extends Pizza {
	PizzaZutatenFabrik zutatenFabrik;
 
	public SalamiPizza(PizzaZutatenFabrik zutatenFabrik) {
		this.zutatenFabrik = zutatenFabrik;
	}
 
	void vorbereiten() {
		System.out.println("Mache " + name);
		teig = zutatenFabrik.erstelleTeig();
		soﬂe = zutatenFabrik.erstelleSoﬂe();
		salami = zutatenFabrik.erstelleSalami();
		k‰se = zutatenFabrik.erstelleK‰se();
	}
}
