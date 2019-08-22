package ClickKlim;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.*;

public class Display extends JPanel {

    private static final long serialVersionUID = 1L;
    private static final int WIDTH = 1250;
    private static final int HEIGHT = 750;

    private static ArrayList<JLabel> labels = new ArrayList<JLabel>();
    ImageIcon milkPic =  new ImageIcon("main/images/milk.jpg");
    
    public Display (GameValues data) { 
        createFrame(data); 
    }

    public void createFrame(GameValues data) {
        // Create the frame
        JFrame frame = new JFrame("ClickKlim");
        frame.setSize(new Dimension(WIDTH, HEIGHT));
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new FlowLayout());

        // Create the MenuBar
        JMenuBar menubar = new JMenuBar();

        JMenu game = new JMenu("Game");
        game.setMnemonic(KeyEvent.VK_S);
        game.getAccessibleContext().setAccessibleDescription("Everything you need for the game.");
        menubar.add(game);

        JMenuItem start = new JMenuItem("Start");
        game.add(start);

        game.addSeparator();
        JMenuItem save = new JMenuItem("Save");
        game.add(save);

        JMenuItem load = new JMenuItem("Load");
        game.add(load);

        JMenu help = new JMenu("Help");
        help.getAccessibleContext().setAccessibleDescription("Need help?");
        menubar.add(help);

        JMenuItem instructions = new JMenuItem("Instructions");
        help.add(instructions);

        JMenuItem keyboardShortcuts = new JMenuItem("Keyboard Shortcuts");
        help.add(keyboardShortcuts);

        help.addSeparator();
        JMenu about = new JMenu("About");
        help.add(about);

        JMenuItem description = new JMenuItem("Description");
        about.add(description);

        JMenuItem log = new JMenuItem("Log");
        about.add(log);

        createLabel("Milk", data.getMilk());
        createLabel("Storage", data.getStorage());
        
        // Add everything to the frame and make it visible
        // REWRITE: make a for-loop out of this!
        frame.setJMenuBar(menubar);
        frame.add(labels.get(0));
        frame.add(labels.get(1));
        frame.add(labels.get(2));
        frame.setVisible(true);
    }

    public void createLabel(String type, double value) {
        JLabel label = new JLabel(type + ": " + value);     //Create label    
        labels.add(label);  //Add label to labels-array
        labels.add(createMilkButton());
    }
    
    void updateLabel() {
    	labels.get(0).setText("Milk: " + Main.getGameData().getMilk());
        labels.get(1).setText("Storage: " + Main.getGameData().getStorage());
        labels.get(2).setText("");
    }

    public JLabel createMilkButton(){
        JLabel milkLabel = new JLabel();
        milkLabel.setIcon(milkPic);
        return milkLabel;
    }
}