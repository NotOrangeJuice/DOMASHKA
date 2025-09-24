public class Zadanie14 {

    public static int[] setArray(int len, int initialValue) {

        int[] array = new int[len];

        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }

        return array;
    }

    public static void main(String[] args) {

        int len = 16;
        int initialValue = 13;

        int[] finalArray = setArray(len, initialValue);

        System.out.println();
        for (int i = 0; i < finalArray.length; i++) {
            System.out.print(finalArray[i] + " ");
        }
    }
}
