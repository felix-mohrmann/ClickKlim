package ClickKlim;

public final class Main{
    public static void main(String[] args) {
        createWindow();
    }

    static void createWindow(){
        GameValues gameData = new GameValues();

        Display d1 = new Display(gameData);
    }
}