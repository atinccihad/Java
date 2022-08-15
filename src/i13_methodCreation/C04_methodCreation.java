package i13_methodCreation;

public class C04_methodCreation {
    public static void main(String[] args) {
        // input olarak verilen iki integer'i toplayip
        // sonucu yazdiran bir method olusturun

        int input1 = 10;
        int input2 = 20;

        // method 4 adimda olusturulur
        // 1.adim method call
        // 2. adim argument eklenmesi gerekiyorsa ekleyelim
        //   eger methodun return type'i void'den farkli olacaksa
        //   bir variable olusturup, method call'u assign edelim

        topla(input1, input2);
    }

    public static void topla(int input1, int input2) {
        // 3.adim method deklarasyonunda degistirilmesi gereken
        // bolumleri degistir (access modifier, return Type vb..)
        // 4. adim eger return type void disinda birseyse
        // return keyword'u ve donecek degeri hesaplamaliyiz
        System.out.println("input1 + input2 = " + (input1 + input2));
    }

}
