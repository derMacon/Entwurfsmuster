package headfirst.combined.djview;
  
import javax.sound.midi.*;
import java.util.*;

public class BeatModel implements BeatModelInterface, MetaEventListener {
    Sequencer sequencer;
	ArrayList beatBeobachtende = new ArrayList();
	ArrayList bpmBeobachtende = new ArrayList();
    int bpm = 90;
    Sequence sequence;
    Track track;
 
	public void initialize() {
        setUpMidi();
        buildTrackAndStart();
	}
 
    public void ein() {
        sequencer.start();
        setBPM(90);
    }
 
    public void aus() {
		setBPM(0);
		sequencer.stop();
    }
 
    public void setBPM(int bpm) {
		this.bpm = bpm;
		sequencer.setTempoInBPM(getBPM());
		benachrichtigeBPMBeobachtende();
    }
  
	public int getBPM() {
		return bpm;
	}
  
	void beatEvent() {
		benachrichtigeBeatBeobachter();
	}
  
   
	public void registriereBeobachter(BeatBeobachter o) {
		beatBeobachtende.add(o);
	}
  
	public void benachrichtigeBeatBeobachter() {
		for(int i = 0; i < beatBeobachtende.size(); i++) {
			BeatBeobachter beobachter = (BeatBeobachter)beatBeobachtende.get(i);
			beobachter.aktualisiereBeat();
		}
	}
  
	public void registriereBeobachter(BPMBeobachter o) {
		bpmBeobachtende.add(o);
	}
  
	public void benachrichtigeBPMBeobachtende() {
		for(int i = 0; i < bpmBeobachtende.size(); i++) {
			BPMBeobachter beobachter = (BPMBeobachter)bpmBeobachtende.get(i);
			beobachter.aktualisiereBPM();
		}
	}


	public void entferneBeobachter(BeatBeobachter o) {
		int i = beatBeobachtende.indexOf(o);
		if (i >= 0) {
			beatBeobachtende.remove(i);
		}
	}



	public void entferneBeobachter(BPMBeobachter o) {
		int i = bpmBeobachtende.indexOf(o);
		if (i >= 0) {
			bpmBeobachtende.remove(i);
		}
	}


    public void meta(MetaMessage message) {
        if (message.getType() == 47) {
			beatEvent();
        	sequencer.start();
        	setBPM(getBPM());
        }
    }

	public void setUpMidi() {
		try {
			sequencer = MidiSystem.getSequencer();
			sequencer.open();
			sequencer.addMetaEventListener(this);
			sequence = new Sequence(Sequence.PPQ,4);
			track = sequence.createTrack();
			sequencer.setTempoInBPM(getBPM());
		} catch(Exception e) {
				e.printStackTrace();
		}
    } 

     public void buildTrackAndStart() {
        int[] trackList = {35, 0, 46, 0};
    
        sequence.deleteTrack(null);
        track = sequence.createTrack();

      	makeTracks(trackList);
		track.add(makeEvent(192,9,1,0,4));      
	 	try {
			sequencer.setSequence(sequence); 
			// Wenn Sie auch unter Java 5 den Beat hören möchten
			// (vgl. die Anmerkungen in der Datei README.txt):
			// sequencer.setLoopCount(sequencer.LOOP_CONTINUOUSLY);
		} catch(Exception e) {
			e.printStackTrace();
		}
    } 
            
    public void makeTracks(int[] list) {        
       
       for (int i = 0; i < list.length; i++) {
          int key = list[i];

          if (key != 0) {
             track.add(makeEvent(144,9,key, 100, i));
             track.add(makeEvent(128,9,key, 100, i+1));
          }
       }
    }
        
    public  MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
        MidiEvent event = null;
        try {
            ShortMessage a = new ShortMessage();
            a.setMessage(comd, chan, one, two);
            event = new MidiEvent(a, tick);
            
        } catch(Exception e) {
			e.printStackTrace(); 
		}
        return event;
    }
}
