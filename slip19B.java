import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class MouseKeyboardPositionApplet extends Applet implements MouseMotionListener, KeyListener {
    private int mouseX, mouseY;
    private String keyboardInput = "";

    public void init() {
        addMouseMotionListener(this);
        addKeyListener(this);
        setFocusable(true);
        requestFocus();
    }

    public void paint(Graphics g) {
        g.drawString("Mouse X: " + mouseX, 10, 20);
        g.drawString("Mouse Y: " + mouseY, 10, 40);
        g.drawString("Keyboard Input: " + keyboardInput, 10, 60);
    }

    public void mouseMoved(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
        repaint();
    }

    public void mouseDragged(MouseEvent e) {
        // Not used in this example
    }

    public void keyPressed(KeyEvent e) {
        char keyChar = e.getKeyChar();
        if (Character.isLetterOrDigit(keyChar) || Character.isWhitespace(keyChar)) {
            keyboardInput += keyChar;
            repaint();
        }
    }

    public void keyReleased(KeyEvent e) {
        // Not used in this example
    }

    public void keyTyped(KeyEvent e) {
        // Not used in this example
    }
}
