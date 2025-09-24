public class Zadanie8 {
    public static void printNTime(String text, int count) {

        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }

    public static void main(String[] args) {

        printNTime("Привет", 3);

        printNTime("Privet", 7);

    }
}
