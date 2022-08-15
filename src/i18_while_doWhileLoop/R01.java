package i18_while_doWhileLoop;

import java.util.Scanner;

public class R01 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir ad ve karakter girmesini isteyin,
        ardından addaki döngüleri kullanarak karakterin adda kaç kez tekrarlandığını kontrol edin

        e.g:

        char ch1= 'e' ;

        String name =“John geç geldi"

        Beklenen Çıktı: e sayısı = 2
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir isim giriniz");
        String isim=scan.nextLine();
        System.out.println("Girilen isimde varligini sorgulamak icin harf giriniz");
        char krk=scan.next().charAt(0);
        int harfSayisi=0;


        int i = 0;
        while (i < isim.length()) {


            if (isim.charAt(i)==krk){
                harfSayisi++;}
            i++;
        }
        System.out.println("Girilen "+isim+" isminde "+krk+" harfi "+harfSayisi+" adet kullanilmistir.");



    }
}
