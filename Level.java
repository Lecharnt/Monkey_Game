package UIelements;

import javax.swing.*;
import java.awt.*;

public class Level {
    //new rare Bannanas wich are diffrent colors
    //unlock reberth
    private JFrame jFrame;
    private int spawnSpeedCost =1;
    private int spawnCapCost = 5;
    private int xpGainCost = 10;
    public int collectSizeAmountCost = 20;
    public int spawnAmountCost = 10;
    public int TierRankCost = 1;
    public static boolean fixTextLevel= false;
    private byte color;
    public void addTier(){
        if (Upgrades.tierRed == 255 && Upgrades.tierGreen == 255 && Upgrades.tierBlue == 0){
            color = 0;
        }
        else if (Upgrades.tierRed == 255 && Upgrades.tierGreen == 0 && Upgrades.tierBlue == 0){
            color = 1;
        }
        else if (Upgrades.tierRed ==255 && Upgrades.tierGreen == 0 && Upgrades.tierBlue == 255){
            color = 2;
        }
        else if (Upgrades.tierRed== 0 && Upgrades.tierGreen == 0 && Upgrades.tierBlue==255 ){
            color = 3;
        }
        else if (Upgrades.tierRed== 0 && Upgrades.tierBlue==255 && Upgrades.tierGreen == 255){
            color = 4;
        }
        else if (Upgrades.tierRed== 0 && Upgrades.tierGreen == 255 && Upgrades.tierBlue ==0){
            color = 5;
        }
        if (color == 0){
            Upgrades.tierGreen-=51;
        }
        else if (color == 1){
            Upgrades.tierBlue += 51;
        }
        else if (color == 2){
            Upgrades.tierRed-=51;
        }
        else if (color ==3){
            Upgrades.tierGreen += 51;
        }
        else if (color == 4){
            Upgrades.tierBlue-=51;
        }
        else if (color == 5){
            Upgrades.tierRed +=51;
        }

    }

    public void levelWindow(){
        jFrame = new JFrame();
        jFrame.setSize(430, 200);
        jFrame.setLayout(new BorderLayout());
        jFrame.setLocationRelativeTo(null);
        jFrame.setLocation(0,54);
        jFrame.setLayout(new GridLayout(6, 2));
        jFrame.setTitle("Level Shop");
        Font font = new Font("Dialog",Font.PLAIN, 30);


        JLabel spawnSpeedLable = new JLabel("Spawn Speed");
        spawnSpeedLable.setFont(font);
        JButton spawnSpeedButton = new JButton("Price: "+ getSpawnSpeedCost());
        spawnSpeedButton.addActionListener(e -> {
            if(getXpPoints()-getSpawnSpeedCost()*2 >= 0) {
                setSpawnSpeedCost(spawnSpeedCost*=2);
                setXpPoints(getXpPoints() - getSpawnSpeedCost());
                fixTextLevel= true;
                spawnSpeedButton.setText("Price: "+ getSpawnSpeedCost()*2);
                Upgrades.spawnSpeedMultiply = Upgrades.spawnSpeedMultiply /2;
            }
        });

        JLabel spawnAmountLabel = new JLabel("Spawn per");
        spawnAmountLabel.setFont(font);
        JButton spawnAmountButton = new JButton("Price: "+ getSpawnAmountCost());
        spawnAmountButton.addActionListener(e -> {
            if(getXpPoints()-getSpawnAmountCost()*2 >= 0) {
                setSpawnAmountCost(spawnAmountCost*=2);
                spawnAmountButton.setText("Price: "+ getSpawnAmountCost()*2);
                setXpPoints(getXpPoints() - getSpawnAmountCost());
                Upgrades.spawnAmount++;
                fixTextLevel= true;
            }
        });


        JLabel maxBannanasLabel = new JLabel("Spawn Cap");
        maxBannanasLabel.setFont(font);
        JButton spawnCapButton = new JButton("Price: "+ getSpawnCapCost());
        spawnCapButton.addActionListener(e -> {
            if(getXpPoints()-getSpawnCapCost()*2 >= 0) {
                setSpawnCapCost(spawnCapCost*=2);
                spawnCapButton.setText("Price: "+ getSpawnCapCost()*2);
                setXpPoints(getXpPoints() - getSpawnCapCost());
                Upgrades.spawnCapAmount+=20;
                fixTextLevel= true;
            }
        });


        JLabel xpGainLabel = new JLabel("Xp Gain");
        xpGainLabel.setFont(font);
        JButton xpGainButton = new JButton("Price: "+ getXpGainCost());
        xpGainButton.addActionListener(e -> {
            if(getXpPoints()-getXpGainCost()*2 >= 0) {
                setXpGainCost(xpGainCost*=2);
                xpGainButton.setText("Price: "+ getXpGainCost()*2);
                setXpPoints(getXpPoints() - getXpGainCost());
                Upgrades.xpGainAmount+=10;
                fixTextLevel= true;
            }
        });
        JLabel collectSizeLabel = new JLabel("Collector Size");
        collectSizeLabel.setFont(font);
        JButton collectSizeButton = new JButton("Price: "+ getCollectSizeCost());
        collectSizeButton.addActionListener(e -> {
            if(getXpPoints()-getCollectSizeCost()*2 >= 0) {
                setCollectSizeCost(collectSizeAmountCost*=2);
                collectSizeButton.setText("Price: "+ getCollectSizeCost()*2);
                setXpPoints(getXpPoints() - getCollectSizeCost());
                Upgrades.collectSizeAmount++;
                fixTextLevel= true;
            }
        });
        JLabel tierRankLabel = new JLabel("Tier rank");
        tierRankLabel.setFont(font);
        JButton tierRankButton = new JButton("Price: "+ getTierRankCost());
        tierRankButton.addActionListener(e -> {
            if(getXpPoints()-getTierRankCost()*2 >= 0) {
                setTierRankCost(TierRankCost);
                tierRankButton.setText("Price: "+ getTierRankCost()*2);
                setXpPoints(getXpPoints() - getTierRankCost());
                addTier();
                fixTextLevel= true;
            }
        });



        //bannana value
        //bannana amout per spawn
        //xp gain
        //collction size
        //spawn amount

        jFrame.add(spawnSpeedLable);
        jFrame.add(spawnSpeedButton);
        jFrame.add(maxBannanasLabel);
        jFrame.add(spawnCapButton);
        jFrame.add(spawnAmountLabel);
        jFrame.add(spawnAmountButton);
        jFrame.add(xpGainLabel);
        jFrame.add(xpGainButton);
        jFrame.add(collectSizeLabel);
        jFrame.add(collectSizeButton);
        jFrame.add(tierRankLabel);
        jFrame.add(tierRankButton);

        jFrame.setVisible(true);
        setLevelWindow(jFrame);
        jFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }

    private void setTierRankCost(int getTierRankCost) {
        this.TierRankCost = getTierRankCost;
    }

    private int getTierRankCost() {
        return TierRankCost;
    }

    public void setSpawnAmountCost(int spawnAmountCost) {
        this.spawnAmountCost = spawnAmountCost;
    }

    public int getSpawnAmountCost() {
        return spawnAmountCost;
    }

    public int getCollectSizeCost(){
        return collectSizeAmountCost;
    }
    public void setCollectSizeCost(int collectSizeAmountCost){
        this.collectSizeAmountCost = collectSizeAmountCost;
    }

    public int getXpGainCost() {
        return xpGainCost;
    }
    public void setXpGainCost(int xpGainCost) {
        this.xpGainCost = xpGainCost;
    }

    public int getSpawnSpeedCost() {
        return spawnSpeedCost;
    }
    public void setSpawnSpeedCost(int spawnSpeedCost) {
        this.spawnSpeedCost = spawnSpeedCost;
    }
    public void setSpawnCapCost(int spawnCapCost) {
        this.spawnCapCost = spawnCapCost;
    }

    public int getSpawnCapCost() {
        return spawnCapCost;
    }
    public void setXpPoints(int xpPoints){
        Upgrades.xpPoints = xpPoints;
    }
    public int getXpPoints(){
        return Upgrades.xpPoints;
    }
    public void setLevelWindow(JFrame levelWindow){
        this.jFrame = levelWindow;
    }

    public JFrame getLevelWindow(){
        return jFrame;
    }
}


