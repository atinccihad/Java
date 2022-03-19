package day11_12_13_stringManipulations;

public class C16_ReplaceAll {

	public static void main(String[] args) {
		
		String cumle="Java     cok      zevkli";

		cumle=cumle.replaceAll("\\s+", " ");//fazla olan space lari tek space a cevirdik
		System.out.println(cumle); //Java cok zevkli
		
		cumle=cumle.replaceAll("[ak]", ""); // a'dan  k'ya kadar olan harfleri hiçlik ile degistirir
		System.out.println(cumle);//Jv co zevli
		
		cumle=cumle.replaceAll("[a-z]", ""); //a'dan z'ye kadar olan harfleri yani butun kucuk harfleri hiçlik ile degistirir
		System.out.println(cumle); //J
		
		
	}

}
