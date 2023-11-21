import javax.swing.*;
import java.awt.*;

public class LabelExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Label Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 100);

        // Create a label with the specified text
        JLabel label = new JLabel("Dr. D Y Patil College");

        // Set the background color to red
        label.setBackground(Color.RED);

        // Set the foreground (text) color to white
        label.setForeground(Color.WHITE);

        // Set the font size to 20
        label.setFont(new Font("Arial", Font.PLAIN, 20));

        // Enable the label to display its background color
        label.setOpaque(true);

        // Add the label to the content pane of the frame
        frame.getContentPane().add(label);

        frame.setVisible(true);
    }
}
