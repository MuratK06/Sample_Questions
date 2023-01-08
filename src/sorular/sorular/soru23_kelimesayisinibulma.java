package sorular.sorular;

public class soru23_kelimesayisinibulma {
    public static void main(String[] args) {

        /*
        Soru 23:
 Bir Stringde bulunan toplam kelime sayısını bulup, method olarak döndüren
 java programı yazınız.
 Örnek String : Java ögrenmek emek ve sabır ister.
 Beklenen çıktı :
 String'de bulunan kelime sayısı : 6
         */

        String cumle="Java ögrenmek emek ve sabır ister.";
        System.out.println(("girilen cumlede"+" "+toplamkelime(cumle)+" "+"tane kelime var"));
    }
    private static int toplamkelime (String cumle) {
        int sayac=1;
        for (int i = 0; i <cumle.length() ; i++) {
            if (cumle.charAt(i)==' '){
                sayac++;
            }
        }
        return sayac;
    }
}
