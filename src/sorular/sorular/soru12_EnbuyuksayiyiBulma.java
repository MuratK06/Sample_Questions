package sorular.sorular;

public class soru12_EnbuyuksayiyiBulma {
    public static void main(String[] args) {
/*
        Soru 22:
        Verilen 3 sayı içerisinden en küçük sayıyı bulup, method olarak döndüren
        java kodu yazınız.
                birinci sayı : 25
        ikinci sayı : 37
        üçüncü sayı : 29
        beklenen çıktı:
        En küçük sayı 25.0
        */

        int [] arr={55,37,29};

        System.out.println("en kucuk sayi: "+enkucuksayi(arr));

    }

    private static int enkucuksayi(int[] arr) {


        int min=arr[0];


        for (int i = 0; i <arr.length ; i++) {

            if (arr[i]<=min){
                min=arr[i];
            }

        }
        return min;
    }
}
