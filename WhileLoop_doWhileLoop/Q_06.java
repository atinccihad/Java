package Day_07_While_DoWhile;

import java.util.Scanner;

public class Q_06 {
	static int bolum=0;

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru 
				//kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz.
				Scanner scan = new Scanner(System.in);
				System.out.print("bolunecek sayiyi giriniz  : ");
                int bolunen=scan.nextInt();
                
                System.out.print("bolen sayiyi giriniz  : ");
                int bolen=scan.nextInt();
				
	
                System.out.println("sonuc: "+ bol(bolunen,bolen));
              
	
		
	}

	public static int bol(int bolunen,int bolen) {
		while(bolunen>=bolen) {
			bolunen-=bolen;
			bolum++;
		}
		
		
		
		
		return bolum;
	}
		
		


}
