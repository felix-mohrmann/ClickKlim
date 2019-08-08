package ClickKlim;

import java.util.ArrayList;
import javax.swing.*;

public class Display extends JPanel {

    private static final long serialVersionUID = 1L;
    public static ArrayList<JLabel> labels = new ArrayList<JLabel>();

    public Display() {
//        JLabel label = new JLabel(type + ": " + value);		//Create label
//        this.add(label);		//Add label to panel
    }

    public void createLabel(String type, double value) {
        JLabel label = new JLabel(type + ": " + value);		//Create label
        this.add(label);		//Add label to panel
        labels.add(label);
    }
	
}