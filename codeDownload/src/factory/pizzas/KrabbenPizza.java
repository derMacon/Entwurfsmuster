package headfirst.factory.pizzas;

public class KrabbenPizza extends Pizza {
	public KrabbenPizza() {
		name = "Krabben-Pizza";
		teig = "Dünne Kruste";
		soße = "Weiße Knoblauchsoße";
		beläge.add("Krabben");
		beläge.add("Geriebener Parmesan");
	}
}
