package headfirst.singleton.statisch;

public class Singleton {
	private static Singleton einzigeInstanz = new Singleton();
 
	private Singleton() {}
 
	public static Singleton getInstanz() {
		return einzigeInstanz;
	}
}
