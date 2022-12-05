package first.src.patterns.decorator;

public class Main {

    public static void main(String[] args) {
        Bevarage coffee = new Coffee();
        Topping toppingChocolate = new Chocolate(coffee);
        Topping toppingMilk = new Milk(toppingChocolate);
        Bevarage milkChocolate = toppingMilk;
        System.out.println(milkChocolate.getDescription());
    }
}
