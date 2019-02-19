package headfirst.combined.djview;

import java.util.*;

public class HerzModel implements HerzModelInterface, Runnable {
	ArrayList beatBeobachtende = new ArrayList();
	ArrayList bpmBeobachtende = new ArrayList();
	int time = 1000;
    int bpm = 90;
	Random random = new Random(System.currentTimeMillis());
	Thread thread;

	public HerzModel() {
		thread = new Thread(this);
		thread.start();
	}

	public void run() {
		int lastrate = -1;

		for(;;) {
			int change = random.nextInt(10);
			if (random.nextInt(2) == 0) {
				change = 0 - change;
			}
			int rate = 60000/(time + change);
			if (rate < 120 && rate > 50) {
				time += change;
				benachrichtigeBeatBeobachtende();
				if (rate != lastrate) {
					lastrate = rate;
					benachrichtigeBPMBeobachtende();
				}
			}
			try {
				Thread.sleep(time);
			} catch (Exception e) {}
		}
	}
	public int getHerzFrequenz() {
		return 60000/time;
	}

	public void registriereBeobachter(BeatBeobachter o) {
		beatBeobachtende.add(o);
	}

	public void entferneBeobachter(BeatBeobachter o) {
		int i = beatBeobachtende.indexOf(o);
		if (i >= 0) {
			beatBeobachtende.remove(i);
		}
	}

	public void benachrichtigeBeatBeobachtende() {
		for(int i = 0; i < beatBeobachtende.size(); i++) {
			BeatBeobachter beobachter = (BeatBeobachter)beatBeobachtende.get(i);
			beobachter.aktualisiereBeat();
		}
	}

	public void registriereBeobachter(BPMBeobachter o) {
		bpmBeobachtende.add(o);
	}

	public void entferneBeobachter(BPMBeobachter o) {
		int i = bpmBeobachtende.indexOf(o);
		if (i >= 0) {
			bpmBeobachtende.remove(i);
		}
	}

	public void benachrichtigeBPMBeobachtende() {
		for(int i = 0; i < bpmBeobachtende.size(); i++) {
			BPMBeobachter beobachter = (BPMBeobachter)bpmBeobachtende.get(i);
			beobachter.aktualisiereBPM();
		}
	}
}
