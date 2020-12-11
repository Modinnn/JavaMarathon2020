package day11.task2;

public class Paladin extends Hero implements Healer {
    private int healSelf;
    private int healTeam;

    public Paladin() {
        physDef = 50;
        magicDef = 20;
        physAtt = 15;
        healSelf = 25;
        healTeam = 10;
    }

    @Override
    public void healHimself() {
        health += healSelf;
        if (health > 100) {
            health = 100;
        }
        System.out.println(toString());
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.health += healTeam;
        if (hero.health > 100) {
            hero.health = 100;
        }
        System.out.println(hero.toString());
    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
    }
}
