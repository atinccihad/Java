package Day_03_IfElseStatements;

import java.util.Scanner;

public class Q_13 {

	public static void main(String[] args) {
		/*
        Kulanýcýdan aracýnýn hýzýný alýnýz
        Trafik cezasýnýn deðerini hesaplayýn.
            45 hýz sýnýrýdýr.
            Eðer hýzýnýz 55-74 arasýnda ise:
            Ceza 100 $'dýr.
            Eðer hýzýnýz 75 - 84 arasýnda ise:
            Ceza 150 $'dýr.
            Eðer hýzýnýz 85 -94 arasýnda ise:
            Ceza 320 $'dýr.
            Eðer hýzýnýz 94'den daha fazla ise:
            Ceza 500 $'dýr.
            ve ayrýca,
            Eðer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.
            Örn: Hýzýnýz 77 iken cezanýz 150$'dýr ama ehliyetiniz yoksa ceza 350 $ olur.
-----------------------------------------
            Örn;
            currentSpeed(Hýzýnýz) 87
            ve isDriverLicenceAvailable(Ehliyeti var mý?) = true;
            sonuç 320 olmalýdýr.
            currentSpeed(Hýzýnýz) 65
            ve isDriverLicenceAvailable(Ehliyeti var mý?) = false;
            sonuç 300 olmalýdýr.
     */

        Scanner scan = new Scanner(System.in);
        System.out.print("Ehliyetiniz var ise 1 , yoksa 0 yazýnýz : ");
        int ehliyet=scan.nextInt();
        System.out.println("aracin hizini giriniz");
        int hiz=scan.nextInt();

        if (ehliyet==1) {
			if (hiz<0) {
				System.out.println("hatali giris yaptiniz hiz 0  dan az olmaz");
			} else if (hiz>55&&hiz<=74) {
				System.out.println(" Ceza 100 $'dýr.");
			} else if (hiz>=75&&hiz<=84) {
				System.out.println("Ceza 150 $'dýr.");
			} else if (hiz>=85&&hiz<=94) {
				System.out.println("Ceza 320 $'dýr.");
			} else if (hiz>94) {
				System.out.println("Ceza 500 $'dýr.");
			}
		} else if (ehliyet==0) {
			 if (hiz>55&&hiz<=74) {
				System.out.println(" Ceza 300 $'dýr.");
			} else if (hiz>=75&&hiz<=84) {
				System.out.println("Ceza 350 $'dýr.");
			} else if (hiz>=85&&hiz<=94) {
				System.out.println("Ceza 520 $'dýr.");
			} else if (hiz>94) {
				System.out.println("Ceza 700 $'dýr.");
			}
		} else {
		}
        scan.close();
	}

}
