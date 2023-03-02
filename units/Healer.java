package units;

public class Healer extends Man {

    protected int magic;

    public Healer(int attack, int defence, int damage, int hp, int speed, int magic, int x, int y) {
        super(attack, defence, damage, hp, speed, x, y);
        this.magic = magic;
    }

    public int getMagic() {
        return magic;
    }

    @Override
    public String getInfo() {
        return "";
    }


    
}
