package headfirst.templatemethod.schulung;

public abstract class KoffeinhaltigesGetraenk {
  
	final void zubereitungsRezept() {
		kocheWasser();
		aufschütten();
		inTasseSchütten();
		zutatenHinzufügen();
	}
 
	abstract void aufschütten();
  
	abstract void zutatenHinzufügen();
 
	void kocheWasser() {
		System.out.println("Koche Wasser");
	}
  
	void inTasseSchütten() {
		System.out.println("Schütte in Tasse");
	}
}
