package day40_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_FileInputStream {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) throws FileNotFoundException {
		// Java'da bir dosya ya ulasmak istedigimizde FileInputStream class'indan yardim aliriz
		//
		
		FileInputStream fis=new FileInputStream("C:\\Users\\USER\\Desktop\\javaProject\\CihadDosya\\CihadDosya\\src\\day40\\yazi.txt");
		
		// Java bu kodda olasi bir problem ongoruyor
		// ve bu probleme karsi ne yapmasi gerektigini bize soruyor
		// yani alti cizilen her kod CTE degildir
		
		// Bunun icin iki durum sözkonusu
		// 1-  try-catch kullanarak bu problemi HANDLE edip java'nin yola devam etmesini saglayabiliriz
		// 2-  Eger dosya okunamiyorsa kod calismasin istiyorsak olayin farkinda oldugumuzu
		//  ve sorumlulugun bizde oldugunu JAVA ya soylemeliyiz
		
		System.out.println("Gorev tamamlandi");
		
		
	}

}
