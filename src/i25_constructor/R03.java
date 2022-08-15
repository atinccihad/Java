package i25_constructor;

public class R03 {
    R03(String str) {
        System.out.println("R03 parametreli constructor calisti");
    }
    R03(){
        System.out.println("R03 parametresiz constructor calisti");
    }

    public static void main(String[] args) {
         /*
       Biri parametreli,
       diğeri parametresiz 2 kurucu oluşturun.
       Bu yapıcıları kullanarak en az 2 nesne oluşturun
       ve özelliklerini konsolda yazdırın.
       */
        R03 r03=new R03();
        R03 r031=new R03("Veli");

    }
}
