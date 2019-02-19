package headfirst.singleton.zgs;

//
// ACHTUNG!  Vor Java 5 besteht keine Sicherheit, dass diese
// Singleton-Implementierung funktioniert.
//

public class Singleton {
	private volatile static Singleton einzigeInstanz;
 
	private Singleton() {}
 
	public static Singleton getInstanz() {
		if (einzigeInstanz == null) {
			synchronized (Singleton.class) {
				if (einzigeInstanz == null) {
					einzigeInstanz = new Singleton();
				}
			}
		}
		return einzigeInstanz;
	}
}
