package Day_06_ForLoop;

import java.util.Scanner;

public class Q_03 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		 /*
        Girilen bir stringdeki a harfi say�s�n� bulunuz.
        ama  c harfine  gelirse d�ng�den ��k�ls�n
        Bug�n hava oldukca g�zel.-> 2
         str.CharAt(0)
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("bir String giriniz");
        String str=scan.nextLine();
        
        int aMiktar=0;
        for (int i = 0; i < str.length(); i++) {
			if (str.toLowerCase().charAt(i)=='a') {
				aMiktar++;
			} else if (str.toLowerCase().charAt(i)=='c') {
				break;
			}
		} 
		System.out.println("girdiginiz metinde c karakterine kadar olan a sayisi "+aMiktar);
	}

}
