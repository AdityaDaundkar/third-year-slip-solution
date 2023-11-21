import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MultiplicationTableApp extends JFrame {
    private JButton showTableButton;
    private JList<String> tableList;
    private DefaultListModel<String> listModel;

    public MultiplicationTableApp() {
        setTitle("Multiplication Table");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);

        listModel = new DefaultListModel<>();
        tableList = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(tableList);

        showTableButton = new JButton("Show Table");
        showTableButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showMultiplicationTable();
            }
        });

        Container container = getContentPane();
        container.setLayout(new BorderLayout());
        container.add(showTableButton, BorderLayout.NORTH);
        container.add(scrollPane, BorderLayout.CENTER);
    }

    private void showMultiplicationTable() {
        listModel.clear();

        int number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number:"));

        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            listModel.addElement(number + " x " + i + " = " + result);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                MultiplicationTableApp app = new MultiplicationTableApp();
                app.setVisible(true);
            }
        });
    }
}
