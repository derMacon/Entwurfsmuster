package headfirst.state.kaugummizustand;

public class KaugummiAutomat {
 
	Zustand ausverkauftZustand;
	Zustand keineMünzeZustand;
	Zustand hatMünzeZustand;
	Zustand verkauftZustand;
 
	Zustand zustand = ausverkauftZustand;
	int anzahl = 0;
 
	public KaugummiAutomat(int anzahlKugeln) {
		ausverkauftZustand = new AusverkauftZustand(this);
		keineMünzeZustand = new KeineMuenzeZustand(this);
		hatMünzeZustand = new HatMuenzeZustand(this);
		verkauftZustand = new VerkauftZustand(this);

		this.anzahl = anzahlKugeln;
 		if (anzahlKugeln > 0) {
			zustand = keineMünzeZustand;
		} 
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
 
	int getAnzahl() {
		return anzahl;
	}
 
	void auffüllen(int anzahl) {
		this.anzahl = anzahl;
		zustand = keineMünzeZustand;
	}

    public Zustand getZustand() {
        return zustand;
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
