package headfirst.singleton.threadsicher;

public class Singleton {
	private static Singleton einzigeInstanz;
 
	// andere nützliche Instanzvariablen
 
	private Singleton() {}
 
	public static synchronized Singleton getInstanz() {
		if (einzigeInstanz == null) {
			einzigeInstanz = new Singleton();
		}
		return einzigeInstanz;
	}
 
	// andere nützliche Methoden
}
