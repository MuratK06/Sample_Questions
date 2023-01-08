package sorular.sorular;

import java.util.ArrayList;
import java.util.List;

public class soru22_ortakarray {
    public static void main(String[] args) {

        /*
        Soru 21:

        Bir Integer Array içerisinde bazı elementler birden fazla bulunmaktadır.
                Tekli elemanları oluşturacağımız yeni Array'e aktaran bir method oluşturup,
        yeni Array'i yazdıralım.
        örnek: int [] array={3,7,9,6,7,3,5,4,1,8,6,9}
        Çıktı : yeniArray={5,4,1}

         */

        int [] array={3,7,9,6,7,3,5,4,1,8,6,9};

        ortaksayiArray(array);






    }

    private static void ortaksayiArray(int[] array) {
        List<Integer> ortakArray=new ArrayList<>();
        List<Integer> yeniArray=new ArrayList<>();


        for (int i = 0; i < array.length ; i++) {

            if (ortakArray.contains(array[i])){
                ortakArray.add(array[i]);
            }if (!yeniArray.contains(ortakArray)){
                yeniArray.add(array[i]);
            }

        }
        System.out.println(yeniArray.toString());
    }
}
