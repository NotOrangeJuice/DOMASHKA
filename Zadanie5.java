public class Zadanie5 {

    public static boolean interval(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void main(String[] args) {

        System.out.println(interval(5, 61));
        System.out.println(interval(10, 0));
        System.out.println(interval(5, 15));

    }
}