package headfirst.singleton.klassisch;

// HINWEIS: Das ist nicht threadsicher!

public class Singleton {
	private static Singleton einzigeInstanz;
 
	// andere nützliche Instanzvariablen
 
	private Singleton() {}
 
	public static Singleton getInstanz() {
		if (einzigeInstanz == null) {
			einzigeInstanz = new Singleton();
		}
		return einzigeInstanz;
	}
 
	// andere nützliche Methode
}
