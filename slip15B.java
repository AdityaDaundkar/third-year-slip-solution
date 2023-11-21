import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class SmileyFaceApplet extends Applet {
    public void paint(Graphics g) {
        // Draw the face (yellow circle)
        g.setColor(Color.YELLOW);
        g.fillOval(50, 50, 200, 200);

        // Draw the eyes (white circles)
        g.setColor(Color.WHITE);
        g.fillOval(90, 100, 40, 40);
        g.fillOval(170, 100, 40, 40);

        // Draw the pupils (black circles)
        g.setColor(Color.BLACK);
        g.fillOval(105, 120, 10, 10);
        g.fillOval(185, 120, 10, 10);

        // Draw the mouth (smile)
        g.drawArc(110, 130, 90, 60, 0, -180);
    }
}
