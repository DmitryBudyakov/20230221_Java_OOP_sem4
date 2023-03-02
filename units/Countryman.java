// Крестьянин
package units;

public class Countryman extends Man {

    private String name;
    private int delivery;

    public Countryman(String name, int x, int y) {
        super(1, 1, 1, 1, 3, x, y);
        this.name = name;
        this.delivery = 1;
    }

    public String getName() {
        return name;
    }

    public int getDelivery() {
        return delivery;
    }

    @Override
    public String toString() {
        String output = String.format("Крестьянин %s: hp = %d, attack = %d, defence = %d, damage = %d, speed = %d, delivery = %d",
                                        name, hp, attack, defence, damage, speed, delivery);
        return output;
    }

    @Override
    public String getInfo() {
        String info = String.format("Крестьянин %s hp = %d speed = %d", name, hp, speed);
        return info;
    }



    

    


}
