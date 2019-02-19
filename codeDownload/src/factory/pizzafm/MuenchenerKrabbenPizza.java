package headfirst.factory.pizzafm;

public class MuenchenerKrabbenPizza extends Pizza {
	public MuenchenerKrabbenPizza() {
		name = "Krabben-Pizza Münchener Art";
		teig = "Teig mit extra dicker Kruste";
		soße = "Tomatensoße";
 
		beläge.add("Mozzarella");
		beläge.add("Gefrorene Krabben");
		beläge.add("Oliven");
	}
 
	void schneiden() {
		System.out.println("Schneide die Pizza in rechteckige Stücke");
	}
}
