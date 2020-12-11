package day11.task2;

public class Shaman extends Hero implements Healer {

    int magicAtt;
    int healSelf;
    int healTeam;

    public Shaman() {
        physDef = 20;
        magicDef = 20;
        physAtt = 10;
        magicAtt = 15;
        healSelf = 50;
        healTeam = 30;
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
        return "Shaman{" +
                "health=" + health +
                '}';
    }
}
