package oo.ch1;

public class Fighter {
    public String getName() {
        return name;
    }

    private String name;
    private int health;
    private int damagePerAttack;

    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    public void attack(Fighter opponent) {
        opponent.health -= this.damagePerAttack;
    }

    public int getHealth() {
        return health;
    }
}
