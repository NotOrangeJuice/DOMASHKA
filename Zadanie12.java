public class Zadanie12 {
  public static void Массив(int[] числа) { 
        for (int i = 0; i < числа.length; i++) {
            if (числа[i] < 6) {
                  числа[i] = числа[i] * 2;
            }
        }
    }
 
    public static void main(String[] args) {
        int[] числа = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
 
        System.out.println("Были такие числа:");
        for (int i = 0; i < числа.length; i++) {
            System.out.print(числа[i] + " ");
        }
 
            Массив(числа);
 
             System.out.println("\nстали такие:");
        for (int i = 0; i < числа.length; i++) {
            System.out.print(числа[i] + " ");
        }
    }
}