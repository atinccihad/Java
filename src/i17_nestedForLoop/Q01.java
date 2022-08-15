package i17_nestedForLoop;

public class Q01 {
    public static void main(String[] args) {
         /*
        A
        B B
        C C C
        D D D D
        E E E E E
        F F F F F F
        şekli yazdırınız
        */
        String isim = "ABCDEF";
        for (int i = 0; i <= isim.length(); i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(isim.substring(i - 1, i));
                System.out.print(" ");
            }
            System.out.println(" ");
        }
        int asci = 65;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j <= i; j++) {
                // System.out.print((char)(asci+i)+" ");
                System.out.print((char) (asci) + " ");
                asci++;
            }
            ;
            System.out.println(" ");
        }
    }
}
