package ClickKlim;

public final class Main{
	
	private static Display d1;
	private static GameValues gameData;
	
    public static void main(String[] args) {
        createWindow();
        Thread updateDisplay = new Thread(new updateDisplay());
        updateDisplay.start();
        while(true) {
        	if(gameData.getMilk() == 100) {
        		gameData.setMilk(50);
        	}
        	else {
        		gameData.setMilk(100);
        	}
        	try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
        }
    }

    static void createWindow(){
        gameData = new GameValues();

        d1 = new Display(gameData);
    }

    
    
	public static Display getD1() {
		return d1;
	}
	public static void setD1(Display d1) {
		Main.d1 = d1;
	}

	public static GameValues getGameData() {
		return gameData;
	}
	public static void setGameData(GameValues gameData) {
		Main.gameData = gameData;
	}
}