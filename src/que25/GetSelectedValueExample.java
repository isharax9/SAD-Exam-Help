/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package que25;

/**
 *
 * @author isharaLakshitha
 */
import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GetSelectedValueExample extends JFrame {
    
    private JList<String> list;
    private JLabel selectedLabel;

    public GetSelectedValueExample() {
        // Create sample data
        String[] data = {"Item 1", "Item 2", "Item 3", "Item 4"};

        // Create JList with sample data
        list = new JList<>(data);

        // Add the JList to a JScrollPane
        JScrollPane scrollPane = new JScrollPane(list);

        // Create a label to display the selected item
        selectedLabel = new JLabel("Selected Item: None");

        // Create a button to trigger the action
        JButton getSelectedButton = new JButton("Get Selected Item");
        getSelectedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the selected value from the JList
                String selectedValue = list.getSelectedValue();
                // Update the label with the selected item
                selectedLabel.setText("Selected Item: " + selectedValue);
            }
        });

        // Add components to the frame
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        getContentPane().add(getSelectedButton, BorderLayout.SOUTH);
        getContentPane().add(selectedLabel, BorderLayout.NORTH);

        // Set frame properties
        setTitle("Get Selected Value Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null); // Center the frame
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            GetSelectedValueExample example = new GetSelectedValueExample();
            example.setVisible(true);
        });
    }
}

