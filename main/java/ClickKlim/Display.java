package ClickKlim;

import java.awt.*;
import javax.swing.*;

public class Display extends JPanel {

    private static final long serialVersionUID = 1L;

    public Display() {
        setLayout(null);
        repaint();
    }

    public void paint(Graphics g){
        super.paintComponent(g);
        setBackground(Color.black);
        g.setColor(Color.WHITE);
        Font h = new Font("test", 0, 100);
        g.setFont(h);
        g.drawString("Hello World!", 100, 100);
    }
}