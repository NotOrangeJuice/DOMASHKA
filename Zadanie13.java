public class Zadanie13 {

    public static void сделатьМассив(int размер) {
      
        int[][] массив = new int[размер][размер];
        
        for (int i = 0; i < размер; i++) {
                массив[i][i] = 1;
        }
             System.out.println();
        for (int строка = 0; строка < размер; строка++) {
            for (int столбец = 0; столбец < размер; столбец++) {
                System.out.print(массив[строка][столбец] + " ");
            }
            System.out.println(); 
        }
    }
    
    public static void main(String[] args) {
    
        int размер = 7;
            сделатьМассив(размер);
    }
}