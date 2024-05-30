package que6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        MyActionListener listener = new MyActionListener();
        // Add the listener to a component, e.g., a button
        // button.addActionListener(listener);
    }

    public static class MyActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Your code to handle the action event
            System.out.println("Action performed!");
        }
    }
}
