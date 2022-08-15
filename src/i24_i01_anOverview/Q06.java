package i24_i01_anOverview;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        /*
        6----     Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
           değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
            1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)

           Sesli harfler: a,e,i,o,u

           Test Data:
           a

           Beklenen Çıktı:
           a harfi sesli harfdir.

           Test Data:
           d

           Beklenen Çıktı:
           d harfi sesiz harftir.

           Test Data:
           we  yada %

           Beklenen Çıktı:
           Yanlis karakter girdiniz!
         */
        Scanner scan=new Scanner(System.in);
        String harfler[]={"a","e","i","o","u","b","c","d","f","g","h","j","k","l","m","n","p","q","r","s","t","v","y","z","x","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","R","S","T","U","V","Y","Z","Q","W","X"};
        String sesliHarfler[]={"a","e","i","o","u","A","E","I","O","U"};
        String sessizHarfler[]={"b","c","d","f","g","h","j","k","l","m","n","p","q","r","s","t","v","y","z","x","B","C","D","F","G","H","J","K","L","M","N","P","R","S","T","V","Y","Z","Q","W","X"};
        System.out.println("Harf giriniz");
        String harfStr=scan.nextLine();

        if (harfStr.length()>1){
            System.out.println("Sorgu icin 1 karakter giriniz");
        }else {
            for (int i = 0; i < harfler.length ; i++) {
                if (harfStr.equals(harfler[i])){
                    System.out.println("Harf");
                    for (int j = 0; j < harfler.length ; j++) {
                        if (harfStr.equals(sesliHarfler[j])){
                            System.out.println("sesliHarf");
                        }
                        break;
                    }
                    for (int j = 0; j < harfler.length-1 ; j++) {
                        if (harfStr.equals(sessizHarfler[j])){
                            System.out.println("sessizHarf");
                        }
                        break;
                    }

                }
            }




        }
        /*
        if (sesliHarfler[i].contains(harfStr)){
                    System.out.println("Sesli");
                }else if (sessizHarfler[i].equals(harfStr)){
                    System.out.println("Sessiz");
                }else {
                    System.out.println("Yanlis");
                }
         */













    }
}
