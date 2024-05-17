package UIelements;

import javax.swing.*;
import java.awt.*;

public class BannanaStore {
    private JFrame jFrame;
    public static boolean fixTextBannana =false;
    public void bannanaWindow(){
        jFrame = new JFrame();
        jFrame.setSize(430, 200);
        jFrame.setLayout(new BorderLayout());
        jFrame.setLocationRelativeTo(null);
        jFrame.setLocation(0,54);
        jFrame.setLayout(new GridLayout(5, 2));
        jFrame.setTitle("Orb Shop");
        Font font = new Font("Dialog",Font.PLAIN, 30);
        jFrame.setVisible(true);
        setBannanaWindow(jFrame);
        jFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }

    public void setBannanaPoints(int bannanaPoints){
        Upgrades.bananaPoints = bannanaPoints;
    }
    public int getBannanaPoints(){
        return Upgrades.bananaPoints;
    }

    public void setBannanaWindow(JFrame bannanaWindow){
        this.jFrame = bannanaWindow;
    }

    public JFrame getBannanaWindow(){
        return jFrame;
    }
}
