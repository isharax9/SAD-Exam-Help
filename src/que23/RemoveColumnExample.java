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
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class RemoveColumnExample extends JFrame {
    
    private JTable table;
    private DefaultTableModel tableModel;

    public RemoveColumnExample() {
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
        setTitle("Remove Column Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null); // Center the frame
    }

    public void removeColumn(int column) {
        // Get the column model of the table
        TableColumnModel columnModel = table.getColumnModel();
        // Remove the specified column
        TableColumn tableColumn = columnModel.getColumn(column);
        columnModel.removeColumn(tableColumn);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            RemoveColumnExample example = new RemoveColumnExample();
            example.setVisible(true);

            // Remove the second column (index 1)
            example.removeColumn(1);
        });
    }
}

