package Day_06_ForLoop;

import java.util.Scanner;

public class Q_06 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		 /*  Problem Tanýmý
	       2 boyutlu bir tablo olarak, ekrana çarpým tablosunu hesaplayýp yazan kodu yazýnýz.
	       Örnek Ekran çýktýsý
	       1  2  3  4  5
	       2  4  6  8 10
	       3  6  9 12 15
	       4  8 12 16 20
	       5 10 15 20 25
	       Ekran çýktýsý 5 x 5 boyutlarý için örnek olarak verilmiþtir,
	       isterseniz boyutlarý klavyeden okuyup istenen boyutlara göre
	       ekrana basan bir kod yazabilirsiniz.
	    */
		
		
	        Scanner scan = new Scanner(System.in);
	        System.out.print("pozitif bir tam sayý giriniz : ");
	        int sayi = scan.nextInt();

	        for (int satir = 1; satir <=sayi; satir++) {//satýr kontrolu
	            for (int sutun = 1; sutun <=sayi; sutun++) {//sutun kontrolu
	                System.out.print(" "+(satir*sutun));
	            }
	            System.out.println();//2 boyutlu for da iç ve dýþ döngü arasýna satýr atlamasý için boþ println koyulur
	        }
		
		
		
	}

}
