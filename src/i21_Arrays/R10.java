package i21_Arrays;

public class R10 {
    public static void main(String[] args) {
        /*
        Bir String değişkeni cümlesi verildiğinde, her sözcüğü almak için kod yazın ve tersine ters çevrilmiş String'e atayın.

        Test Data:
        sentence -> "Java is fun"
        reversed **-> "**fun is Java**"**
         */
        String str="Java is fun";
        String[]kelimeler=str.split(" ");
        String reverseString="";
        for (int i = kelimeler.length-1; i >= 0; i--) {
            reverseString+=kelimeler[i]+" ";
        }
        System.out.println("reverseString = " + reverseString);

    }
}
