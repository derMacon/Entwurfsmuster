package headfirst.proxy.kaugummi;

import java.rmi.*;
 
public class KaugummiUeberwachung {
	KaugummiAutomatRemote automat;
 
	public KaugummiUeberwachung(KaugummiAutomatRemote automat) {
		this.automat = automat;
	}
 
	public void berichten() {
		try {
			System.out.println("Kaugummiautomat: " + automat.getStandort());
			System.out.println("Aktueller Bestand: " + automat.getAnzahl() + " Kugeln");
			System.out.println("Aktueller Zustand: " + automat.getZustand());
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}
