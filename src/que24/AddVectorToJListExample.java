/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package que24;

/**
 *
 * @author isharaLakshitha
 */
import javax.swing.*;
import java.util.Vector;

public class AddVectorToJListExample extends JFrame {
    
    private JList<String> list;

    public AddVectorToJListExample() {
        // Create a new JList
        list = new JList<>();

        // Add the JList to a JScrollPane
        JScrollPane scrollPane = new JScrollPane(list);

        // Add JScrollPane to the frame
        getContentPane().add(scrollPane);

        // Set frame properties
        setTitle("Add Vector to JList Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null); // Center the frame
    }

    public void addVectorToList(Vector<String> data) {
        // Set the data to the JList
        list.setListData(data);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AddVectorToJListExample example = new AddVectorToJListExample();
            example.setVisible(true);

            // Create a vector of data
            Vector<String> data = new Vector<>();
            data.add("Item 1");
            data.add("Item 2");
            data.add("Item 3");

            // Add the vector to the JList
            example.addVectorToList(data);
        });
    }
}
