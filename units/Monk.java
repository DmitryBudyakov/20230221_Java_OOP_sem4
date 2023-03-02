// Монах
package units;

public class Monk extends Healer {

    private String name;

    public Monk(String name, int x, int y) {
        super(12, 7, -4, 30, 5, 1, x, y);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        String output = String.format(
                "Монах %s: hp = %d, attack = %d, defence = %d, damage = %d, speed = %d, magic = %d",
                name, hp, attack, defence, damage, speed, magic);
        return output;
    }

    @Override
    public String getInfo() {
        String info = String.format("Монах %s hp = %d speed = %d", name, hp, speed);
        return info;
    }


}
