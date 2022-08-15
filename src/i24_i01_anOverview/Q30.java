package i24_i01_anOverview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q30 {
        /*
        30---
        Kullanıcının gireceği iki binary sayıyı toplayan  Java kodunu yazınız.

        Test Data:
        birinci binary number: 100010
        ikinci  binary number: 110010

        Beklenen Çıktı:
        1010100
*/
        public static void main(String[] args) {
            long binary1, binary2;
            int i = 0, remainder = 0;
            int[] sum = new int[20];
            Scanner in = new Scanner(System.in);
            System.out.println("Lutfen toplamak istediginiz binary kodunu giriniz");
            binary1 = in.nextLong();
            System.out.println("Lutfen toplamak istediginiz binary kodunu giriniz");
            binary2 = in.nextLong();
            long temp1 = binary1;
            long temp2 = binary2;
            int basamakDegeri1 = 0;
            int basamakDegeri2 = 0;
            for (i = sum.length - 1; i > 0; i--) {
                basamakDegeri1 = (int) temp1 % 10;
                basamakDegeri2 = (int) temp2 % 10;
                sum[i] = sum[i] + basamakDegeri1 + basamakDegeri2;
                switch (sum[i]) {
                    case 0:
                        sum[i] = 0;
                        break;
                    case 1:
                        sum[i] = 1;
                        break;
                    case 2:
                        sum[i] = 0;
                        sum[i - 1] = 1;
                        break;
                    case 3:
                        sum[i] = 1;
                        sum[i - 1] = 1;
                        break;
                }
                temp1 /= 10;
                temp2 /= 10;
            }
            System.out.println("Binary sayilarin toplami = " + Arrays.toString(sum));
            for (i = 0; i < sum.length; i++) {
                remainder *= 10;
                remainder += sum[i];
            }
            System.out.println("Binary sayilarin toplami = " + remainder);

        }


























        /*
        String sayi1 = "100010";
        String sayi2 = "110010";
        int sayi3 = Integer.parseInt(sayi1) + Integer.parseInt(sayi2);
        String toplam = sayi3 + "";
        System.out.println(toplam);
        String arr[] = toplam.split("");
        List<String> liste = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            liste.add(arr[i]);
        }
        for (int i = liste.size() - 1; i > 0; i--) {
            if (liste.get(i).equals("2")) {    //1  0  1  0  1  0  0
                liste.set(i - 1, "");
                liste.set(i, "10");
            }
            if ((liste.get(0).equals("2"))) {
                liste.set(0, "10");
            }
        }
        for (int i = 0; i < liste.size(); i++) {
            System.out.print(liste.get(i));
        }
*/

    }





