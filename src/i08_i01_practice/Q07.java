package i08_i01_practice;

import java.util.Scanner;

public class Q07 {
    /*
      galonu litreye ceviren bir java programi yaziniz
          1 gallon = 3.785 litre
      litreyi galona ceviren bir java programi yaziniz
          1 litre = 1/3.785 gallon
      // Sıcaklığı Fahrenhayt'tan Santigrat derecesine çeviren bir Java programı yazın.
      // formül
      // c = (f-32)*5/9
   */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double galonDegeri = 3.785;
        System.out.println("galonu litreye cevirmek icin miktar giriniz");
        double galon = scan.nextDouble();
        System.out.println("Girdiginiz galonun litre degeri=> " + galon * galonDegeri);

        System.out.println("litreyi galona cevirmek icin miktar giriniz");
        double litre = scan.nextInt();
        System.out.println("Girdiginiz litre miktarinin galon karsiligi=> " + (litre / galonDegeri));

        System.out.println("Santigrat'a cevrilmek uzere Fahrenayt deger giriniz");
        double f = scan.nextDouble();
        System.out.println("Girdiginiz Fahrenayt degerin Santigrat karsiligi=> " + (f - 32) * 5 / 9 + " F");
    }
}
