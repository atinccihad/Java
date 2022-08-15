package i02_variables;

public class C01_variables {
    public static void main(String[] args) {
        int not = 60;
        //  dataTuru    variableName         assigment    variableDegeri       islemBittiIsareti

        int not2 = 70;
        // java once degeri hesaplar sonra assign islemini yapar

        // not2'yi 90 yapalim
        not2 = 90;

        // yeni bir int variable olusturalim degeri ilk iki variable'nin ortalamasi olsun
        int ort = (not + not2) / 2;
        System.out.println("ort= " + ort);

        // "" icinde yazilan hersey metindir java "" icinde ne gorurse o sekilde yazdirir
        // eger bir variable'in degerini yazdirmak istiyorsaniz "" olmadan variable ismini yazmalisiniz.
    }
}
