package day29_staticBlock_passByValue;

public class C03_PassByValue {
	public static void main(String[] args) {
		// Main method'dan diger method'lara veya diger method'lardan main method'a
		// bir variable gonderirseniz Java orjinal variable'lari degil 
		// onlarin degerlerini(value) goturur, orjinal variable'nin degeri degismez
		
		// biz 100 tl ye satilan 2 farkli indirim uygulayan iki method olusturalim
		
		int fiyat=100;
		
		System.out.println(indirimYap25(fiyat));
		indirimYap25(fiyat);
        
		
		fiyat=indirimYap10(fiyat); // indirimi kalici yapmak istiyorsaniz main method'da atama yapmaniz gerekir
		
		System.out.println("method'dan sonra main method'daki fiyat: "+fiyat); // method'dan sonra main method'daki fiyat: 100
		
	}

	private static int indirimYap25(int fiyat) {
		fiyat*=0.75;
		
		return fiyat;
	}

	private static int indirimYap10(int fiyat) {
		fiyat*=0.90;
		
		return fiyat;
	}
}   // Java PassByValue  dur kendisi gitmez degerini gonderir , fiyat ismi yerine farkli isim de kullansak indirim yap methodlarinda fiyat ismine degil
                                                                                                           //  DEGERÝNE BAKAR VE ONU GOTURUR...
