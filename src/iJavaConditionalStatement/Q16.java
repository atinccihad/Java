package iJavaConditionalStatement;

public class Q16 {
    public static void main(String[] args) {
/*
      Java'da, arka arkaya bir sayıyı tekrarlayacak bir sayı ile
      dik açılı üçgen gibi bir desen yapmak için
      bir program yazın.Desen aşağıdaki gibidir :

      1
      22
      333
      4444
 */
        int num = 4;
        for (int i = 0; i <= num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
