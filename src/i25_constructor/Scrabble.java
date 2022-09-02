package i25_constructor;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Scrabble {

        /*
        İki kişilik bir Scrabble Oyunu yaz
        Kurallar Tamam ==
        1- Başlangıçta ilk Oyuncuya sor oyuna başlamak için bir kelime gir Tamam
        2- Sonra oyuncuyu değiştir Verilen kelime geçerliyse veya tamam değilse yeni oyuncuya sor
               i) Yeni oyuncu verilen kelimeyi kabul ederse oyuna harf sayısını ekleyin. kelimeyi yazan oyuncuya işaret eder ve
        3. adıma geçin Tamam
               ii) Yeni oyuncu kelimeyi geçerli olarak kabul etmezse, "Geçersiz kelime, oyuncu X (Geçerli oyuncu) oyunu kazandı" yazıp oyunu bitirin

       Tamam 3- Kullanıcıya oyuna devam etmek isteyip istemediğini sorun
       Tamam i) Oyuncu devam etmek istiyorsa,
       Tamam kullanıcıya kelimeye eklemek için bir harf sorun
       Tamam ve kullanıcı tarafına eklemek için sor (başlangıç veya bitiş)
       Tamam sonra kelimeye mektup ekleyin ve 2. adımı çalıştırın
       Tamam ii) Oyuncu devam etmek istemiyorsa, "Oyun Bitti" yi yazdırın ve puanları ve kazananı yazdırın
         */
        public static void main(String[] args) {
            String[] alphabet = {"a", "b", "c", "d", "e",
                    "f", "g", "h", "i",
                    "j",   "k", "l", "m", "n", "o",
                    "p", "q", "r", "s", "t",   "u", "v",
                    "w", "x", "y", "z"};

            int[] values = {1, 3, 3, 2, 1, 4,
                    2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10,
                    1, 1, 1, 1, 4, 4, 8, 4, 10};

            Scanner kboard = new Scanner(System.in);
            System.out.println("Input your word.");

            String choice = kboard.nextLine();

            int score = 0;
            for(int i = 0; i < choice.length(); i++) {
                for(int n = 0; n < 26; n++)   {
                    if(choice.substring(i).equals(alphabet[n]))
                    {
                        score += values[n];
                    }
                }
            }

            System.out.println("The score for your word is " + score);
        }
}
