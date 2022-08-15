package i21_i15_practice;

public class Q10 {
    public static void main(String[] args) {
        // 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.
        char krk = 'a';
        for (krk = 0; krk <= 255; krk++) {
            System.out.println(krk + " ");
        }
        /*********************************************************************************************/
        System.out.println("while ile");
        int i = 0;
        while (i <= 255) {
            char sembol = (char) i;
            System.out.println(i + "-" + sembol);
            i++;
        }
        /*********************************************************************************************/
        System.out.println("do while");
        int j = 0;
        do {
            char karakter = (char) j;
            System.out.println(j + " " + karakter);
            j++;
        } while (j <= 255);
    }
}
