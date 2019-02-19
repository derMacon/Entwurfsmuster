package headfirst.command.fernsteuerung;

public class VentilatorAusBefehl implements Befehl {
	Ventilator ventilator;

	public VentilatorAusBefehl(Ventilator ventilator) {
		this.ventilator = ventilator;
	}
	public void ausführen() {
		ventilator.aus();
	}
}
