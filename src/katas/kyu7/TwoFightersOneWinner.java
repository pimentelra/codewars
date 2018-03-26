package katas.kyu7;

public class TwoFightersOneWinner {
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        if ((fighter1.health + fighter2.damagePerAttack - 1) / fighter2.damagePerAttack == (fighter2.health + fighter1.damagePerAttack - 1) / fighter1.damagePerAttack) return firstAttacker;
        return (fighter1.health + fighter2.damagePerAttack - 1) / fighter2.damagePerAttack > (fighter2.health + fighter1.damagePerAttack - 1) / fighter1.damagePerAttack ? fighter1.name : fighter2.name;
    }
}
