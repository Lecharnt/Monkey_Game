package UIelements;

import main.GamePanel;

import javax.swing.*;
import java.awt.*;
import UIelements.Level;

public class UiImplement extends JFrame {
    private JFrame mounyWindowGet;
    private JFrame rebirthWindowGet;
    private JFrame ascendWindowGet;
    private static JFrame jFrame;


    public void openLevelWindow(JFrame levelWindow, JFrame bannanaWindow, JFrame mounyWindow, JFrame RebirthWindow, JFrame AscendWindow){
        levelWindow.toFront();
        bannanaWindow.toBack();
        mounyWindow.toBack();
        RebirthWindow.toBack();
        AscendWindow.toBack();
    }


    public void openBannanaWindow(JFrame levelWindow, JFrame bannanaWindow, JFrame mounyWindow, JFrame RebirthWindow, JFrame AscendWindow){
        levelWindow.toBack();
        bannanaWindow.toFront();
        mounyWindow.toBack();
        RebirthWindow.toBack();
        AscendWindow.toBack();
    }

    public void openMounyWindow(JFrame levelWindow, JFrame bannanaWindow, JFrame mounyWindow, JFrame RebirthWindow, JFrame AscendWindow){
        levelWindow.toBack();
        bannanaWindow.toBack();
        mounyWindow.toFront();
        RebirthWindow.toBack();
        AscendWindow.toBack();
    }

    public void openRebirthWindow(JFrame levelWindow, JFrame bannanaWindow, JFrame mounyWindow, JFrame RebirthWindow, JFrame AscendWindow){
        levelWindow.toBack();
        bannanaWindow.toBack();
        mounyWindow.toBack();
        RebirthWindow.toFront();
        AscendWindow.toBack();
    }

    public void openAscendWindow(JFrame levelWindow, JFrame bannanaWindow, JFrame mounyWindow, JFrame RebirthWindow, JFrame AscendWindow){
        levelWindow.toBack();
        bannanaWindow.toBack();
        mounyWindow.toBack();
        RebirthWindow.toBack();
        AscendWindow.toFront();
    }

    public void mounyWindow(){
        jFrame = new JFrame();
        jFrame.setSize(430, 200);
        jFrame.setLayout(new BorderLayout());
        jFrame.setLocationRelativeTo(null);
        jFrame.setLocation(0,54);
        jFrame.setTitle("Money Shop");
        jFrame.setVisible(true);
        setMounyWindow(jFrame);
        jFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }

    public void rebirthWindow(){
        jFrame = new JFrame();
        jFrame.setSize(430, 200);
        jFrame.setLayout(new BorderLayout());
        jFrame.setLocationRelativeTo(null);
        jFrame.setLocation(0,54);
        jFrame.setTitle("Money Shop");
        jFrame.setVisible(true);
        setRebirthWindow(jFrame);
        jFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }

    public void ascendWindow(){
        jFrame = new JFrame();
        jFrame.setSize(430, 200);
        jFrame.setLayout(new BorderLayout());
        jFrame.setLocationRelativeTo(null);
        jFrame.setLocation(0,54);
        jFrame.setTitle("Ascend Shop");
        jFrame.setVisible(true);
        setAscendWindow(jFrame);
        jFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }

    public void setMounyWindow(JFrame bannanaWindow){
        this.mounyWindowGet = bannanaWindow;
    }

    public JFrame getMounyWindow(){
        return mounyWindowGet;
    }

    public void setRebirthWindow(JFrame bannanaWindow){
        this.rebirthWindowGet = bannanaWindow;
    }

    public JFrame getRebirthWindow(){
        return rebirthWindowGet;
    }
    public void setAscendWindow(JFrame bannanaWindow){
        this.ascendWindowGet = bannanaWindow;
    }

    public JFrame getAscendWindow(){
        return ascendWindowGet;
    }
}
