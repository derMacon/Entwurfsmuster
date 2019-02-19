package headfirst.singleton.schokolade;
 
public class SchokoladenSteuerung {
	public static void main(String args[]) {
		SchokoladenKocher kocher = SchokoladenKocher.getInstanz();
		kocher.füllen();
		kocher.kochen();
		kocher.leeren();

		// liefert die vorhandene Instanz zurück
		SchokoladenKocher kocher2 = SchokoladenKocher.getInstanz();
	}
}
