package sorular.sorular;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class soru25_tarihyazdirma {
    public static void main(String[] args) {

        /*
         Soru 25:
     Ayın son gününün tarihini aşağıdaki şekilde yazdıran bir java programı yazınız:
     örnek çıktı : Fri Jun 30 15:17:35 IST 2017
         */
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("EEE MMM dd H:m:s YYYY");//EEE MMM dd HH:mm:ss zzz yyyy
        System.out.println(ldt.format(format1));

    }
}
