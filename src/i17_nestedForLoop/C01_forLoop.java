package i17_nestedForLoop;

public class C01_forLoop {
    public static void main(String[] args) {
        // Verilen String'deki kullanilan harfleri tekrarsiz olarak
        // yazdirip kelimede kullanilan
        // farkli harf sayisini veren bir method yaziniz.

        String input = "Java her zaman guzel";

        tekrarsizYap(input);
    }

    public static void tekrarsizYap(String input) {
        String benzersizInput = "";

        String islenecekKelime = input.replaceAll("\\W", "");
        System.out.print(input.substring(0, 1)); // J
        benzersizInput += (islenecekKelime.substring(0, 1)); // J

        for (int i = 0; i < islenecekKelime.length(); i++) {
            if (!benzersizInput.contains(islenecekKelime.substring(i, i + 1))) {
                System.out.print(", " + islenecekKelime.substring(i, i + 1));
                benzersizInput += islenecekKelime.substring(i, i + 1);
            }
        }
        System.out.println("");
        System.out.println("input = " + input);
        System.out.println("benzersizInput = " + benzersizInput);
        System.out.println("Kelimede verilen farkli harf sayisi: " + benzersizInput.length());
    }
}
