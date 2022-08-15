package i24_arrayList_forEachLoop;

public class C07_forEachLoop {
    public static void main(String[] args) {
        /*
        Soru 2:
        Bir integer list olusturunuz ve bu list’deki tum sayilarin karesinin toplamini
        For-each loop kullanarak bulunuz.
        Sonucu ekrana yazdiriniz.
         */
        int[]sayilar={2,3,4,5,6,9,8,7,1,3,5};

        int toplam=0;

        for (int each:sayilar) {
            toplam+=each*each;
        }
        System.out.println("Kareler toplami= "+toplam);
    }
}
