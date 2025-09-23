public class Zadanie10 {
  public static void main(String[] args) {
        
               int[] числа = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        
        System.out.println();
        for (int i = 0; i < числа.length; i++) {
            System.out.print(числа[i] + " "); 
        }
        
                for (int i = 0; i < числа.length; i++) {
            if (числа[i] == 0) {  
                числа[i] = 1;  
            } else {          
                числа[i] = 0;  
            }
        }
        
               System.out.println();
        for (int i = 0; i < числа.length; i++) {
            System.out.print(числа[i] + " "); 
        }
    }
}
