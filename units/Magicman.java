// Колдун
package units;

public class Magicman extends Healer {

    private String name;

    public Magicman(String name, int x, int y) {
        super(17, 12, -5, 30, 9, 1, x, y);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        String output = String.format(
                "Колдун %s: hp = %d, attack = %d, defence = %d, damage = %d, speed = %d, magic = %d",
                name, hp, attack, defence, damage, speed, magic);
        return output;
    }

    @Override
    public String getInfo() {
        String info = String.format("Колдун %s hp = %d speed = %d", name, hp, speed);
        return info;
    }


}
