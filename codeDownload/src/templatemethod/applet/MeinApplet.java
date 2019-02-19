package headfirst.templatemethod.applet;

import java.applet.Applet;
import java.awt.Graphics;

public class MeinApplet extends Applet {
    String nachricht;
 
    public void init() {
        nachricht = "Hallo Welt! Ich lebe!";
        repaint();
    }
 
    public void start() {
        nachricht = "Jetzt fahre ich hoch ...";
        repaint();
    }
 
    public void stop() {
        nachricht = "Oh, jetzt werde ich beendet ...";
        repaint();
    }
 
    public void destroy() {
        nachricht = "Auf Wiedersehn, grausame Welt";
        repaint();
    }
 
    public void paint(Graphics g) {
        g.drawString(nachricht, 5, 15);
    }
}

