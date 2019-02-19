package headfirst.command.rueckgaengig;

public class VentilatorAusBefehl implements Befehl {
	Ventilator ceilingFan;
	int prevSpeed;
  
	public VentilatorAusBefehl(Ventilator ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
 
	public void ausführen() {
		prevSpeed = ceilingFan.getGeschwindigkeit();
		ceilingFan.aus();
	}
 
	public void rückgängig() {
		if (prevSpeed == Ventilator.SCHNELL) {
			ceilingFan.schnell();
		} else if (prevSpeed == Ventilator.MITTEL) {
			ceilingFan.mittel();
		} else if (prevSpeed == Ventilator.LANGSAM) {
			ceilingFan.langsam();
		} else if (prevSpeed == Ventilator.AUS) {
			ceilingFan.aus();
		}
	}
}
