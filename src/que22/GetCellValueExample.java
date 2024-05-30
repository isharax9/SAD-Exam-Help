/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package que22;

/**
 *
 * @author isharaLakshitha
 */
import java.awt.BorderLayout;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class GetCellValueExample extends JFrame {

    private JTable table;

    public GetCellValueExample() {
        // Create sample data
        Object[][] data = {
            {"John", "Doe", 30},
            {"Jane", "Smith", 25},
            {"Tom", "Jones", 40}
        };

        // Create column names
        String[] columnNames = {"First Name", "Last Name", "Age"};

        // Create table model with sample data
        DefaultTableModel tableModel = new DefaultTableModel(data, columnNames);

        // Create JTable with the table model
        table = new JTable(tableModel);

        // Add JTable to a JScrollPane
        JScrollPane scrollPane = new JScrollPane(table);

        // Add JScrollPane to the frame
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        // Set frame properties
        setTitle("Get Cell Value Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null); // Center the frame
    }

    public void printCellValue(int row, int column) {
        // Get the value at the specified cell
        Object value = table.getValueAt(row, column);
        System.out.println("Value at (" + row + ", " + column + "): " + value);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            GetCellValueExample example = new GetCellValueExample();
            example.setVisible(true);

            // Print the value at a specific cell
            example.printCellValue(0, 0); // For example, print the value at row 1, column 1
        });
    }
}

