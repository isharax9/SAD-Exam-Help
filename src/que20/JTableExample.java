/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package que20;

/**
 *
 * @author isharaLakshitha
 */
import javax.swing.*;
import java.awt.*;

public class JTableExample extends JFrame {
    
    private JTable table;

    public JTableExample() {
        // Create sample data
        Object[][] data = {
            {"John", "Doe", 30},
            {"Jane", "Smith", 25},
            {"Tom", "Jones", 40},
                {"Tom", "Jones", 40}
        };

        // Create column names
        String[] columnNames = {"First Name", "Last Name", "Age"};

        // Create JTable with sample data
        table = new JTable(data, columnNames);

        // Add JTable to a JScrollPane
        JScrollPane scrollPane = new JScrollPane(table);

        // Add JScrollPane to the frame
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        // Set frame properties
        setTitle("JTable Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null); // Center the frame
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JTableExample example = new JTableExample();
            example.setVisible(true);

            // Count the number of rows
            int rowCount = example.table.getRowCount();
            System.out.println("Number of rows: " + rowCount);
        });
    }
}
