package main;
import UIelements.UiImplement;

import javax.swing.*;

public class Game {
    private GameWindow gameWindow;
    private GamePanel gamePanel;
    private UiImplement uiImplement;
    public Game(){
        //uiImplement = new UiImplement();
        gamePanel = new GamePanel();
        gameWindow = new GameWindow(gamePanel);
        gamePanel.requestFocus();
    }
}
