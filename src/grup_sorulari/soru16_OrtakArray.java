package grup_sorulari;

import java.util.ArrayList;
import java.util.List;

public class soru16_OrtakArray {
    public static void main(String[] args) {

        /*Soru 16- Verilen iki array’in elementlerini karsilastirip, ikisinde ortak olan elementleri
    ayri bir liste olarak veren bir program yazin
     */

        int[] array1 = {3, 6, 5, 6, 4, 3, 8};
        //Arrays.sort(array1);
        int[] array2 = {2, 6, 8};
        //Arrays.sort(array2);
        List<Integer> ortakArray=new ArrayList<>();

        for (int i = 0; i < array1.length ; i++) {
            for (int j = 0; j < array2.length ; j++) {

                if (array1[i]==array2[j] && !ortakArray.contains(array1[i])){
                    ortakArray.add(array1[i]);

                }

            }

        }
        System.out.println("ortak liste: "+ortakArray.toString());

    }
}
