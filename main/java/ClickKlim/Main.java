package ClickKlim;

import java.awt.*;
import java.awt.event.KeyEvent;

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

        // Create the Panel's
//        Display milkPanel = new Display("Milk", gameData.getMilk());
//        Display storagePanel = new Display("Storage", gameData.getStorage());
        Display valueLabels = new Display();
        valueLabels.createLabel("milk", gameData.getMilk());
        valueLabels.createLabel("storage", gameData.getStorage());
        
        // Add everything to the frame and make it visible
        frame.setJMenuBar(menubar);
        frame.add(valueLabels.labels.get(0));
        frame.add(valueLabels.labels.get(1));
        frame.setVisible(true);
    }
}