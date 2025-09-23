public class Zadanie7 {
        public static boolean check(int number) {
               if (number < 0) {
            return true;
        }
               return false;
    }
    
 
    public static void main(String[] args) {
              System.out.println(check(-5));  // Должно вывести true
        System.out.println(check(1110));  // Должно вывести false
        System.out.println(check(0));   // Должно вывести false
       
     }
}
