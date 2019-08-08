package ClickKlim;

public final class Main{
	
	private static Display gameScreen;
	private static GameValues gameData;
	
    public static void main(String[] args) {
        createWindow();
        Thread updateDisplay = new Thread(new updateDisplay());
        updateDisplay.start();
        while(true) {
        	if(gameData.getMilk() == 100) {
        		gameData.setMilk(50);
        		gameData.setStorage(1000);
        	}
        	else {
        		gameData.setMilk(100);
        		gameData.setStorage(3000);
        	}
        	try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
        }
    }

    static void createWindow(){
        gameData = new GameValues();
        gameScreen = new Display(gameData);
    } 
    
	public static Display getGameScreen() {
		return gameScreen;
	}
	public static void setGameScreen(Display d1) {
		Main.gameScreen = d1;
	}

	public static GameValues getGameData() {
		return gameData;
	}
	public static void setGameData(GameValues gameData) {
		Main.gameData = gameData;
	}
}