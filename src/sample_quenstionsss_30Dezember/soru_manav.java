package sample_quenstionsss_30Dezember;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;



public class soru_manav {
    /* Basit bir 5 ürünlü manav alisveris programi yaziniz.

   1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
   2. Adim : Baska bir urun almak isteyip istemedigini sor. istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
   Bu islemi alisverisi
    bitirmek isteyene kadar tekrarla.
            3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
   4. Adim : Alisveris bitince toplam odemesi gereken tutari goster

     */
    static ArrayList<String>urunList=new ArrayList<>(Arrays.asList("Muz","Kivi","Havuc","Elma","Nar"));
    static ArrayList<Integer> FiyatList=new ArrayList<>(Arrays.asList(2,3,2,3,4));
    static double toplam=0;

    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("==================== MANAV =====================");

        manavv();
    }

    private static void manavv() {
        for (int i = 1; i <=urunList.size() ; i++) {
            System.out.println(i+ ". " +urunList.get(i-1)+ " - fiyati "+ FiyatList.get(i-1)+ " €");

        }
        System.out.println("Almak istediginiz urunun kodunu girin: ");
        int urun= sc.nextInt();

        if (urun>=1 && urun<=5){
            System.out.println("Almak istediginiz ururnun miktarini giriniz: ");
            double miktar= sc.nextDouble();
            toplam+=miktar*FiyatList.get(urun-1);

        }else {
            System.out.println("Hatali giris yaptiniz, lutfen yeniden secim yapiniz.");
            manavv();
        }

        System.out.println("Yeni urun almak istermisiniz? E/H");
        char onay=sc.next().charAt(0);

        if (onay== 'E'|| onay=='e'){
            System.out.println("Toplam tutar: "+ toplam+ " €");
            System.out.println(" ");
            manavv();

        }
        else if (onay=='H'|| onay=='h'){
            System.out.println("Toplam tutar: "+ toplam+ " €");
        }else {
            System.out.println("Hatali giris, yeniden secim yapiniz: ");

            manavv();
        }




    }


}
