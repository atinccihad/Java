package day04_IncrementDecrement;

public class C03_SwapVariables {

	public static void main(String[] args) {
		
		//2- Verilen sayi1 ve sayi2 variable'larinin degerlerini
		//      3.bir variable olmadan degistiren (SWAP) bir program yapiniz
		
		int sayi1=15;
		int sayi2=20;
		
		//baslang�cta sayi1=10 ve sayi2=20
		
		System.out.println("baslangicta sayi1=" + sayi1 + " ve sayi2=" + sayi2);
		

		//   ucuncu bir variable olmadan yani "bos" variablesi olmadan yapmak i�in
		//   verilen iki sayinin farkindan istifade ediyoruz
		
		//ilk adim olarak sayilarin farkini ilk sayiya assign ediyoruz
		
		sayi1=sayi1-sayi2;
		
		//ikinci ad�m fark ile sayi 2'yi toplayip
		//sayi2 ye assign ediyorum
		
		sayi2=sayi1+sayi2;
		
		//3. adim olarak sayi1'e sayi2 - fark at�yorum
		
		sayi1=sayi2-sayi1;
		
	    //sonu� yazd�rma:
		System.out.println("sonucta sayi1=" + sayi1 + " ve sayi2=" + sayi2);
	}

}
