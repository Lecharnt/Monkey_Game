package main;

import UIelements.Upgrades;

import java.awt.*;

class Banana {
    private int x;
    private int y;
    private double rotation;


    private int red;
    private int green;
    private int blue;

    private int health;


    public Banana(int x, int y, double rotation,int red,int green,int blue,int health) {
        this.x = x;
        this.y = y;
        this.rotation = rotation;
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.health = health;
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getRotation() {
        return rotation;
    }

    public void setRotation(double rotation) {
        this.rotation = rotation;
    }

    public void setColor(int red, int green, int blue){
        this.red = red;
        this.green = green;
        this.blue = blue;
    }
    public Color getColor(){
        return new Color(red, green, blue);
    }
    public int getRed(){
        return red;
    }
    public void setRed(int red){
        this.red = red;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public int getBlue(){
        return blue;
    }
    public void setBlue(int blue){
        this.blue = blue;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}