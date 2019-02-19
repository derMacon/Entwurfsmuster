package headfirst.command.fernsteuerung;

public class WhirlpoolAnBefehl implements Befehl {
	Whirlpool whirlpool;

	public WhirlpoolAnBefehl(Whirlpool whirlpool) {
		this.whirlpool = whirlpool;
	}

	public void ausführen() {
		whirlpool.an();
		whirlpool.heiß();
		whirlpool.sprudelnAn();
	}
}
