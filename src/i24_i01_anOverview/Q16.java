package i24_i01_anOverview;

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        /*
        16----
        Girilen stringdeki tüm karakterleri büyük harfe dönüştürmek için bir Java programı yazın.
    
        Test Data:
        java is fun
    
        Beklenen Çıktı:
        JAVA IS FUN
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Buyuk harfe donusturulmesini istediginiz String yapiyi giriniz");
        String str=scan.nextLine().toUpperCase();

        System.out.println(str);
        
        
        
        
    }
}
