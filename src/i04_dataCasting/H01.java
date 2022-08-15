package i04_dataCasting;

import java.util.Scanner;

public class H01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Soru 1) byte veri tipinde bir degisken olusturun,
        // short,int,float ve double data tiplerinde birer degisken olusturup
        // adim adim widening yapin ve yazdirin
        byte sayi1 = 12;
        short sayi2 = 122;
        int sayi3 = 555;
        float sayi4 = 23.56f;
        double sayi5 = 22222.4567;

        sayi2 = sayi1;
        System.out.println("sayi2 = " + sayi2); //widening
        sayi5 = sayi4;
        System.out.println("sayi5 = " + sayi5); //widening

        int sayi6 = 55555;
        sayi1 = (byte) sayi6;
        System.out.println("sayi1 = " + sayi1); //narrowing

        sayi2 = (short) sayi6;
        System.out.println("sayi2 = " + sayi2); //narrowing

        double sayi7 = 255.36;
        int sayi8 = (int) sayi7;
        System.out.println("sayi8 = " + sayi8); // double>integer
        byte sayi9 = (byte) sayi8;
        System.out.println("sayi9 = " + sayi9); // integer>byte

        int s1 = 9;
        int s2 = 11;
        System.out.println("s1/s2 = " + (s1 / s2)); //int/int

        int s3 = 85;
        double s4 = 22222.22222;
        System.out.println("s3/s4 = " + s3 / s4); // int/double

        System.out.println("ad soyad yas");
        String ad = scan.nextLine();
        String soyis = scan.nextLine();
        int yas = scan.nextInt();
        System.out.println(ad + " " + soyis + " " + yas);
    }
}
