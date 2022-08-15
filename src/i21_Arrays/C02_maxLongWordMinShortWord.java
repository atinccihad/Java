package i21_Arrays;

public class C02_maxLongWordMinShortWord {
    public static void main(String[] args) {
        // Verilen String bir array’de en uzun ve en kisa
        // String’leri yazdiran bir method olusturun

        String[] isimler = {"Erdal", "Onur", "Mehmet", "Hayrullah", "Mihrican"};
        enUzunVeKisayiYazdir(isimler);
    }

    private static void enUzunVeKisayiYazdir(String[] isimler) {
        String enUzunKelime = isimler[0];
        String enKisaKelime = isimler[0];

        for (int i = 0; i < isimler.length; i++) {
            if (isimler[i].length() > enUzunKelime.length()) {
                enUzunKelime = isimler[i];
            }
            if (isimler[i].length() < enKisaKelime.length()) {
                enKisaKelime = isimler[i];
            }
        }
        System.out.println("Array'deki en uzun kelime=> " + enUzunKelime);
        System.out.println("Array'deki en kisa kelime=> " + enKisaKelime);
    }
}
