package ClickKlim;

import java.awt.*;
import javax.swing.*;

public final class Main{

    private static final int WIDTH = 1250;
    private static final int HEIGHT = 750;
    
    public static void main(String[] args) {
        createWindow();
    }

    static void createWindow(){
        GameValues gameData = new GameValues();

        // Create the frame
        JFrame frame = new JFrame("ClickKlim");
        frame.setSize(new Dimension(WIDTH, HEIGHT));
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new FlowLayout());

        // Create the Panel's
        Display milkPanel = new Display("Milk", gameData.getMilk());
        Display storagePanel = new Display("Storage", gameData.getStorage());
        
        // Add the Panel's to the frame and make the frame visible
        frame.add(milkPanel);
        frame.add(storagePanel);
        frame.setVisible(true);
    }
}