package headfirst.templatemethod.schulung;

public class GetraenkeTestlauf {
	public static void main(String[] args) {
 
		Tee tee = new Tee();
		Kaffee kaffee = new Kaffee();
 
		System.out.println("\nMache Tee ...");
		tee.zubereitungsRezept();
 
		System.out.println("\nMache Kaffee ...");
		kaffee.zubereitungsRezept();

 
		TeeMitHook teeHook = new TeeMitHook();
		KaffeeMitHook kaffeeHook = new KaffeeMitHook();
 
		System.out.println("\nMache Tee ...");
		teeHook.zubereitungsRezept();
 
		System.out.println("\nMache Kaffee ...");
		kaffeeHook.zubereitungsRezept();
	}
}
