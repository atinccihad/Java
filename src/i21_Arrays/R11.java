package i21_Arrays;

import java.util.Scanner;

public class R11 {
    public static void main(String[] args) {
        /*
        Kullanıcının gireceği iki binary sayıyı toplayan Java kodunu yazınız.

        Test Data:
        birinci binary number: 100010
        ikinci  binary number: 110010
        Beklenen Çıktı:
        1010100
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("1. binary sayiyi giriniz");
        int binary1=scan.nextInt();
        System.out.println("2. binary sayiyi giriniz");
        int binary2=scan.nextInt();

        Integer newBinary=binary1+binary2;
        String strBinary="";
        while (newBinary>0){
            strBinary+=newBinary%2;
            newBinary/=2;
        }
        System.out.println(strBinary);
    }


}
