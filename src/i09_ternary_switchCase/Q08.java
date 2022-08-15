package i09_ternary_switchCase;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        // Kullanicidan SDET kisaltmasindaki harflerden birini yazmasini isteyin.
        // Kullanici S girerse "Software"
        // D girerse "Developer"
        // E girerse "Engineer"
        // T girerse "In Testing" yazdirin
        Scanner scan = new Scanner(System.in);

        System.out.println("SDET kisaltmasindaki harflerden birini giriniz");
        String harf = scan.next();
        char ilkHarf = harf.toUpperCase().charAt(0);

        switch (ilkHarf) {
            case 'S':
                System.out.println("Software");
                break;
            case 'D':
                System.out.println("Developer");
                break;
            case 'E':
                System.out.println("Engineer");
                break;
            case 'T':
                System.out.println("In Testing");
                break;
            default:
                System.out.println("Hata almamak icin SDET kisaltmasindaki harflerden birini giriniz");
        }
    }
}
