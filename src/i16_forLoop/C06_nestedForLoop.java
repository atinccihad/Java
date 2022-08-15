package i16_forLoop;

public class C06_nestedForLoop {
    /*
    Bazen tek degisken sorunu cozmeye yetmez
    *
    * *
    * * *
    * * * *
    * * * * *
    * * * * * *
    * * * * * * *
     */
    public static void main(String[] args) {
        // yan yana 3 tane * yazin
        for (int i = 1; i <= 3; i++) {
            System.out.print("*");
        }

        System.out.println("");
        // yan yana 4 tane * yazin
        for (int i = 1; i <= 4; i++) {
            System.out.print("*");
        }

        // Bu tur durumlarda nestedLoop kullanmak gerekir
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
