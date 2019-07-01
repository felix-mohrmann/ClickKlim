package ClickKlim;

import java.awt.Dimension;

import javax.swing.JFrame;

public final class Main{

    private static final int WIDTH = 1920;
    private static final int HEIGHT = 1080;

    public static void main(String[] args) {
    	GameValues gameData = new GameValues();
    	Display display = new Display();
        JFrame frame = new JFrame();
        frame.setSize(new Dimension(WIDTH, HEIGHT));
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.add(display);
        frame.setVisible(true);
    }
}
