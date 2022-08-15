package i16_forLoop;

import java.util.Scanner;

public class R01 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir isim ve bir karakter girmesini isteyin, ardından döngüleri kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.

        char ch1= 'a' ;

    		String name =“John came late"

    		Expected Output:


        Number of a = 2
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir isim giriniz, ardindan bir karakter giriniz");
        String isim=scan.nextLine();
        char krk=scan.next().charAt(0);
        int count=0;

        for (int i = 0; i < isim.length(); i++) {
            if (isim.charAt(i)==(krk)){
                count++;
            }
        }
        System.out.println("Number of "+krk+" = "+count);



    }
}
