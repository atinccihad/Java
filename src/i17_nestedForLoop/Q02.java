package i17_nestedForLoop;

public class Q02 {
    public static void main(String[] args) {
        /*
        A
        A B
        A B C
        A B C D
        A B C D E
        A B C D E F
        şeklini yazdırınız.  65=A'nın ascıı değeri
        */
        String isim = "ABCDEF";
        for (int i = 1; i <= isim.length(); i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(isim.substring(j - 1, j) + " ");
            }
            System.out.println(" ");
        }
        int asci = 65;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (asci + j) + " ");
            }
            System.out.println(" ");
        }
    }
}
