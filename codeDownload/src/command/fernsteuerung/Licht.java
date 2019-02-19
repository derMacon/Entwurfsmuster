package headfirst.command.fernsteuerung;

public class Licht {
	String ort = "";

	public Licht(String ort) {
		this.ort = ort;
	}

	public void ein() {
		System.out.println(ort + ": Licht ist an");
	}

	public void aus() {
		System.out.println(ort + ": Licht ist aus");
	}
}
