package headfirst.command.rueckgaengig;

public class VentilatorMittelBefehl implements Befehl {
	Ventilator ventilator;
	int letzteGeschwindigkeit;
  
	public VentilatorMittelBefehl(Ventilator ventilator) {
		this.ventilator = ventilator;
	}
 
	public void ausführen() {
		letzteGeschwindigkeit = ventilator.getGeschwindigkeit();
		ventilator.mittel();
	}
 
	public void rückgängig() {
		if (letzteGeschwindigkeit == Ventilator.SCHNELL) {
			ventilator.schnell();
		} else if (letzteGeschwindigkeit == Ventilator.MITTEL) {
			ventilator.mittel();
		} else if (letzteGeschwindigkeit == Ventilator.LANGSAM) {
			ventilator.langsam();
		} else if (letzteGeschwindigkeit == Ventilator.AUS) {
			ventilator.aus();
		}
	}
}
