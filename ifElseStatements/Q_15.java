package Day_03_IfElseStatements;

import java.util.Scanner;

public class Q_15 {

	public static void main(String[] args) {
		
		/*  Problem Tan�m�
        Kullan�c�dan �� adet say� alarak bu say�lar�n
        bir dik ��genin kenar uzunluklar� olup olmad���n� hesaplatan bir kod yaz�n�z
        (Yard�m: Bir ��genin dik oldu�unu anlamak i�in a2+b2=c2 pisagor
        ba�lant�s�ndan yararlanabilirsiniz)
        �rnek Ekran ��kt�s�
        birinci kenar� giriniz: 2
        ikinci kenar� giriniz 15
        ���nc� kenar� giriniz: 7
        Bu bir dik ��gen de�ildir.
        Bu bir dik ��gendir
     */
		
		
		Scanner scan = new Scanner(System.in);
	        System.out.print("birinci kenar uzunlugunu giriniz : ");
            int  kenar1=scan.nextInt();   
            System.out.print("ikinci kenar uzunlugunu giriniz : ");
            int  kenar2=scan.nextInt();   
            System.out.print("ucuncu kenar uzunlugunu giriniz : ");
            int  kenar3=scan.nextInt();   
            
            if (kenar1*kenar1+kenar2*kenar2==kenar3*kenar3||kenar1*kenar1==kenar2*kenar2+kenar3*kenar3||kenar1*kenar1+kenar3*kenar3==kenar2*kenar2) {
				System.out.println("Bu bir dik ��gendir");
			} else {
				System.out.println("Bu bir dik ��gen degildir");
			}
            scan.close();
	}

}
