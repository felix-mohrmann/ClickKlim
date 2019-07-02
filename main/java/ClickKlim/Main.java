package ClickKlim;

import java.awt.*;
import javax.swing.*;

public final class Main{

    private static final int WIDTH = 800;
    private static final int HEIGHT = 500;
    
    public static void main(String[] args) {
        // Display display = new Display();
        // GameValues gameData = new GameValues();
        createWindow();
    }

    static void createWindow(){
        
        //Create panel
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        //Build the frame
        JFrame frame = new JFrame("Window");
        frame.setSize(new Dimension(WIDTH, HEIGHT));
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        //Create button
        // JButton button = new JButton("I am a button");

        //Create label
        JLabel label = new JLabel("Milk: ");

        //Add label and button to panel
        panel.add(label);
        // panel.add(button);

        //Add panel to frame
        frame.add(panel);

        //Make the frame visible
        frame.setVisible(true);
    }
}
