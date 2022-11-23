package oo.ch1;

public class BoxingMatch {
    private Fighter f1;
    private Fighter f2;

    public BoxingMatch(Fighter f1, Fighter f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    public String fight() {
        while(true) {
            f1.attack(f2);
            if (f2.getHealth() < 0) {
                return f1.getName() + " won the match !";
            }
            f2.attack(f1);
            if (f1.getHealth() < 0) {
                return f2.getName() + " won the match !";
            }
        }
    }
}
