package headfirst.proxy.kaugummi;

import java.rmi.*;
 
public class KaugummiUeberwachungTestlauf {
 
	public static void main(String[] args) {
		String[] standort = {"rmi://frankfurt.kaukugel.de/kaugummiautomat",
		                     "rmi://stuttgart.kaukugel.de/kaugummiautomat",
		                     "rmi://hamburg.kaukugel.de/kaugummiautomat"}; 
 
		KaugummiUeberwachung[] überwachung = new KaugummiUeberwachung[standort.length];
 
		for (int i=0;i < standort.length; i++) {
			try {
           		KaugummiAutomatRemote automat = 
						(KaugummiAutomatRemote) Naming.lookup(standort[i]);
           		überwachung[i] = new KaugummiUeberwachung(automat);
				System.out.println(überwachung[i]);
        	} catch (Exception e) {
            	e.printStackTrace();
        	}
		}
 
		for(int i=0; i < überwachung.length; i++) {
			überwachung[i].berichten();
		}
	}
}
