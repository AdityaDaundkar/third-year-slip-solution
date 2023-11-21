import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class BouncingBallApplet extends Applet implements ActionListener {
    private int x, y; // Initial position of the ball
    private int xSpeed = 5, ySpeed = 5; // Initial speed of the ball
    private Color[] colors = {Color.RED, Color.GREEN, Color.BLUE, Color.ORANGE}; // Array of colors
    private int colorIndex = 0; // Index for selecting colors

    private Timer timer;

    public void init() {
        x = 100;
        y = 100;

        timer = new Timer(50, this); // Timer with 50ms delay, ActionListener is this
        timer.start(); // Start the timer
    }

    public void actionPerformed(ActionEvent e) {
        // Update the ball's position
        x += xSpeed;
        y += ySpeed;

        // Check for collisions with the applet's boundaries
        if (x < 0 || x > getWidth() - 20) {
            xSpeed = -xSpeed; // Reverse direction on horizontal collision
            changeColor(); // Change ball's color
        }

        if (y < 0 || y > getHeight() - 20) {
            ySpeed = -ySpeed; // Reverse direction on vertical collision
            changeColor(); // Change ball's color
        }

        repaint(); // Request a repaint of the applet
    }

    public void paint(Graphics g) {
        g.setColor(colors[colorIndex]);
        g.fillOval(x, y, 20, 20); // Draw a ball
    }

    private void changeColor() {
        colorIndex = (colorIndex + 1) % colors.length; // Cycle through colors
    }
}
