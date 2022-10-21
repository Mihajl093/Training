import static Lesson5.Calculator.isPrime;

public class Main {
    public static void main(String[] args) {
        int n = 12;
        if (isPrime(n, 2)) {
            System.out.println("Yes it's a Prime");
        } else {
            System.out.println("Not a Prime");
        }
    }
    }