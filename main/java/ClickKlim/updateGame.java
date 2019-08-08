package ClickKlim;

public class updateGame implements Runnable{
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