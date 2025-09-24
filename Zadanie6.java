public class Zadanie6 {
    public static void checkSign(int number) {

        System.out.println(number < 0 ? "Число отрицательное" : "Число положительное");
    }

    public static void main(String[] args) {
        checkSign(-7);
        checkSign(0);
    }
}
