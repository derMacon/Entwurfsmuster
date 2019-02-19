package headfirst.templatemethod.schulung;

public abstract class KoffeinhaltigesGetraenkMitHook {
 
	void zubereitungsRezept() {
		kocheWasser();
		aufschütten();
		inTasseSchütten();
		if (kundeWillZutaten()) {
			zutatenHinzufügen();
		}
	}
 
	abstract void aufschütten();
 
	abstract void zutatenHinzufügen();
 
	void kocheWasser() {
		System.out.println("Koche Wasser");
	}
 
	void inTasseSchütten() {
		System.out.println("Schütte in Tasse");
	}
 
	boolean kundeWillZutaten() {
		return true;
	}
}
