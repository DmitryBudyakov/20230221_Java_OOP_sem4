// Разбойник
package units;

public class Robber extends Warrior {

    private String name;

    public Robber(String name, int x, int y) {
        super(8, 3, 10, 6, 2, 4, x, y);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        String output = String.format(
                "Разбойник %s: hp = %d, attack = %d, defence = %d, minDamage = %d, maxDamage = %d, speed = %d",
                name, hp, attack, defence, minDamage, maxDamage, speed);
        return output;
    }

    @Override
    public String getInfo() {
        String info = String.format("Разбойник %s hp = %d speed = %d", name, hp, speed);
        return info;
    }


}
