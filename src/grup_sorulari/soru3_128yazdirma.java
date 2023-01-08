package grup_sorulari;

import java.util.Scanner;

public class soru3_128yazdirma {
    public static void main(String[] args) {

        /*Soru 3- Kullanicidan bir sayi alin, kullanici kac degerini girerse girsin, o sayiyi -128
    ile 127 arasindaki bir sayiya donusturup yazdirin
     */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir  sayi giriniz: ");
        int sayi=scan.nextInt();
        byte yenisayi=(byte) sayi; //bytenin sayi araligi -128 ile 127 arasi


        System.out.println("Yeni sayi: "+ yenisayi);


    }
}
