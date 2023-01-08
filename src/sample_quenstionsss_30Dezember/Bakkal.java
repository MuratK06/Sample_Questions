package sample_quenstionsss_30Dezember;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



public class Bakkal {
    public static void main(String[] args) {

        /*
    Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program
yazınız. Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir
method yazınız. Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını
gösteren bir method yazınız. Ayrıca bakkalın hangi günler ortalamanın altında
 kazandığını gösteren bir method yazınız.

 * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
   2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
   3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
   4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
   5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun. for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır ortalama
             kazançtan yüksekse o günleri return yap.
   6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun. for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
             ortalama kazançtan aşağıysa o günleri return yap.
     */

        Scanner scan=new Scanner(System.in);
        ArrayList<String> gunler=new ArrayList<>(Arrays.asList("Pazartesi", "Sali", "Carsamba", "Persembe", "Cuma", "Cumartesi", "Pazar"));
        List<Integer> gunlukKazanclar=new ArrayList<>();
        int sayac=0;

        while (sayac<=gunler.size()){
            for (int i = 0; i <gunler.size() ; i++) {
                sayac++;
                System.out.println(gunler.get(i)+ " gunu kazancini girin: ");
                int kazancGiris= scan.nextInt();
                gunlukKazanclar.add(kazancGiris);

            }
            sayac++;
            System.out.println();
        }
        for (int i = 0; i <gunler.size() ; i++) {
            System.out.println(gunler.get(i)+ " gunu kazanci: "+ gunlukKazanclar.get(i));

        }
        int toplamKazanc=0;
        for (int i = 0; i <gunler.size() ; i++) {
            toplamKazanc += gunlukKazanclar.get(i);
        }

            getOrtalamaKazancc(gunler,gunlukKazanclar);
            int ortalamaKazanc= getOrtalamaKazancc(gunler,gunlukKazanclar);
            System.out.println("Toplam kazanc: "+ toplamKazanc);
            System.out.println("Ortalama kazanc: "+ ortalamaKazanc);
        System.out.println();

           ArrayList<String> ortalamaninUstuddeKazancGunlerii= getOrtalamaninUstundeKazancGünlerii(ortalamaKazanc,gunlukKazanclar,gunler);
            System.out.println();
            System.out.println("Ortalamanin ustunde kazanc gunleri: "+ ortalamaninUstuddeKazancGunlerii);
            System.out.println();
            ArrayList<String> ortalamaninAltindaKazancGunlerii= getOrtalamaninAltindaKazancGünlerii(ortalamaKazanc,gunlukKazanclar,gunler);
            System.out.println();
            System.out.println("Ortalamanin altinda kazanc gunleri: "+ ortalamaninAltindaKazancGunlerii);
            System.out.println();

        }


    private static ArrayList<String> getOrtalamaninAltindaKazancGünlerii(int ortalamaKazanc, List<Integer> gunlukKazanclar,
                                                                         ArrayList<String> gunler) {
        ArrayList<String>ortalamaninAltindaKazancGunleri=new ArrayList<>();
        for (int i = 0; i <gunler.size() ; i++) {
            if (gunlukKazanclar.get(i)<ortalamaKazanc){
                ortalamaninAltindaKazancGunleri.add(gunler.get(i));
                System.out.println(gunler.get(i)+ " gunu ortalama alti kazanci: "+ gunlukKazanclar.get(i));
            }

        }
        return ortalamaninAltindaKazancGunleri;
    }

    private static ArrayList<String> getOrtalamaninUstundeKazancGünlerii(int ortalamaKazanc, List<Integer> gunlukKazanclar,
                                                                         ArrayList<String> gunler) {
        ArrayList<String>ortalamaninUstundeKazancGunleri=new ArrayList<>();
        for (int i = 0; i <gunler.size() ; i++) {
            if (gunlukKazanclar.get(i)>=ortalamaKazanc){
                ortalamaninUstundeKazancGunleri.add(gunler.get(i));
                System.out.println(gunler.get(i)+ " gunu ortalama ustu kazanci: "+ gunlukKazanclar.get(i));
            }
        }
        return ortalamaninUstundeKazancGunleri;
    }

    private static Integer getOrtalamaKazancc(ArrayList<String> gunler, List<Integer> gunlukKazanclar) {
        int toplamKazanc=0;

        for (int i = 0; i <gunler.size() ; i++) {
            toplamKazanc+=gunlukKazanclar.get(i);
            System.out.println();
        }
        int ortalamaKazanc=toplamKazanc/gunlukKazanclar.size();
        return ortalamaKazanc;
    }
}
