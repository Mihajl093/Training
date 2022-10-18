package part2;

public class Part2 {
    public static void main(String[] args) {
        var day = Days.Fri;

        switch (day) {
            case Mon -> System.out.println("Monday");
            case Tue -> System.out.println("Tuesday");
            case Wed -> System.out.println("Wednesday");
            case Thur -> System.out.println("Thursday");
            case Fri -> System.out.println("Friday");
            case Sat, Sun -> System.out.println("Weekend");
            default -> System.out.println(0);
        }
    }
}
