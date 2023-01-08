package sample_questions;

public class soru39_arrayenbuyuksayi {
    public static void main(String[] args) {

       /* Soru-39)
        Bir tamsayı dizisini (Int Array) girdi olarak kabul eden ve verilen
        bu (Arrayden) diziden minimum ve maksimum sayıları yazdıran bir yöntem yazın
        Örnek:
        Input : {3,2,5,4,1,6}
        Output :
        min: 1
        max: 6
        Ipucu: sort yöntemni kullanabilirsiniz.

        */

        int [] input= {3,2,5,4,1,6};

        enBuyukEnKucukSayilar(input);

    }

    public static  void enBuyukEnKucukSayilar(int[] input) {

       int min=input[0];
       int max=input[0];

        for (int i = 0; i <input.length ; i++) {

            if (input[i] > max) {
                max = input[i];

            }
            if (input[i] < max) {
                min = input[i];
            }
        }
        System.out.println("min: "+ min);
        System.out.println("max: "+ max);

    }
}
