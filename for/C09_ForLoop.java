package day16_17_forLoops;

import java.util.Scanner;

public class C09_ForLoop {

	public static void main(String[] args) {
		// Soru 8) Interview Question Kullanicidan bir String isteyin
		//         ve String i tersine ceviren bir method yazin
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen tersine cevirmek icin bir yazi giriniz");
		String str=scan.nextLine();
		
		tersineCevir(str);
		
		
			
		scan.close();

	}

	public static String tersineCevir(String str) {
		String tersStr="";  // Saklamak icin olusturduk Str'ı(Kullanicinin girdigi String'i tersine cevirdikten sonra saklamasi icin)
		
		for (int i = str.length()-1;  i>=0   ; i--) {
			tersStr+=str.substring(i, i+1);
		}
		
	return tersStr;	
	}

}
