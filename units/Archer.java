package units;

import java.util.ArrayList;

/**
 * Archer
 */
public class Archer extends Man {

    protected int shoots;
    protected int minDamage;
    protected int maxDamage;

    public Archer(int attack, int defence, int hp, int speed, int shoots, int minDamage,
            int maxDamage, int x, int y) {
        super(attack, defence, hp, speed, x, y);
        this.shoots = shoots;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
    }

    // Реализовать метод step() лучников.
    // 3.1 Если жизнь равна нулю или стрел нет, завершить обработку.
    // 3.2 Поиск среди противников наиболее приближённого.
    // 3.3 Нанести среднее повреждение найденному противнику.
    // 3.4 Найти среди своих крестьянина.
    // 3.5 Если найден завершить метод иначе уменьшить запас стрел на одну.
    @Override
    public void step(ArrayList<Man> team1, ArrayList<Man> team2) {
        if (state.equals("Die") || shoots == 0)
            return;
        Man victim = team2.get(findNearest(team2));
        float damage = (victim.defence - attack) > 0 ? minDamage
                : (victim.defence - attack) < 0 ? maxDamage : (minDamage + maxDamage) / 2;
        victim.getDamage(damage);
        for (Man man : team1) {
            if (man.getInfo().split(" ")[0].equals("Крестьянин") && man.state.equals("Stand")) {
                man.state = "Busy";
                return;
            }
        }
        shoots--;

    }

    public int getShoots() {
        return shoots;
    }

    public int getMinDamage() {
        return minDamage;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    @Override
    public String getInfo() {
        return "";
    }

}