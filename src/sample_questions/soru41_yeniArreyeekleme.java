package sample_questions;

import java.util.Arrays;

public class soru41_yeniArreyeekleme {
    public static void main(String[] args) {

        /*
        Soru 41-)
Parametre olarak 2 Int Array kabul eden ve 2 Array listesini yeni bir Arraye ekleyen ve yazdıran bir method yazın.
		 * Input1={1,2,3,4}
		 * Input2={5,6}
		 * Çıktı={1,2,3,4,5,6}
         */

        int [] Input1={1,2,3,4};
        int [] Input2={5,6};



        birArayaGelenArray(Input1,Input2);


    }

    private static void birArayaGelenArray(int[] input1, int[] input2) {
        int [] Input1={1,2,3,4};
        int [] Input2={5,6};

        int [] cikti=new int[input1.length+input2.length];

        for (int i = 0; i <Input1.length; i++) {
            cikti [i]=input1[i];

            for (int j = 0; j <Input2.length ; j++) {
                cikti [input1.length+j]=input2[j];


            }

        }
        System.out.println(Arrays.toString(cikti));
    }
}
