package ClickKlim;

public class updateDisplay implements Runnable{
	@Override
	public void run() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Main.getD1().updateLabel();
	}
}
