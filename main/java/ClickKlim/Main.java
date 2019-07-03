package ClickKlim;

import java.awt.*;
import javax.swing.*;

public final class Main{

    private static final int WIDTH = 800;
    private static final int HEIGHT = 500;
    
    public static void main(String[] args) {
        createWindow();
    }

    static void createWindow(){
        GameValues gameData = new GameValues();

        //Create the frame
        JFrame frame = new JFrame("ClickKlim");
        frame.setSize(new Dimension(WIDTH, HEIGHT));
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        Display milkDisplay = new Display(gameData);

        //Add the display to the frame and make it visible
        frame.add(milkDisplay);
        frame.setVisible(true);
    }
}
