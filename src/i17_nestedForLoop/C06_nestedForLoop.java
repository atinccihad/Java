package i17_nestedForLoop;

public class C06_nestedForLoop {
    public static void main(String[] args) {
        /*
        Verilen String'i asagidaki gibi yazdiran bir program yazalim
        input= Deniz
        D
        De
        Den
        Deni
        Deniz
         */
        String input = "Deniz";
        for (int i = 1; i <= input.length(); i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(input.substring(j - 1, j));  // ilk harf icin substring(0,1) olmali
            }
            System.out.println("");
        }
    }
}
