package headfirst.proxy.kaugummiueberwachung;
 
public class KaugummiUeberwachung {
	KaugummiAutomat automat;
 
	public KaugummiUeberwachung(KaugummiAutomat automat) {
		this.automat = automat;
	}
 
	public void berichten() {
		System.out.println("Kaugummiautomat: " + automat.getStandort());
		System.out.println("Aktueller Bestand: " + automat.getAnzahl() + " Kugeln");
		System.out.println("Aktueller Zustand: " + automat.getZustand());
	}
}
