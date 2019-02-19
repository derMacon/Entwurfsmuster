package headfirst.command.fernsteuerung;

public class GaragenTor {
	String ort;

	public GaragenTor(String ort) {
		this.ort = ort;
	}

	public void hoch() {
		System.out.println(ort + ": Garagentor ist offen");
	}

	public void runter() {
		System.out.println(ort + ": Garagentor ist geschlossen");
	}

	public void halt() {
		System.out.println(ort + ": Garagentor wurde angehalten");
	}

	public void lichtAn() {
		System.out.println(ort + ": Garagenbeleuchtung ist an");
	}

	public void lichtAus() {
		System.out.println(ort + ": Garagenbeleuchtung ist aus");
	}
}
