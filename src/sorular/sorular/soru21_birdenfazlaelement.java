package sorular.sorular;

import java.util.ArrayList;
import java.util.List;

public class soru21_birdenfazlaelement {
    public static void main(String[] args) {
        /*
        Soru 21:
        Bir Integer Array içerisinde bazı elementler birden fazla bulunmaktadır.
                Tekli elemanları oluşturacağımız yeni Array'e aktaran bir method oluşturup,
        yeni Array'i yazdıralım.
        örnek: int [] array={3,7,9,6,7,3,5,4,1,8,6,9}
        Çıktı : yeniArray={5,4,1,8}
                */
        int[] array = {3, 7, 9, 6, 7, 3, 5, 4, 1, 8, 6, 9};
        List<Integer> liste=new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            int sayac = 0;
            for (int j = 0; j < array.length; j++) {
                if ((array[i] == array[j]) && (i != j)) {
                    sayac++;
                }
            }
            if (sayac == 0) {
                liste.add(array[i]);
            }
        }
        System.out.println(liste);
    }
}
