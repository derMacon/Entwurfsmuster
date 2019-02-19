package headfirst.proxy.kaugummi;
import java.rmi.*;

public class KaugummiAutomatTestlauf {
 
	public static void main(String[] args) {
		KaugummiAutomatRemote kaugummiAutomat = null;
		int anzahl;

		if (args.length < 2) {
			System.out.println("<Name> <Bestand> des Automaten");
 			System.exit(1);
		}

		try {
			anzahl = Integer.parseInt(args[1]);

			kaugummiAutomat = 
				new KaugummiAutomat(args[0], anzahl);
			Naming.rebind("//" + args[0] + "/kaugummiautomat", kaugummiAutomat);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
