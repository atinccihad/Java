package iJavaHomework;

import java.util.Scanner;

public class H14 {
    public static void main(String[] args) {
        /*
         *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
         *
        BMI = kilo(kg) /(boy*boy)(cm)
        BMI <=20 oldukca zayifsiniz
        20<BMI<=25 Normal sinirlardasiniz
        25<BMI<=30 Sisman kategorisindesiniz
        30<BMI ==> Obez grubundasiniz.

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("VKE hesaplamasi icin once boyunuzu cm olarak ardindan kilonuzu kg olarak giriniz");
        double boy = scan.nextDouble();
        double kilo = scan.nextDouble();
        double BMI = kilo / (boy * boy);

        if (BMI <= 20) {
            System.out.println("oldukca zayifsiniz");
        } else if (BMI <= 25) {
            System.out.println("Normal sinirlardasiniz");
        } else if (BMI <= 30) {
            System.out.println("Sisman kategorisindesiniz");
        } else {
            System.out.println("Obez grubundasiniz.");
        }

    }
}
