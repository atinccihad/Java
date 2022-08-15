package i18_while_doWhileLoop;

public class R06 {
    public static void main(String[] args) {
        /*
        Print Alphabet on the console.

        OUTPUT : a b c .. .. .. .. y z
         */
        char krk = 'a';

        char lastKrk = 'z';
        while (krk <= lastKrk) {
            System.out.print(krk + " ");
            krk++;
        }

    }
}
