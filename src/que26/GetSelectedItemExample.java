/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package que26;

/**
 *
 * @author isharaLakshitha
 */
import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GetSelectedItemExample extends JFrame {
    
    private JComboBox<String> comboBox;
    private JLabel selectedLabel;

    public GetSelectedItemExample() {
        // Create sample data
        String[] data = {"Option 1", "Option 2", "Option 3", "Option 4"};

        // Create JComboBox with sample data
        comboBox = new JComboBox<>(data);

        // Create a label to display the selected item
        selectedLabel = new JLabel("Selected Item: None");

        // Create a button to trigger the action
        JButton getSelectedButton = new JButton("Get Selected Item");
        getSelectedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the selected item from the JComboBox
                String selectedItem = (String) comboBox.getSelectedItem();
                // Update the label with the selected item
                selectedLabel.setText("Selected Item: " + selectedItem);
            }
        });

        // Add components to the frame
        getContentPane().add(comboBox, BorderLayout.NORTH);
        getContentPane().add(getSelectedButton, BorderLayout.CENTER);
        getContentPane().add(selectedLabel, BorderLayout.SOUTH);

        // Set frame properties
        setTitle("Get Selected Item Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300);
        setLocationRelativeTo(null); // Center the frame
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            GetSelectedItemExample example = new GetSelectedItemExample();
            example.setVisible(true);
        });
    }
}

