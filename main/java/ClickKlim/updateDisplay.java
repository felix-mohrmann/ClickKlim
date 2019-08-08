package ClickKlim;

public class updateDisplay implements Runnable{
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Main.getD1().updateLabel();
		}
	}
}
