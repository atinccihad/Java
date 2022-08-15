package i30_immutable_date;

import java.time.LocalDate;
import java.time.Period;

public class C07_period {
    public static void main(String[] args) {

        // iki tarih arasindaki sureyi bulma
        LocalDate tarih1 = LocalDate.of(1988, 3, 12);
        LocalDate bugun = LocalDate.now();

        Period period = Period.between(tarih1, bugun);

        System.out.println(period); // P-34Y-4M-11D

        System.out.println(period.getYears()); // 34


    }
}
