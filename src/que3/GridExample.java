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
import java.awt.*;
import javax.swing.*;

public class GridExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridLayout Example");
        frame.setLayout(new GridLayout(3, 3)); // 3 rows and 3 columns
        for (int i = 0; i < 9; i++) {
            frame.add(new JButton("Button " + (i + 1)));
        }
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

