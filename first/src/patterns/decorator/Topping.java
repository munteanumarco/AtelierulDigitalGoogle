package first.src.patterns.decorator;

public abstract class Topping extends Bevarage  {
    private Bevarage bevarage;

    public Topping(Bevarage bevarage, String description, int cost) {
        super(description, cost);
        this.bevarage = bevarage;
    }

    @Override
    public String getDescription() {
        return bevarage.getDescription() + " " + super.getDescription();
    }

    @Override
    public int getCost() {
        return  bevarage.getCost() + super.getCost();
    }
}
