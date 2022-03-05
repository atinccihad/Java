package day06_wrapper;

public class C03_ConditionalOperators {

	
	public static void main(String[] args) {
		
	//	System.out.println(5+3==8 || 6+5==10 || 7-2==3);//true yazdirir
		
		//System.out.println(5+3==8 &&  6+5==10 && 7-2==3);//false yazdirir
		
		int a =10;
		int b=20;
		int c=30;
		
		boolean sonuc=a>b || b>c || a+b>=c; //true yazdirir ilk ikisi false oldugu halde || iyimserdir 
		
		System.out.println(sonuc);
		
		// && isareti yerine  & de kullanýlabilir ancak arada bir nuans var
		// && isareti ilk false'u buldugunda  bu islemin sonucunun false olacagini bilir
		//          ve geriye kalan islemleri kontrol etmeden sonucu false yazdirir
		// & isareti ise once tum islemleri birir sonra sonucu false yazdirir
		
		//System.out.println(5+3==8 &&  6+5==10 && 7-2==3);
		
		//System.out.println(5+3==8 &  6+5==10 & 7-2==3);
		
		int yas=50;
		int boy=180;
		char cinsiyet='M';
		
		System.out.println(yas<30 && boy>170 && cinsiyet=='M');// false
		
		
	}

}
