package sample_quenstionsss_30Dezember;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class soru_Bakkal {
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

        Scanner scan = new Scanner(System.in);
        //1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
        ArrayList<String> gunler = new ArrayList<>(Arrays.asList("Pazartesi", "Sali", "Carsamba", "Persembe", "Cuma", "Cumartesi", "Pazar"));
        //2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
        List<Integer> gunlukKazanclar = new ArrayList<>();
        //3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
        int sayac = 0;
        while (sayac <= gunler.size()) {
            for (int i = 0; i < (gunler.size() ); i++) {
             sayac++;
                System.out.println(gunler.get(i) + " kazancini giriniz:");
                int kazancGiris = scan.nextInt();
                gunlukKazanclar.add(kazancGiris);
            }
         sayac++;
        }
        for (int i = 0; i < gunler.size(); i++) {
            System.out.println(gunler.get(i) + " kazanci: " + gunlukKazanclar.get(i));
        }
        int toplamKazanc=0;
        for (int i = 0; i < gunler.size(); i++) {
            toplamKazanc+=gunlukKazanclar.get(i);
        }
        //4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
        getOrtalamaKazanc(gunler,gunlukKazanclar);
        int ortalamaKazanc=getOrtalamaKazanc(gunler,gunlukKazanclar);
        System.out.println("toplam kazanc: "+toplamKazanc);
        System.out.println("ortalama kazanc :"+ortalamaKazanc);
        System.out.println();
        //5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun. for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır ortalama
        // kazançtan yüksekse o günleri return yap.
        ArrayList<String> OrtalamaninUstundeKazancGunleri= getOrtalamaninUstundeKazancGunleri(ortalamaKazanc,gunler,gunlukKazanclar);
        System.out.println();
        System.out.println("OrtalamaninUstundeKazancGunleri: "+ OrtalamaninUstundeKazancGunleri);
        System.out.println();
        //6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun. for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
        // ortalama kazançtan aşağıysa o günleri return yap.
        ArrayList<String> OrtalamaninAltindaKazancGunleri= getOrtalamaninAltindaKazancGunleri(ortalamaKazanc,gunler,gunlukKazanclar);
        System.out.println();
        System.out.println("OrtalamaninAltindaKazancGunleri"+OrtalamaninAltindaKazancGunleri);
        System.out.println();
    }
    private static ArrayList<String> getOrtalamaninAltindaKazancGunleri(int ortalamaKazanc, ArrayList<String> gunler,
                                                                        List<Integer> gunlukKazanclar) {
        ArrayList<String> OrtalamaninAltindaKazancGunleri=new ArrayList<>();
        for (int i = 0; i <gunler.size(); i++) {
            if(gunlukKazanclar.get(i)<ortalamaKazanc){
                OrtalamaninAltindaKazancGunleri.add(gunler.get(i));
                System.out.println(gunler.get(i) + " ortalama alti kazanci: " + gunlukKazanclar.get(i));
            }
        }return OrtalamaninAltindaKazancGunleri;
    }
    private static ArrayList<String> getOrtalamaninUstundeKazancGunleri(int ortalamaKazanc, ArrayList<String> gunler,
                                                                        List<Integer> gunlukKazanclar) {
        ArrayList<String> OrtalamaninUstundeKazancGunleri=new ArrayList<>();
        for (int i = 0; i < gunler.size(); i++) {
            if(gunlukKazanclar.get(i)>=ortalamaKazanc){
                OrtalamaninUstundeKazancGunleri.add(gunler.get(i));
                System.out.println(gunler.get(i) + " ortalama ustu kazanci: " + gunlukKazanclar.get(i));
            }
        }
        return OrtalamaninUstundeKazancGunleri;
    }
    private static Integer getOrtalamaKazanc(ArrayList<String> gunler, List<Integer> gunlukKazanclar) {
        int toplamKazanc=0;
        for (int i = 0; i < gunler.size(); i++) {
            toplamKazanc+=gunlukKazanclar.get(i);
            System.out.println();
        }
        int ortalamaKazanc=toplamKazanc/ gunlukKazanclar.size();
        return ortalamaKazanc;

}


}
