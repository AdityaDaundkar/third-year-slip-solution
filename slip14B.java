import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmployeeDetailsApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        // Create the main frame
        JFrame frame = new JFrame("Employee Details");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // Create and add a panel to the frame
        JPanel panel = new JPanel();
        frame.add(panel);

        // Create labels and text fields for employee details
        JLabel lblEno = new JLabel("Employee Number:");
        JTextField txtEno = new JTextField(10);

        JLabel lblEName = new JLabel("Employee Name:");
        JTextField txtEName = new JTextField(20);

        JLabel lblSal = new JLabel("Salary:");
        JTextField txtSal = new JTextField(10);

        // Create a button to submit the details
        JButton submitButton = new JButton("Submit");

        // Add action listener to the button
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Retrieve employee details from text fields
                String eno = txtEno.getText();
                String ename = txtEName.getText();
                String sal = txtSal.getText();

                // Display details in a new frame
                JFrame resultFrame = new JFrame("Employee Details Result");
                resultFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                resultFrame.setSize(300, 150);

                JPanel resultPanel = new JPanel();
                resultFrame.add(resultPanel);

                JLabel resultLabel = new JLabel("Employee Number: " + eno + " | Employee Name: " + ename + " | Salary: " + sal);
                resultPanel.add(resultLabel);

                resultFrame.setVisible(true);
            }
        });

        // Add components to the panel
        panel.add(lblEno);
        panel.add(txtEno);
        panel.add(lblEName);
        panel.add(txtEName);
        panel.add(lblSal);
        panel.add(txtSal);
        panel.add(submitButton);

        // Set the frame to be visible
        frame.setVisible(true);
    }
}
