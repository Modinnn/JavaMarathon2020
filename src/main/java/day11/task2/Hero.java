package day11.task2;

public abstract class Hero implements PhysAttack {
    int health;
    int physAtt;
    double physDef;
    double magicDef;

    public Hero() {
        health = 100;
    }
    @Override
    public void physicalAttack(Hero hero) {
        hero.health -= (physAtt - (physAtt * hero.physDef/100));
        if (hero.health < 0) {
            hero.health = 0;
        }
        System.out.println(hero.toString());
    }
}
