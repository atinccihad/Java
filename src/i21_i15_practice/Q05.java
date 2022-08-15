package i21_i15_practice;

public class Q05 {
    public static void main(String[] args) {
        /*
         Problem tanımı :
         Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
         Test Data:
         input: "aabbcccccddddaaa"
         output: abcd
       */
        birkereYazdir("ascsdsfd gsadsffhd assdfd gdfh");
    }

    private static void birkereYazdir(String str) {
        String output = "";

        for (int i = 0; i < str.length(); i++) {// int i = 0; i <= str.length()-1 ; i++
            if (!output.contains(str.substring(i, i + 1))) { // tekrarsiz karakterleri dondurecegimiz icin sonucumuz str den aldigimiz herhangi bir karakteri icermesi
                output += str.substring(i, i + 1);
            }
        }
        System.out.println(output);
    }
}
