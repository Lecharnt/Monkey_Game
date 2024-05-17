package main;

public class Monkey {
    private int x;
    private int y;
    private int speed;
    private int damage;
    private Banana collector;

    public Monkey(int x,int y, int speed,int damage){
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.damage = damage;
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

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Banana getCollector() {
        return collector;
    }

    public void setCollector(Banana collector) {
        this.collector = collector;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
