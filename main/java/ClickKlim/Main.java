package ClickKlim;

import java.applet.*;
import java.awt.*;

public final class Main extends Applet{
	 public void paint( Graphics g )
	  {
		 Font h = new Font("test", 0, 100);
		 g.setFont(h);
	     g.drawString( "Hallo Welt!", 100, 100 );
	  }
}
