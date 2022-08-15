package i18_while_doWhileLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class R03 {
    public static void main(String[] args) {
        /*
        Yinelenen karakterleri bir Dize dizisinde döndüren bir kod yazın.

        Giriş :

        String str=”Javaisalsoeasy"

        Çıktı: [a, s]
         */
        int harfSayisi = 0;


        String str ="Javaisalsoeasy";
        String[] strArr = str.split("");
        Arrays.sort(strArr);
        System.out.println(Arrays.toString(strArr));
        List<String>tekrarEdenler=new ArrayList<>();

        for (int i = 1; i < strArr.length; i++) {
          if (strArr[i].equals(strArr[i-1])){
              harfSayisi++;
          }else {
              harfSayisi=0;
          }
                if (harfSayisi>=2){
                    tekrarEdenler.add(strArr[i]) ;
                }
        }


        System.out.println(tekrarEdenler);






    }
}
