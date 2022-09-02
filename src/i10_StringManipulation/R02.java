package i10_StringManipulation;

import java.util.Scanner;

public class R02 {
    public static void main(String[] args) {
        /*
        Bir String icerisinde yinelenen karakterleri döndüren bir kod yazıniz.(mülakat Sorusu)

       Input :

       String str=“Javaisalsoeasy”

       Output: a s
         */
        Scanner scan = new Scanner(System.in);
        int count=0;
        int[] arr=new int[count];
        String str = scan.nextLine();
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
               if (str.substring(i,i+1).equals(str.substring(j,j+1))){
                   count++;
               }
               if (count>=2){
                   System.out.println(str.charAt(i));
               }
            }count=0;
        }
    }
}

