package sample_quenstionsss_30Dezember;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Manav {

    /*
    * Basit bir 5 ürünlü manav alisveris programi yaziniz.
   1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
   2. Adim : Baska bir urun almak isteyip istemedigini sor.
   * istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
   * Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
   3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
   4. Adim : Alisveris bitince toplam odemesi gereken tutari goster
     */
    static ArrayList<String> urunList=new ArrayList<>(Arrays.asList("muz","elma","portakal","limon","havuc"));
    static ArrayList<Integer> fiyatList=new ArrayList<>(Arrays.asList(2,1,3,2,3));
    static double toplam=0;
    static Scanner scan=new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("========= MANAV ===============");
        manav();
    }
    private static void manav() {
        for (int i = 1; i <= urunList.size(); i++) {
            System.out.println(i+"."+urunList.get(i-1)+" - fiyati: "+fiyatList.get(i-1));
        }
        System.out.println("Almak istediginiz urunun kodunu girin");
        int urun= scan.nextInt();
        if(urun>=1 && urun<=5) {
            System.out.println("almak istediginiz urunun miktarini giriniz.");
            double miktar = scan.nextDouble();
            toplam+= miktar * fiyatList.get(urun - 1);
        }else {
            System.out.println("hatali giris yeniden secim yapiniz");
           manav();
        }
        System.out.println("yeni urun almak ister misiniz: E/H");
        char onay=scan.next().charAt(0);
        if(onay=='e'||onay=='E'){
            manav();
        } else if (onay=='h'||onay=='H') {
            System.out.println("toplam alisveris tutari: "+toplam);
        }else {
            System.out.println("hatali giris yeniden secim yapin");
            manav();
        }
    }

}
