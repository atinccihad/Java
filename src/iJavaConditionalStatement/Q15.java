package iJavaConditionalStatement;


public class Q15 {
    public static void main(String[] args) {
        /*
        Deseni bir sayı ile dik açılı üçgen gibi görüntülemek için Java'da bir program yazın.

        Test Verileri
        satır sayısı: 10
        Beklenen Çıktı :

        1
        12
        123
        1234
        12345
        123456
        1234567
        12345678
        123456789
        12345678910
         */
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
