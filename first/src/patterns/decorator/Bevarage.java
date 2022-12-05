package first.src.patterns.decorator;

public abstract class Bevarage {
    private String description;
    private int cost;

    public Bevarage(String description, int cost) {
        this.description = description;
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public int getCost() {
        return cost;
    }

}
