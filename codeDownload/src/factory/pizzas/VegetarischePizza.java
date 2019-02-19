package headfirst.factory.pizzas;

public class VegetarischePizza extends Pizza {
	public VegetarischePizza() {
		name = "Vegetarische Pizza";
		teig = "Kruste";
		soße = "Marinara-Soße";
		beläge.add("Mozzarella");
		beläge.add("Geriebener Parmesan");
		beläge.add("Gewürfelte Zwiebeln");
		beläge.add("Pilze in Scheiben");
		beläge.add("Rote Paprika in Scheiben");
		beläge.add("Schwarze Oliven in Scheiben");
	}
}
