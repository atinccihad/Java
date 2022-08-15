package i39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_IOException {
    public static void main(String[] args) throws FileNotFoundException {
        /*
        Java'da bilgisayarimizdaki bir dosya'ya erismek istiyorsak
        FileInputStream Class'indan yardim aliriz
        Ayni sekilde Java'dan bilgisayarimizdaki bir dosyaya
        ekleme veya update yapmak istersek
        FileOutputStream Class'indan yardim aliriz
         */
        FileInputStream fis = new FileInputStream("src/i39_exceptions/Test.txt");
        /*
        Goruldugu gibi compile time'da altini kirmizi cizen her durum
        Compile Time Error degildir
        Java'da bazi exception'larda
        Compile Time  Exception'dur
        Ozellikle dosya okuma ve yazma ile ilgili exceptionlar
        Compile Time Exception'dir

        Compile time Exception olustugunda Java cozum icin 2 ihtimal onerir
        1- try catch ile cevrelemek
        2- method signature'ina throws keyword ile beklenen exception turunu yazmak

        throws Exception , sadece olayin farkinda oldugumuzun declarasyonudur
        exception'un handle edilmesinde hicbir rolu yoktur
        Yani try-catch ile kontrol altina aldigimiz exception'larda
        kod calismaya devam ediyordu
        Ancak throws Exception yazdigimizda Java bir exception ile karsilasirsa
        hicbir sey yapmamisiz gibi hata mesaji yayinlayip calismayi durdurur.
         */
    }
}
