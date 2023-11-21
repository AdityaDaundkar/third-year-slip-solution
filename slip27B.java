import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class FileListApp extends JFrame {
    private JTextField directoryField;
    private JList<String> fileList;
    private DefaultListModel<String> listModel;

    public FileListApp() {
        setTitle("File List");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new BorderLayout());

        // Create a TextField to input the directory path
        directoryField = new JTextField();
        panel.add(directoryField, BorderLayout.NORTH);

        // Create a Button to list files and directories
        JButton listButton = new JButton("List Files");
        listButton.addActionListener(new ListButtonListener());
        panel.add(listButton, BorderLayout.CENTER);

        // Create a List Control to display the file names
        listModel = new DefaultListModel<>();
        fileList = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(fileList);
        panel.add(scrollPane, BorderLayout.SOUTH);

        add(panel);
    }

    private class ListButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String directoryPath = directoryField.getText();
            listModel.clear();

            File directory = new File(directoryPath);
            if (directory.exists() && directory.isDirectory()) {
                File[] files = directory.listFiles();

                for (File file : files) {
                    listModel.addElement(file.getName());
                }
            } else {
                JOptionPane.showMessageDialog(FileListApp.this, "Invalid directory path or directory does not exist.");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            FileListApp fileListApp = new FileListApp();
            fileListApp.setVisible(true);
        });
    }
}
