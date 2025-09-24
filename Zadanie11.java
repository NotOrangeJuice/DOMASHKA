public class Zadanie11 {

    public static void setArray(int[] numbers) {
        for (int i = 1; i <= 100; i++) {
            numbers[i - 1] = i;
        }
    }

    public static void main(String[] args) {
        int[] numbers = new int[100];

        setArray(numbers);

        System.out.println("Вот что получилось:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}