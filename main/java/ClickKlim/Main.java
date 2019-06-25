package ClickKlim;

import java.awt.*;
import javax.swing.*;

public final class Main{

    private static final int WIDTH = 800;
    private static final int HEIGHT = 400;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(new Dimension(WIDTH, HEIGHT));
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.add(new Display());
        frame.setVisible(true);
    }
}
