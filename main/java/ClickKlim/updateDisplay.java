package ClickKlim;

public class updateDisplay implements Runnable{
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Main.getGameScreen().updateLabel();
		}
	}
}
