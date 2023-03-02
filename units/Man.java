// Обобщенный абстрактный класс
package units;

import java.util.ArrayList;

public abstract class Man implements GameInterface, Comparable<Man> {

    protected int attack, defence, damage, hp, speed;
    protected Point coords;
    protected String state;
    
    public Man(int attack, int defence, int hp, int speed, int x, int y) {
        this.attack = attack;
        this.defence = defence;
        this.hp = hp;
        this.speed = speed;
        this.coords = new Point(x, y);
        state = "Stand";
    }


    public Man(int attack, int defence, int damage, int hp, int speed, int x, int y) {
        this.attack = attack;
        this.defence = defence;
        this.damage = damage;
        this.hp = hp;
        this.speed = speed;
        this.coords = new Point(x, y);
        state = "Stand";
    }

    @Override
    public void step(ArrayList<Man> team1, ArrayList<Man> team2) { }


    protected int findNearest(ArrayList<Man> team) {
        double min = Double.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < team.size(); i++) {
            if (min > coords.getDistance(team.get(i).coords)) {
                index = i;
                min = coords.getDistance(team.get(i).coords);
            }
        }
        return index;
    }

    protected void getDamage(float damage) {
        this.hp -= damage;
        if (hp <= 0) {
            hp = 0;
            state = "Die";
        }
    }


    @Override
    public String getInfo() {
        return "";
    }

    void Attack(){
        System.out.println("Иду на Вы");
    }

    public int getHp() {
        return hp;
    }

    public int getDefence() {
        return defence;
    }

    public int getAttack() {
        return attack;
    }

    public int getSpeed() {
        return speed;
    }


    public int getDamage() {
        return damage;
    }


    @Override
    public int compareTo(Man o) {
        if (this.getSpeed() == o.getSpeed()) {
            return o.getHp() - this.getHp();
        }
        return o.getSpeed() - this.getSpeed();
    }

    

}