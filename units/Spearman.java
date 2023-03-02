// Копейщик
package units;

public class Spearman extends Warrior {

    public Spearman(String name, int x, int y) {
        super(4, 5, 10, 4, 1, 3, x, y);
        this.name = name;
    }

    private String name;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String output = String.format(
                "Копейщик %s: hp = %d, attack = %d, defence = %d, minDamage = %d, maxDamage = %d, speed = %d",
                name, hp, attack, defence, minDamage, maxDamage, speed);
        return output;
    }

    @Override
    public String getInfo() {
        String info = String.format("Копейщик %s hp = %d speed = %d", name, hp, speed);
        return info;
    }


    
}
