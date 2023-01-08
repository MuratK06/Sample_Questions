package grup_sorulari;

import java.util.Arrays;

public class soru8_Arrayelemanaikiekleme {
    public static void main(String[] args) {

         /* Soru 8- Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method
           olusturun. Eski array’i yeni haliyle kaydedin
         */

        int [] array={1,2,3,4,5};

        arrayartiryazdir(array);
        System.out.println(Arrays.toString(array));



    }

    private static void arrayartiryazdir(int[] array) {

        for (int i = 0; i <array.length ; i++) {
            array[i]=array[i]+2;


        }
        System.out.println(array);
    }

}
