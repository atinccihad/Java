package Day_04_SwitchCase;

import java.util.Scanner;

public class Q_04 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// Bugüne göre 100 gün sonra hangi gün olduðunuz yazdýrýnýz.
        // pazartesi
        Scanner scan = new Scanner(System.in);
       /* int kacGunSonra=scan.nextInt();
        int gunSayisi=scan.nextInt();
        System.out.println("gun giriniz");
        gunSayisi=(gunSayisi+kacGunSonra)%7;
        
        switch(gunSayisi) {
        case 1:   System.out.println("Pazartesi");
        break;
        case 2:   System.out.println("sali");
        break;
        case 3:   System.out.println("carsamba");
        break;
        case 4:   System.out.println("Persembe");
        break;
        case 5:   System.out.println("Cuma");
        break;
        case 6:   System.out.println("Cumartesi");
        break;
        case 7:   System.out.println("Pazar");
        break;
        default:
        }
*/
		 System.out.print(
	                "Pazartesi: 1 \nSalý: 2 \nÇarþamba: 3 \nPerþembe: 4 \nCuma: 5 \nCumartesi: 6 \nPazar: 7 \nLütfen haftanýn kaçýncý gününde olduðunuzu yazýn: ");
	        int kancýncýGun = scan.nextInt();
	        System.out.println("Lütfen kaç gün sonrasýný merak ettiðinizi yazýn :");
	        int kacGun = scan.nextInt();
	        int hangiGün = (kacGun % 7 + kancýncýGun) % 7;
	        if (kancýncýGun <= 7 && kancýncýGun > 0) {
	            if (kacGun > 0) {
	                switch (hangiGün) {
	                    case 1: {
	                        System.out.println(kacGun + " gün sonra günlerden Pazartesi.");
	                        break;
	                    }
	                    case 2: {
	                        System.out.println(kacGun + " gün sonra günlerden Salý.");
	                        break;
	                    }
	                    case 3: {
	                        System.out.println(kacGun + " gün sonra günlerden Çarþamba.");
	                        break;
	                    }
	                    case 4: {
	                        System.out.println(kacGun + " gün sonra günlerden Perþembe.");
	                        break;
	                    }
	                    case 5: {
	                        System.out.println(kacGun + " gün sonra günlerden Cuma.");
	                        break;
	                    }
	                    case 6: {
	                        System.out.println(kacGun + " gün sonra günlerden Cumartesi.");
	                        break;
	                    }
	                    case 7: {
	                        System.out.println(kacGun + " gün sonra günlerden Pazar.");
	                        break;
	                    }
	                }
	            } else {
	                System.out.println("Geçmiþ geçmiþte kaldý :)");
	            }
	        } else {
	            System.out.println("Hafta 7 gün dostum!");
	        }
	}

}
