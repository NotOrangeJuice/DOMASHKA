public class Zadanie11 {
     
public static void ЗадатьМассив(int[] числа) {
            for (int i = 1; i <= 100; i++) {
            числа[i - 1] = i;
        }
    }
    
   
    public static void main(String[] args) {
        int[] числа = new int[100];
        
            ЗадатьМассив(числа);
        
            System.out.println("Вот что получилось:");
        for (int i = 0; i < числа.length; i++) {
            System.out.print(числа[i] + " "); 
        }
    }
}