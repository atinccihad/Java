package i39_exceptions;

public class C04_exceptionTypes {
    public static void main(String[] args) throws InterruptedException {

        String str;
       /*
        System.out.println(str);
        deger atamasi yapmadan bir variable'i kullabmaya calisirsaniz
        Java compile time 2da bunu fark eder ve izin vermez
        */

        str = null;
        // System.out.println(str.length());
        // NullPointerException

        Object obj = "Java Java Java";
        Integer sayi = (Integer) obj; // ClassCastException

        /*
        String str2="Hava Civa";
        Integer sayi2=str2;
        Java bazi casting islemlerine compile time'da izin vermez

        Ancak bazen syntax uygun olabilir
        budurumda java kodun calismasina itiraz etmez
         */

        Thread.sleep(5000);
    }
}
