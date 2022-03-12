package day10_ternary_SwitchCase;



public class C05_NestedTernary {

	public static void main(String[] args) {
		//   Eger calisan kadinsa 60 yasindanbuyuk oldugunda emekli olabilir
		//   Calisan erkekse 65 yasindan buyukse emekli olabilir
		
		// her seferinde Scanner olusturmak yerine 
		// test datalarimizi variable olarak da olusturabiliriz
		// ve kodun yazimi bittiginde bu test datalarini degistirerek
		// kodlarimizi test edebiliriz
		
		char cinsiyet='E';
		int yas=71;
		
		String sonuc=cinsiyet=='K' ? (yas>=60 ? "Emekli olabilirsin":"Emekli olamazsin"):
				                     (yas>=65 ? "Emekli olabilirsin":"Emekli olamazsin");
		
		System.out.println(sonuc);
		
		
		
		
		
	}

}
