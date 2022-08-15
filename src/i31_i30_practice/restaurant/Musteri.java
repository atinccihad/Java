package i31_i30_practice.restaurant;

public class Musteri {
    public static void main(String[] args) {

        Mutfak menu = new Mutfak();
        System.out.println("menu.toString() = " + menu.toString());
        System.out.println("");

        System.out.println("menu.toString() = " + menu.toString());
        System.out.println("");

        Mutfak siparisim = new Mutfak("adanakebap", "mercimek", "kunefe", "salgam");
        System.out.println("");

        System.out.println("siparisim = " + siparisim);
    }

}
