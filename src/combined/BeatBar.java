package combined;

import javax.swing.*;

public class BeatBar extends JProgressBar implements Runnable {
    private static final long serialVersionUID = 2L;
    JProgressBar progressBar;
    Thread thread;

    public BeatBar() {
        progressBar = new JProgressBar();
        thread = new Thread(this);
        progressBar.setMaximum(100);
        thread.start();
    }

    public void run() {
        for(;;) {
            int value = getValue();
            value = (int)(value * .75);
            progressBar.setValue(value);
            progressBar.repaint();
            try {
                Thread.sleep(50);
            } catch (Exception e) {};
        }
    }
}

