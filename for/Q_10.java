package Day_06_ForLoop;

import java.util.Scanner;

public class Q_10 {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		/*Kullan�c�dan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf oldu�unu,
	    de�ilse sessiz harf oldu�unu ekrana yazd�rs�n. Girdi�i de�er harf de�ilse yada
	            1 karakterden fazla ise hata mesaj� g�stersin. (Test girilen harfi b�y�k yada k���kl���ne duyarl�d�r.)
	    Sesli harfler: a,e,i,o,u
	    Test Data:
	    a
	    Beklenen ��kt�:
	    a harfi sesli harfdir.
	    Test Data:
	    d
	    Beklenen ��kt�:
	    d harfi sesiz harftir.
	    Test Data:
	    we  yada %
	    Beklenen ��kt�:
	    Yanlis karakter girdiniz!
	     */
	  

	        Scanner scan = new Scanner(System.in);
	        System.out.print("harf giriniz: ");
	        String harf = scan.next();

	        String sesliHarf = "aeuoi";
	        String sessizHarf = "bcdfghjklmnprstvyzxwq";

	        if (harf.length() == 1) {

	            for (int i = 0; i <= sessizHarf.length(); i++) {
	                if (sesliHarf.toLowerCase().contains(sesliHarf)) {
	                    System.out.println("sesli");
	                    break;
	                } else if (sessizHarf.toLowerCase().contains(sessizHarf)) {
	                    System.out.println("sessiz");
	                    break;
	                } else System.out.println("Yanlis karakter girdiniz!!!");
	                break;
	            }
	        } else System.out.println("Yanlis karakter girdiniz!!!");
       
	      

	}

}
