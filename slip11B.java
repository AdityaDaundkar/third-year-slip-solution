import java.applet.Applet;
import java.awt.*;
import java.util.Random;

public class TableLampApplet extends Applet implements Runnable {
    private Color lampColor = Color.YELLOW; // Initial lamp color
    private Thread colorChangeThread;

    public void init() {
        setSize(400, 400);
    }

    public void start() {
        if (colorChangeThread == null) {
            colorChangeThread = new Thread(this);
            colorChangeThread.start();
        }
    }

    public void run() {
        while (true) {
            // Generate a random color
            Random rand = new Random();
            int red = rand.nextInt(256);
            int green = rand.nextInt(256);
            int blue = rand.nextInt(256);

            lampColor = new Color(red, green, blue);

            repaint();

            // Sleep for a while to change color periodically
            try {
                Thread.sleep(2000); // Change color every 2 seconds (2000 milliseconds)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());

        // Draw the lamp base
        g.setColor(Color.GRAY);
        g.fillRect(150, 250, 100, 20);

        // Draw the lampshade
        g.setColor(lampColor);
        g.fillArc(100, 100, 200, 200, 0, 180);

        // Draw the lamp stand
        g.setColor(Color.BLACK);
        g.fillRect(195, 120, 10, 130);
    }
}
