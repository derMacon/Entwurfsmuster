package headfirst.command.fernsteuerung;

public class TV {
	String ort;
	int sender;

	public TV(String ort) {
		this.ort = ort;
	}

	public void ein() {
		System.out.println("TV ist an");
	}

	public void aus() {
		System.out.println("TV ist aus");
	}

	public void setSender() {
		this.sender = 3;
		System.out.println("Sender ist auf Video gestellt");
	}
}
