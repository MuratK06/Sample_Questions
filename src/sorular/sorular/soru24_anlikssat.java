package sorular.sorular;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class soru24_anlikssat {
    public static void main(String[] args) {
        /*
        Soru 24:
 Anlık tarihi ve saati gösteren bir method yazdırınız.
 Beklenen çıktı :
 Current date and time: Wednesday January 25, 2017 7:47:43
         */

        saatiGöster();

    }

    private static void saatiGöster() {

        LocalDateTime ldt = LocalDateTime.now();

        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("EEEE MMMM dd, YYYY H:m:s");
        System.out.println(ldt.format(format1));
        Date date = new Date();
        System.out.println(date);
//        Current date and time: Thu Dec 29 16:44:22 CET 2022

    }
}
