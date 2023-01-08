package grup_sorulari;

import java.util.Arrays;

public class ornek {
    public static void main(String[] args) {


        /* Soru 8- Verilen bir int array’in tum elemanlarini 2 ile carpip bize donduren bir method
           olusturun. Eski array’i yeni haliyle kaydedin
         */

        int [] array={2,1,3,6,7};

        arraycarpmetod(array);
        System.out.println(Arrays.toString(array));
    }

    private static void arraycarpmetod(int[] array) {

        for (int i = 0; i <array.length ; i++) {
            array[i]=array[i]*2;


        }
        return;
    }
}
