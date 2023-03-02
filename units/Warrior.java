package units;

public class Warrior extends Man {

    protected int minDamage;
    protected int maxDamage;

    public Warrior(int attack, int defence, int hp, int speed, int minDamage, int maxDamage, int x, int y) {
        super(attack, defence, hp, speed, x, y);
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
    }

    @Override
    public String getInfo() {
        return "";
    }


    public int getMinDamage() {
        return minDamage;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

}
