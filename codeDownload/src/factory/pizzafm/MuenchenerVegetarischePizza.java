package headfirst.factory.pizzafm;

public class MuenchenerVegetarischePizza extends Pizza {
	public MuenchenerVegetarischePizza() {
		name = "Deftige vegetarische Pizza Münchener Art";
		teig = "Teig mit extra dicker Kruste";
		soße = "Tomatensoße";
 
		beläge.add("Mozzarella");
		beläge.add("Schwarze Oliven");
		beläge.add("Spinat");
		beläge.add("Aubergine");
	}
 
	void schneiden() {
		System.out.println("Schneide die Pizza in rechteckige Stücke");
	}
}
