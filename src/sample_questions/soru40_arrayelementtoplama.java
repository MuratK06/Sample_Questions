package sample_questions;

public class soru40_arrayelementtoplama {
    public static void main(String[] args) {

       /* Bir diziyi (Array) parametre olarak kabul eden ve dizideki tüm elemanların toplamını döndüren bir method yazın
       ve ardından sonucu main methodda yazdırın.
        Örn:
        girdi : {1,2,3,4,5,6,7,8}
        çıkış: 36
        ıpucu: For Loop ile arrayin elemanlarını toplayın ve methodu yazdırarak döndürün

        */
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println("sayilarin toplami: "+Arrayparemetreleritople(input));



    }

    private static int Arrayparemetreleritople(int[] input) {
        int toplam=0;

        for (int i = 0; i <input.length ; i++) {
            toplam+=input[i];


        }
        return toplam;


    }

}
