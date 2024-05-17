package main;

import javax.swing.*;
import java.awt.*;
import UIelements.UiImplement;

public class GameWindow {
    private JFrame jFrame;

    public GameWindow(GamePanel gamePanel) {
        Dimension Dimension = Toolkit.getDefaultToolkit().getScreenSize();
        jFrame = new JFrame();
        jFrame.setSize((int) Dimension.getWidth(), (int) Dimension.getHeight());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(new BorderLayout());
        jFrame.add(gamePanel, BorderLayout.CENTER);

        jFrame.setLocationRelativeTo(null);
        jFrame.setLocation(500,200);
        jFrame.setVisible(true);
    }
}
