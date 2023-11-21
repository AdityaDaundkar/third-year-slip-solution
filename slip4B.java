import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;

public class CalculatorApplet extends Applet implements ActionListener {
    private TextField display;
    private String input = "";
    private double result = 0;
    private String operator = "";
    
    public void init() {
        // Set the layout manager for the applet
        setLayout(new BorderLayout());
        
        // Create a text field for the display
        display = new TextField();
        display.setEditable(false);
        
        // Create a panel for buttons
        Panel buttonPanel = new Panel(new GridLayout(4, 4));
        
        // Define button labels
        String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
        };
        
        // Create buttons and add them to the panel
        for (String label : buttonLabels) {
            Button button = new Button(label);
            button.addActionListener(this);
            buttonPanel.add(button);
        }
        
        // Add components to the applet
        add(display, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
    }
    
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        
        if (Character.isDigit(command.charAt(0))) {
            input += command;
            display.setText(input);
        } else if (command.equals(".")) {
            if (!input.contains(".")) {
                input += ".";
                display.setText(input);
            }
        } else if (command.equals("=")) {
            calculateResult();
        } else {
            if (!operator.isEmpty()) {
                calculateResult();
            }
            operator = command;
            result = Double.parseDouble(input);
            input = "";
        }
    }
    
    private void calculateResult() {
        if (!input.isEmpty()) {
            double operand = Double.parseDouble(input);
            switch (operator) {
                case "+":
                    result += operand;
                    break;
                case "-":
                    result -= operand;
                    break;
                case "*":
                    result *= operand;
                    break;
                case "/":
                    if (operand != 0) {
                        result /= operand;
                    } else {
                        display.setText("Error: Division by zero");
                        return;
                    }
                    break;
            }
            display.setText(Double.toString(result));
            input = "";
            operator = "";
        }
    }
}
