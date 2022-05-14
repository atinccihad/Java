package Day_10_DateTime;

public class Q03 {

	public static void main(String[] args) {
		// Verilen int'lerden ilki haric tum sayilari toplayan ve 
	// buldugunuz toplam ile ilk sayiyi carpip sonucu yazdiriniz.
	topla(2, 34,12,45,50);
    topla(3, 5,8,7,44,66,61,16,10);
}

public static void topla(int carpilacakSayi,int... toplanacakSayilar ) {
	int toplam=0;
	
	for (int each : toplanacakSayilar) {
		toplam+=each;
	}System.out.println("sonuc: "+carpilacakSayi*toplam);
	}
}
