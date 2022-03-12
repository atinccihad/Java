package day10_ternary_SwitchCase;

public class C06_NestedTernary {

	public static void main(String[] args) {
		// Soru 2) Verilen karakteri inceleyin
		// kucuk harf ise konsola "kucuk harf"
		// buyuk harf ise konsola "buyuk harf"
		// yoksa "girdiginiz karakter harf degil" yazdirin.
		
		char krk='&';
		
		// String sonuc=(krk>='a' && krk<='z') ? "Kucuk Harf" : (//sart yanlis ise sonuc);
		String sonuc=(krk>='a' && krk<='z') ? "Kucuk Harf" :(
				     (krk>='A' && krk<='Z') ? "Buyuk Harf" :"girilen karakter harf degil");
		
		System.out.println(sonuc);
		
		
		
	}

}
