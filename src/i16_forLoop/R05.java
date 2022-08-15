package i16_forLoop;

public class R05 {
    public static void main(String[] args) {
        /*
        Yandaki elmas deseni görüntüsünü çizen java kodunu yazınız.                *
            Yarım elmas uzunluğu : 7                                              ***
                                                                                 *****
              Beklenen Çıktı:                                                   *******
                                                                               *********
                                                                              ***********
                                                                             *************
                                                                              ***********
                                                                               *********
                                                                                *******
                                                                                 *****
                                                                                  ***
                                                                                   *
         */
        for (int i = 0; i <= 7; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <5 ; j++) {

            }
            System.out.println("");
        }
    }

}
