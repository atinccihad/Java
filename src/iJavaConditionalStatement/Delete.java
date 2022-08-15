package iJavaConditionalStatement;

public class Delete {
    public static void main(String[] args) {

        int i;
        int j;
        int k;
        for (i = 0; i < 10; i++) { //satiri olusturmak icin
            for (j = i; j < 10; j++) {//sutunu olustumak icin
                System.out.print(" ");//bu satır olmazsa dik ucgen yapar..
            }
            for (k = 0; k < i; k++) {
                System.out.print("*");//istenen karakter
                System.out.print(" ");//yıldızların arasında bosluk icin
            }
            System.out.println(" ");//alt satıra geçmesi için
        }
        for (i = 11; i > 0; i--) {
            for (int l = 11; l > i; l--) {
                System.out.print(" ");
            }
            for (int l = i; l > 1; l--) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println(" ");
        }

    }
}
