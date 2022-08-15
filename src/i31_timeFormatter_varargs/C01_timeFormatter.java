package i31_timeFormatter_varargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_timeFormatter {
    public static void main(String[] args) {

        LocalDateTime tarihSaat = LocalDateTime.now();
        System.out.println("ilk olusturulan tarih: " + tarihSaat); // ilk olusturulan tarih: 2022-07-25T21:40:55.161438400

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/YYYY  hh:mm a"); // 25/07/2022  09:47 PM
        System.out.println(dtf1.format(tarihSaat));

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("d/MMM/yyyy  HH:mm a"); // 25/Jul/2022  21:47 PM
        System.out.println(dtf2.format(tarihSaat));


    }
}
