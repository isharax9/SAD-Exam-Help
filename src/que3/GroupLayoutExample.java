/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package que3;

/**
 *
 * @author isharaLakshitha
 */
import javax.swing.*;
import java.awt.*;

public class GroupLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GroupLayout Example");
        Container contentPane = frame.getContentPane();
        GroupLayout layout = new GroupLayout(contentPane);
        contentPane.setLayout(layout);

        // Create 9 buttons
        JButton[] buttons = new JButton[9];
        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton("Button " + (i + 1));
        }

        // Create horizontal and vertical groups
        GroupLayout.SequentialGroup hGroup = layout.createSequentialGroup();
        GroupLayout.SequentialGroup vGroup = layout.createSequentialGroup();

        // Add buttons to the horizontal group
        for (int i = 0; i < 3; i++) {
            GroupLayout.ParallelGroup rowGroup = layout.createParallelGroup();
            for (int j = 0; j < 3; j++) {
                rowGroup.addComponent(buttons[i * 3 + j]);
            }
            hGroup.addGroup(rowGroup);
        }

        // Add buttons to the vertical group
        for (int i = 0; i < 3; i++) {
            GroupLayout.ParallelGroup colGroup = layout.createParallelGroup(GroupLayout.Alignment.BASELINE);
            for (int j = 0; j < 3; j++) {
                colGroup.addComponent(buttons[j * 3 + i]);
            }
            vGroup.addGroup(colGroup);
        }

        // Set the group layout
        layout.setHorizontalGroup(hGroup);
        layout.setVerticalGroup(vGroup);

        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
