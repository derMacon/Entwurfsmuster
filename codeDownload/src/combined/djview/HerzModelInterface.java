package headfirst.combined.djview;

public interface HerzModelInterface {
	int getHerzFrequenz();
	void registriereBeobachter(BeatBeobachter o);
	void entferneBeobachter(BeatBeobachter o);
	void registriereBeobachter(BPMBeobachter o);
	void entferneBeobachter(BPMBeobachter o);
}
