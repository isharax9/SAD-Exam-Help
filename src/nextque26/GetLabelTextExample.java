/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nextque26;

/**
 *
 * @author isharaLakshitha
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GetLabelTextExample extends JFrame {
    
    private JLabel label;
    private JTextField textField;
    private JButton getTextButton;

    public GetLabelTextExample() {
        // Create a JLabel with some initial text
        label = new JLabel("Hello, World!");

        // Create a JTextField to display the text from JLabel
        textField = new JTextField(20);
        textField.setEditable(false); // Make the text field read-only

        // Create a button to trigger the action
        getTextButton = new JButton("Get Text from JLabel");
        getTextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the text from the JLabel
                String labelText = label.getText();
                // Display the text in the JTextField
                textField.setText(labelText);
            }
        });

        // Add components to the frame
        getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        getContentPane().add(label);
        getContentPane().add(getTextButton);
        getContentPane().add(textField);

        // Set frame properties
        setTitle("Get Text from JLabel Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null); // Center the frame
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            GetLabelTextExample example = new GetLabelTextExample();
            example.setVisible(true);
        });
    }
}

