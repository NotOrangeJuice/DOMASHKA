public class Zadanie6 {
     public static void ProverkaZnaka(int number) {
        
        if (number >= 0) {
            System.out.println("Число " + number + " является положительным");
        } else {
            System.out.println("Число " + number + " является отрицательным");
        }
    }
    public static void main(String[] args) {
       ProverkaZnaka(-33); 
    }
}
