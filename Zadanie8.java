public class Zadanie8 {
     public static void ОтпечататьУказанноеКоличествоРаз(String Text, int Skolko) {

              for (int i = 0; i < Skolko; i++) 
              {
            System.out.println(Text);
        }
    }
    
     public static void main(String[] args) {
       
                     ОтпечататьУказанноеКоличествоРаз("Привет", 3);

                  ОтпечататьУказанноеКоличествоРаз("Privet", 12);
         
    }
}
