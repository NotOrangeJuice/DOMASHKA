public class Zadanie9 {
    public static boolean leap(int year) {
        return (year % 400 == 0) ||
                ((year % 4 == 0) && (year % 100 != 0));
    }

    public static void main(String[] args) {
        System.out.println(leap(1978));
        System.out.println(leap(400));
        System.out.println(leap(100));

    }
}