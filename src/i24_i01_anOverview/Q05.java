package i24_i01_anOverview;

public class Q05 {
    public static void main(String[] args) {
        /*
        5-----Aşağıdaki elmas deseni görüntüsünü çizen java kodunu yazınız.
    Test Data:
    Yarım elmas uzunluğu : 7
    Beklenen Çıktı:
          *
         ***
        *****
       *******
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

        for (int i = 1; i < 14; i += 2) {
            for (int j = i + 1; j < 14; j += 2) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i = 1; i < 12; i += 2) {
            for (int j = 0; j < i; j += 2) {
                System.out.print(" ");
            }
            for (int j = i; j < 12; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }


    }
}
