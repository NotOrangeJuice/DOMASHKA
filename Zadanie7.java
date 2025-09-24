public class Zadanie7 {
   public static boolean checkSign(int number) {

      return number < 0;
   }

   public static void main(String[] args) {
      System.out.println(checkSign(-5));
      System.out.println(checkSign(0));
      System.out.println(checkSign(13));
   }
}