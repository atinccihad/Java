package i40_final;

public class A {

    protected String isim = "Cuneyt";
    final static String OKUL = "Yildiz Koleji";

    /*
    Bir variable final olarak tanimlandiysa
    Baska class'lardan veya icinde oldugumuz class'dan
    bu variable'a baska deger atanmasi mumkun degildir

    Madem ki degistirilemiyor
    Genelde static de yaparak
    bu variable'a erisimi kolaylastiririz.
    ve genelde static final olarak belirlenen variable isimleri BUYUK HARFLE yazilir.
     */
    final void finalMetod() {
        System.out.println("final methodlar override edilemez");
            /*
            bir methodu final olark isaretlerseniz bu method degistirilemez demektir
            override edilemez.
             */
    }

}
