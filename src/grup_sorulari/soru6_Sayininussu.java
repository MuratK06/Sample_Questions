package grup_sorulari;

import java.util.Scanner;

public class soru6_Sayininussu {
    public static void main(String[] args) {

        /*
Soru 6- Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin. While loop
kullanarak verilen sayinin istenen ussunu hesaplayip yazdiran bir method
olusturun
 */

        Scanner  scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi griniz: ");
        int sayi= scan.nextInt();
        System.out.println("Lutfen us degerini giriniz: ");
        int us= scan.nextInt();

        System.out.println(ushesaplama(sayi, us));


    }

    private static int ushesaplama(int sayi, int us) {
        int sonuc=1;
        while (us>0){
            sonuc*=sayi;
            us--;
        }
        return sonuc;

    }


}
