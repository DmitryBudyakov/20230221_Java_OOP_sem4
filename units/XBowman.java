// Арбалетчик
package units;

public class XBowman extends Archer {

    private String name;

    public XBowman(String name, int x, int y) {
        super(6, 3, 10, 4, 16, 2, 3, x, y);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        String output = String.format(
        "Арбалетчик %s: hp = %d, attack = %d, defence = %d, shoots = %d, minDamage = %d, maxDamage = %d, speed = %d",
                name, hp, attack, defence, shoots, minDamage, maxDamage, speed);
        return output;
    }

    @Override
    public String getInfo() {
        String info = String.format("Арбалетчик %s hp = %d speed = %d", name, hp, speed);
        return info;
    }

    
}
