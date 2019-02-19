package headfirst.combined.djview;
  
public interface BeatModelInterface {
	void initialize();
  
	void ein();
  
	void aus();
  
    void setBPM(int bpm);
  
	int getBPM();
  
	void registriereBeobachter(BeatBeobachter o);
  
	void entferneBeobachter(BeatBeobachter o);
  
	void registriereBeobachter(BPMBeobachter o);
  
	void entferneBeobachter(BPMBeobachter o);
}
