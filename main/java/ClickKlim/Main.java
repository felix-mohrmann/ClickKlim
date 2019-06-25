package ClickKlim;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public final class Main{

    private static final int WIDTH = 1920;
    private static final int HEIGHT = 1080;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(new Dimension(WIDTH, HEIGHT));
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        JButton button1 = new JButton("Test");
        button1.setFont(new Font(null, Font.PLAIN, 100));
        button1.setSize(400, 400);
        button1.setLocation(10, 10);
        frame.add(button1);
        ActionListener al1 = new ActionListener() {
            public void actionPerformed( ActionEvent e ) {
            	if(button1.getText().equals("Test")) {
            		button1.setText("Ende");
            	}
            	else {
            		System.exit( 0 );
            	}
          }
        };
        button1.addActionListener( al1 );
        
        JTextField text1 = new JTextField("Test!");
        text1.setFont(new Font(null, Font.PLAIN, 100));
        text1.setSize(400, 400);
        text1.setLocation(410, 10);
        frame.add(text1);
        
        
    }
}
