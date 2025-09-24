public class Zadanie13 {

    public static void setArray(int size) {

        int[][] array = new int[size][size];

        for (int i = 0; i < size; i++) {
           array[i][i] = 1;
        }
        System.out.println();
        for (int line = 0; line < size; line++) {
            for (int column = 0; column < size; column++) {
                System.out.print(array[line][column] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int size = 7;
        setArray(size);
    }
}