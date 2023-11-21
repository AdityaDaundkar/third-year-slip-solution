import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseEventHandler {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mouse Event Handling");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create a TextField to display the mouse click position
        final JTextField textField = new JTextField(20);
        textField.setEditable(false);

        // Create a JPanel to hold the TextField
        JPanel panel = new JPanel();
        panel.add(textField);

        // Add the panel to the content pane of the frame
        frame.getContentPane().add(panel, BorderLayout.NORTH);

        // Add a MouseAdapter to the frame to handle mouse events
        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                // Handle MOUSE_MOVED event
                textField.setText("Mouse moved at: (" + e.getX() + ", " + e.getY() + ")");
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                // Handle MOUSE_CLICK event
                textField.setText("Mouse clicked at: (" + e.getX() + ", " + e.getY() + ")");
            }
        });

        frame.setVisible(true);
    }
}
