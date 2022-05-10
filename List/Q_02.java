package Day_09_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q_02 {

	public static void main(String[] args) {
		//2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanlarý bir
        //listeye kopyalayan ve harf sýrasýna göre yazdýran bir METHOD yazýnýz.
        //Eg : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
        //   Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]

        String isim[][] = {{"Ali", "Veli", "Ayse"}, {"Hasan", "Can"}, {"Suzan"}};
        List<String> list1=new ArrayList<>();
        
        
        for (int i = 0; i < isim.length; i++) {
			for (int j = 0; j < isim[i].length; j++) {
				list1.add(isim[i][j]); // girilen i'nin j'si isim'e eklendi
			}
		}
        System.out.println("ilk liste: "+list1);
        Collections.sort(list1);
        System.out.println("siralamadan sonraki liste: "+list1);
	}

}
