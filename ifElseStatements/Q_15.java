package Day_03_IfElseStatements;

import java.util.Scanner;

public class Q_15 {

	public static void main(String[] args) {
		
		/*  Problem Tanýmý
        Kullanýcýdan üç adet sayý alarak bu sayýlarýn
        bir dik üçgenin kenar uzunluklarý olup olmadýðýný hesaplatan bir kod yazýnýz
        (Yardým: Bir üçgenin dik olduðunu anlamak için a2+b2=c2 pisagor
        baðlantýsýndan yararlanabilirsiniz)
        Örnek Ekran Çýktýsý
        birinci kenarý giriniz: 2
        ikinci kenarý giriniz 15
        üçüncü kenarý giriniz: 7
        Bu bir dik üçgen deðildir.
        Bu bir dik üçgendir
     */
		
		
		Scanner scan = new Scanner(System.in);
	        System.out.print("birinci kenar uzunlugunu giriniz : ");
            int  kenar1=scan.nextInt();   
            System.out.print("ikinci kenar uzunlugunu giriniz : ");
            int  kenar2=scan.nextInt();   
            System.out.print("ucuncu kenar uzunlugunu giriniz : ");
            int  kenar3=scan.nextInt();   
            
            if (kenar1*kenar1+kenar2*kenar2==kenar3*kenar3||kenar1*kenar1==kenar2*kenar2+kenar3*kenar3||kenar1*kenar1+kenar3*kenar3==kenar2*kenar2) {
				System.out.println("Bu bir dik üçgendir");
			} else {
				System.out.println("Bu bir dik üçgen degildir");
			}
            scan.close();
	}

}
