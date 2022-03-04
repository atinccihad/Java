package day06_wrapper;

public class C01_WrapperClass {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		
		int sayi1=10;
		
		Integer sayi2=20;
		
		//sayi1. yazdigimizda hicbir method cýkmaz,cunku sayi1 int'dir yani primitive dir
		//sayi2. yazdigimizda ise bircok method geliyor , cunku sayi 2 Integer 'dir yani wrapper class'dir
		
		String tel1="3578987";
		String tel2="3245434";
		
		System.out.println(tel1+tel2);   //  35789873245434
		
		//bu sayilari toplamak isterseniz
		
		System.out.println(Integer.valueOf(tel1)+Integer.valueOf(tel2));  //6824421
		
		System.out.println(Integer.MIN_VALUE); //-2147483648
        System.out.println(Integer.MAX_VALUE); // 2147483647
        
        System.out.println(Double.MAX_VALUE); //1.7976931348623157E308
        System.out.println(Short.MAX_VALUE);  //32767
        
        System.out.println("toplam: "+(Integer.valueOf(tel1)+Integer.valueOf(tel2)));//toplamlarin disinda da bir parantez olmazsa kelimeleri
                                                                                     //yanyana ekler,parantez içine alýrsak toplama iþlemi gerceklesir
                                                                //toplam: 6824421
        
		String str1="Java"; 
       
		String str2="Guzel";
        
		int sayi5=5;
        int sayi6=4;
        
        
        
        
        
	}

}
