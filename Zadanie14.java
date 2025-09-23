public class Zadanie14 {
 
    public static int[] создатьМассив(int len, int initialValue) {
        
        int[] массив = new int[len];
       
        for (int i = 0; i < len; i++) {
            массив[i] = initialValue;
        }
       
        return массив;
    }
  
    public static void main(String[] args) {
       
        int len = 16;  
        int initialValue = 13; 
        
            int[] готовыйМассив = создатьМассив(len, initialValue);
        
       
        System.out.println();
        for (int i = 0; i < готовыйМассив.length; i++) {
            System.out.print(готовыйМассив[i] + " ");
        }
    }
}
