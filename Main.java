import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import units.Countryman;
import units.Magicman;
import units.Man;
import units.Monk;
import units.Names;
import units.Robber;
import units.Sniper;
import units.Spearman;
import units.XBowman;

/**
 * Main
 */
public class Main {

    public static final int N = 10; // количество персонажей в каждой команде

    public static void main(String[] args) {

        ArrayList<Man> darks = new ArrayList<>();
        ArrayList<Man> lights = new ArrayList<>();

        darks = createTeam(0, 1); // создание команды 1
        lights = createTeam(1, 10); // создание команды 2

        // System.out.println("Команда Темные:\n" + "--------------");
        // darks.forEach(e -> System.out.println(e.getInfo()));
        // System.out.println();
        // System.out.println("Команда Светлые:\n" + "---------------");
        // lights.forEach(e -> System.out.println(e.getInfo()));

        ArrayList<Man> list = new ArrayList<>();

        // добавление команд в общий список
        for (Man man : lights) {
            list.add(man);
        }
        for (Man man : darks) {
            list.add(man);
        }

        // сортировка полного списка - вар.1
        // list.sort(new Comparator<Man>() {

        // @Override
        // public int compare(Man o1, Man o2) {
        // if (o2.getSpeed() == o1.getSpeed()) {
        // return o2.getHp() - o1.getHp();
        // }
        // return o2.getSpeed() - o1.getSpeed();
        // }
        // });

        // сортировка полного списка - вар.2 - через compateTo в классе Man
        Collections.sort(list);

        // вывод отсортированного общего списка
        // System.out.println("\nОбщий список после сортировки:");
        // for (Man man : list) {
        // System.out.println(man.getInfo());
        // }
        
        for (Man man : list) {
            if (lights.contains(man)) man.step(lights, darks);
            else man.step(darks, lights);
        }
    }

    /**
     * Выбор случайного имени из класса enum Names
     * 
     * @return
     */
    private static String getName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length - 1)]);
    }

    /**
     * @param teamKind - тип персонажей в команде
     *                 0 - крестьянин, разбойник, снайпер и колдун
     *                 1 - крестьянин, копейщик, арбалетчик, монах
     * @return
     */
    private static ArrayList<Man> createTeam(int teamKind, int posY) {
        ArrayList<Man> team = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            if (teamKind == 0) {
                switch (new Random().nextInt(4)) {
                    case 0:
                        team.add(new Countryman(getName(), i + 1, posY));
                        break;
                    case 1:
                        team.add(new Magicman(getName(), i + 1, posY));
                        break;
                    case 2:
                        team.add(new Robber(getName(), i + 1, posY));
                        break;
                    case 3:
                        team.add(new Sniper(getName(), i + 1, posY));
                        break;
                }
            } else if (teamKind == 1) {
                switch (new Random().nextInt(4)) {
                    case 0:
                        team.add(new Countryman(getName(), i + 1, posY));
                        break;
                    case 1:
                        team.add(new Monk(getName(), i + 1, posY));
                        break;
                    case 2:
                        team.add(new Spearman(getName(), i + 1, posY));
                        break;
                    case 3:
                        team.add(new XBowman(getName(), i + 1, posY));
                        break;
                }
            }
        }
        return team;
    }

}