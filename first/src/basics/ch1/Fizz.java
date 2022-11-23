package basics.ch1;

public class Fizz {
    public static void main() {
        for (int i = 1; i <= 100; i++) {
            int ok = 0;
            if (i % 3 == 0) {
                System.out.print("Fizz");
                ok = 1;
            }
            if (i % 5 == 0) {
                System.out.print("Buzz");
                ok = 1;
            }
            if (ok == 0) {
                System.out.println(i);
            }
        }
    }
}
