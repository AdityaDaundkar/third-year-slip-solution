import java.applet.Applet;
import java.awt.Graphics;

public class TempleApplet extends Applet {
    public void paint(Graphics g) {
        // Set background color
        setBackground(java.awt.Color.CYAN);

        // Draw temple base (rectangle)
        g.setColor(java.awt.Color.GRAY);
        g.fillRect(100, 150, 300, 200);

        // Draw temple roof (triangle)
        int[] roofX = {100, 250, 400};
        int[] roofY = {150, 50, 150};
        g.setColor(java.awt.Color.ORANGE);
        g.fillPolygon(roofX, roofY, 3);

        // Draw temple door (rectangle)
        g.setColor(java.awt.Color.DARK_GRAY);
        g.fillRect(220, 250, 80, 100);

        // Draw temple windows (squares)
        g.setColor(java.awt.Color.YELLOW);
        g.fillRect(130, 250, 60, 60);
        g.fillRect(310, 250, 60, 60);

        // Draw temple pillars (rectangles)
        g.setColor(java.awt.Color.RED);
        g.fillRect(130, 150, 20, 100);
        g.fillRect(160, 150, 20, 100);
        g.fillRect(310, 150, 20, 100);
        g.fillRect(340, 150, 20, 100);
    }
}
