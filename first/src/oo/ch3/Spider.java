package oo.ch3;

public class Spider extends Animal {
    public Spider() {
        super(8);
    }

    @Override
    void eat() {
        System.out.println("I eat bugs");
    }
}
