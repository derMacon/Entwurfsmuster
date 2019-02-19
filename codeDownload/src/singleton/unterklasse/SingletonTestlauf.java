package headfirst.singleton.unterklasse;

public class SingletonTestlauf {
	public static void main(String[] args) {
		Singleton foo = KaltesSingleton.getInstanz();
		Singleton bar = HeissesSingleton.getInstanz();
		System.out.println(foo);
		System.out.println(bar);
 	}
}
