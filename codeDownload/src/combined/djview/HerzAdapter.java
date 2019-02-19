package headfirst.combined.djview;

public class HerzAdapter implements BeatModelInterface {
	HerzModelInterface herz;
 
	public HerzAdapter(HerzModelInterface herz) {
		this.herz = herz;
	}

    public void initialize() {}
  
    public void ein() {}
  
    public void aus() {}
   
	public int getBPM() {
		return herz.getHerzFrequenz();
	}
  
    public void setBPM(int bpm) {}
   
	public void registriereBeobachter(BeatBeobachter o) {
		herz.registriereBeobachter(o);
	}
    
	public void entferneBeobachter(BeatBeobachter o) {
		herz.entferneBeobachter(o);
	}
     
	public void registriereBeobachter(BPMBeobachter o) {
		herz.registriereBeobachter(o);
	}
  
	public void entferneBeobachter(BPMBeobachter o) {
		herz.entferneBeobachter(o);
	}
}
