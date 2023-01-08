package grup_sorulari;

import java.util.Scanner;

public class soru4_isimsoyisimyazdirma {
    public static void main(String[] args) {

        /* Soru 4 : Kullanicidan isim ve soyismini ayri ayri alin.
- ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde
    yazdirin
- soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk
    harflerle yazdirin.
    */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz: ");
        String isim= scan.nextLine().toLowerCase();
        System.out.println(" Lutfen soyisminizi giriniz: ");
        String soyisim= scan.nextLine();

        if (isim.length()==soyisim.length()){
            System.out.println(isim+ " "+ soyisim +" \nisim ve soyisim ayni sayida karektere sahib.\n");
        }else {
            if (isim.length()>soyisim.length()){
                System.out.println(isim.substring(0,1).toUpperCase()+isim.substring(1)+" "+
                        soyisim.substring(0,1).toUpperCase()+soyisim.substring(1));
            }else {
                System.out.println(isim.substring(0, 1).toUpperCase() + isim.substring(1) + " " +
                        soyisim.toUpperCase());

            }
        }
    }
}
