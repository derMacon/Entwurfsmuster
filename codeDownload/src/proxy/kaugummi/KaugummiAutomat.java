package headfirst.proxy.kaugummi;

import java.rmi.*;
import java.rmi.server.*;
 
public class KaugummiAutomat
		extends UnicastRemoteObject implements KaugummiAutomatRemote 
{
	Zustand ausverkauftZustand;
	Zustand keineMünzeZustand;
	Zustand hatMünzeZustand;
	Zustand verkauftZustand;
	Zustand gewinnZustand;
 
	Zustand zustand = ausverkauftZustand;
	int anzahl = 0;
 	String standort;

	public KaugummiAutomat(String standort, int anzahlKugeln) throws RemoteException {
		ausverkauftZustand = new AusverkauftZustand(this);
		keineMünzeZustand = new KeineMuenzeZustand(this);
		hatMünzeZustand = new HatMuenzeZustand(this);
		verkauftZustand = new VerkauftZustand(this);
		gewinnZustand = new GewinnZustand(this);

		this.anzahl = anzahlKugeln;
 		if (anzahlKugeln > 0) {
			zustand = keineMünzeZustand;
		} 
		this.standort = standort;
	}
 
 
	public void münzeEinwerfen() {
		zustand.münzeEinwerfen();
	}
 
	public void münzeAuswerfen() {
		zustand.münzeAuswerfen();
	}
 
	public void griffDrehen() {
		zustand.griffDrehen();
		zustand.kugelAusgeben();
	}

	void setZustand(Zustand zustand) {
		this.zustand = zustand;
	}
 
	void kugelFreigeben() {
		System.out.println("Eine Kugel rollt aus dem Ausgabeschacht");
		if (anzahl != 0) {
			anzahl = anzahl - 1;
		}
	}

	public void auffüllen(int anzahl) {
		this.anzahl = anzahl;
		zustand = keineMünzeZustand;
	}
 
	public int getAnzahl() {
		return anzahl;
	}
 
    public Zustand getZustand() {
        return zustand;
    }
 
    public String getStandort() {
        return standort;
    }
  
    public Zustand getAusverkauftZustand() {
        return ausverkauftZustand;
    }

    public Zustand getKeineMünzeZustand() {
        return keineMünzeZustand;
    }

    public Zustand getHatMünzeZustand() {
        return hatMünzeZustand;
    }

    public Zustand getVerkauftZustand() {
        return verkauftZustand;
    }

    public Zustand getGewinnZustand() {
        return gewinnZustand;
    }
 
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nKaukugel & Co KG");
		result.append("\nJava-gestützter Kaugummi-Standautomat Modell Nr. 2005");
		result.append("\nBestand: " + anzahl + " Kaugummikugel");
		if (anzahl != 1) {
			result.append("n");
		}
		result.append("\n");
		result.append("Automat " + zustand + "\n");
		return result.toString();
	}
}
