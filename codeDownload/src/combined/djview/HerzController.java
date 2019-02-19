package headfirst.combined.djview;
  
public class HerzController implements ControllerInterface {
	HerzModelInterface model;
	DJView view;
  
	public HerzController(HerzModelInterface model) {
		this.model = model;
		view = new DJView(this, new HerzAdapter(model));
        view.erzeugeView();
        view.erzeugeSteuerungselemente();
		view.disableStopMenuItem();
		view.disableStartMenuItem();
	}
  
	public void start() {}
 
	public void stop() {}
    
	public void increaseBPM() {}
    
	public void decreaseBPM() {}
  
 	public void setBPM(int bpm) {}
}



