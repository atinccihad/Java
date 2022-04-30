package Day_03;

import java.util.Scanner;

public class Q_03 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("kilonuzu girin");
		double kilo=scan.nextDouble();
		System.out.println("boyunuzu girin");
	    double boy=scan.nextDouble();
	    
	    double BMI=kilo/(boy/100*boy/100);
	    
	    if (BMI<=20) {
			System.out.println("oldukca zayifsiniz");
		} else if (BMI<=25) {
			System.out.println("normal sinirlardasiniz");
		} else if (BMI<=30) {
			System.out.println("sisman kategori");
		} else if (BMI>30) {
			System.out.println("obezsiniz");
		} 
		
	  scan.close();  
	}

}
