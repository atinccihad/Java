package day47_48_maps;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C05_Maps {

	public static void main(String[] args) {
		// 1- Bir map olusturmadan once Map'e koyacagimiz Key ve Value degerlerini incelemeliyiz-
		// Tum degerleri koyabilmek icin Key ve Value icin Object,Object secebiliriz
		// Ama bu durumda Map icerisindeki elemanlara ait bilgilere ulasmakda zorlanabiliriz
		// Data turunu secerken hem icine koyacagimiz tum elemanlari kapsayacak bir data turu secmeliyiz
		// Hem de icine koydugumuz tum elemanlari isleyecek sekilde data turu secmeliyiz
		
		// 2- Map'i olustururken map'in turune de karar vermeliyiz.
		
		Map<Integer ,String>sinif=new HashMap<>();
		
		sinif.put(101, "Ali,Can,J.dev");
		sinif.put(102, "Veli,Yan,QA");
		sinif.put(103, "Ali,Yan,C#");
		
		int no=104;
		String isim="Ayse";
		String soyIsim="Can";
		String brans="QA";
		
		sinif.put(no,isim+", "+soyIsim+", "+brans);
		
		System.out.println(sinif);
		// {        101=Ali,Can,J.dev,  102=Veli,Yan,QA,      103=Ali,Yan,C#,            104=Ayse, Can, QA}
		// map par. Key1=Vlue1          Key2=Value2           Key3=Value3                Key4=Value4
		
		// no su 102 olan ogrencinin bilgilerini gorelim
		System.out.println(sinif.get(102));// Veli,Yan,QA
		System.out.println(sinif.get(104));// Ayse, Can, QA
		System.out.println(sinif.get(101));// Ali,Can,J.dev
		
		// eger map'deki tum key'leri gorelim derseniz
		
		System.out.println(sinif.keySet());// [101, 102, 103, 104]
		                                   // bir set olarak Key degerlerini dondurur
		
		// map'deki value'lari gormek istersek
		
		System.out.println(sinif.values());// [Ali,Can,J.dev, Veli,Yan,QA, Ali,Yan,C#, Ayse, Can, QA]
		                                   // Collection olarak
		// ancak yazdirma islemi disinda birsey yapamayiz
		
		
		// siniftaki ogrencilerin isimlerini bir listeye ekleyip yazdiralim
		
		List<String>valueList=new ArrayList<>(sinif.values());
		System.out.println("valueList :  "+valueList);
		
		
		Collection<String>valueeList=  sinif.values();
		System.out.println("valuee List: "+valueeList);// value List: [Ali,Can,J.dev, Veli,Yan,QA, Ali,Yan,C#, Ayse, Can, QA]
		
		System.out.println(valueList.size());//  4
		
		List<String>isimListesi=new ArrayList<>();
		String bilgiler[]=new String[3];
		
		for (int i = 0; i < valueList.size(); i++) {
			
			bilgiler=valueList.get(i).split(",");
			isimListesi.add(bilgiler[0]);
		}
		
		System.out.println(isimListesi);// [Ali, Veli, Ali, Ayse]
		
		
		
		
		
		
		
		
		
		
	}

}
