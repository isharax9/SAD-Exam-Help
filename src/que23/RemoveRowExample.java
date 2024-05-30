/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package que23;

/**
 *
 * @author isharaLakshitha
 */
import java.awt.BorderLayout;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class RemoveRowExample extends JFrame {
    
    private JTable table;
    private DefaultTableModel tableModel;

    public RemoveRowExample() {
        // Create sample data
        Object[][] data = {
            {"John", "Doe", 30},
            {"Jane", "Smith", 25},
            {"Tom", "Jones", 40}
        };

        // Create column names
        String[] columnNames = {"First Name", "Last Name", "Age"};

        // Create table model with sample data
        tableModel = new DefaultTableModel(data, columnNames);

        // Create JTable with the table model
        table = new JTable(tableModel);

        // Add JTable to a JScrollPane
        JScrollPane scrollPane = new JScrollPane(table);

        // Add JScrollPane to the frame
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        // Set frame properties
        setTitle("Remove Row Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null); // Center the frame
    }

    public void removeRow(int row) {
        // Remove the specified row from the table model
        tableModel.removeRow(row);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            RemoveRowExample example = new RemoveRowExample();
            example.setVisible(true);

            // Remove the second row (index 1)
            example.removeRow(1);
        });
    }
}

