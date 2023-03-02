package units;

public class Sniper extends Archer {

    private String name;

    public Sniper(String name, int x, int y) {
        super(12, 10, 15, 9, 32, 8, 10, x, y);
        this.name = name;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        String output = String.format(
                "Снайпер %s: hp = %d, attack = %d, defence = %d, shoots = %d, minDamage = %d, maxDamage = %d, speed = %d",
                name, hp, attack, defence, shoots, minDamage, maxDamage, speed);
        return output;
    }

    @Override
    public String getInfo() {
        String info = String.format("Снайпер %s hp = %d speed = %d", name, hp, speed);
        return info;
    }

}
