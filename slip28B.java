import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmployeeDetailsApp extends JFrame {
    private DefaultTableModel tableModel;
    private JTable table;
    private JTextField enoField, enameField, salaryField;

    public EmployeeDetailsApp() {
        setTitle("Employee Details");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel inputPanel = new JPanel(new GridLayout(4, 2));

        JLabel enoLabel = new JLabel("Eno:");
        enoField = new JTextField(10);

        JLabel enameLabel = new JLabel("Ename:");
        enameField = new JTextField(10);

        JLabel salaryLabel = new JLabel("Salary:");
        salaryField = new JTextField(10);

        JButton addButton = new JButton("Add Employee");
        addButton.addActionListener(new AddButtonListener());

        inputPanel.add(enoLabel);
        inputPanel.add(enoField);
        inputPanel.add(enameLabel);
        inputPanel.add(enameField);
        inputPanel.add(salaryLabel);
        inputPanel.add(salaryField);
        inputPanel.add(addButton);

        tableModel = new DefaultTableModel();
        tableModel.addColumn("Eno");
        tableModel.addColumn("Ename");
        tableModel.addColumn("Salary");

        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);

        getContentPane().add(inputPanel, BorderLayout.NORTH);
        getContentPane().add(scrollPane, BorderLayout.CENTER);
    }

    private class AddButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String eno = enoField.getText();
            String ename = enameField.getText();
            String salary = salaryField.getText();

            if (!eno.isEmpty() && !ename.isEmpty() && !salary.isEmpty()) {
                tableModel.addRow(new String[]{eno, ename, salary});
                enoField.setText("");
                enameField.setText("");
                salaryField.setText("");
            } else {
                JOptionPane.showMessageDialog(EmployeeDetailsApp.this, "Please fill in all fields.");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            EmployeeDetailsApp app = new EmployeeDetailsApp();
            app.setVisible(true);
        });
    }
}
