package day11.task2;

public class Magician extends Hero implements MagicAttack {

    int magicAtt;

    public Magician() {
        physDef = 0;
        magicDef = 80;
        physAtt = 5;
        magicAtt = 20;
    }

    @Override
    public void magicalAttack(Hero hero) {
        hero.health -= (magicAtt - (magicAtt * hero.magicDef/100));
        if (hero.health < 0) {
            hero.health = 0;
        }
        System.out.println(hero.toString());
    }

    @Override
    public String toString() {
        return "Magician{" +
                "health=" + health +
                '}';
    }
}
