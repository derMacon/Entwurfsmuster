package headfirst.command.party;

public class Fernseher {
	String ort;
	int sender;

	public Fernseher(String ort) {
		this.ort = ort;
	}

	public void ein() {
		System.out.println(ort + " Fernseher ist an");
	}

	public void aus() {
		System.out.println(ort + " Fernseher ist aus");
	}

	public void setSender() {
		this.sender = 3;
		System.out.println(ort + " Fernseher spielt DVD");
	}
}
