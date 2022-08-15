package i09_ternary_switchCase;

import java.util.Scanner;

public class R02 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir ad yazmasını isteyin,

        adının uzunluğu 3 olmalıdır.

        Ardından, adın aynı karakterlere sahip olup olmadığını kontrol edin.

        Dize aynı karakterlere sahipse

        Yazdır “Dize çift karakterler içeriyor” Aksi takdirde

        Yazdır “Dizenin benzersiz karakterleri var”

        Lütfen üçlü kullanın.

        Giriş :

        ala

        Çıktı:

        Dize yinelenen karakterler içeriyor
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir ad yaziniz");
        String name=scan.nextLine();


        switch (name.length()){
            case 3:
                if (name.charAt(1)!=name.charAt(2)&&name.charAt(0)!=name.charAt(1)){
                    System.out.println("Dizenin benzersiz karakterleri var");
                }else {
                    System.out.println("Dize çift karakterler içeriyor");
                }
                break;
            default:
                System.out.println("Lütfen üçlü kullanın.");
        }


    }
}
