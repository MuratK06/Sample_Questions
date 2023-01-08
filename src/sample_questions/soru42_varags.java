package sample_questions;

public class soru42_varags {
    public static void main(String[] args) {

       /* Soru 42-)
        Parametre olarak birden fazla tamsayı (integer) kabul eden ve bu integer sayıların toplamını yazdıran bir dönüş methodu (void) yazın
        Method name=sum
        eğer metodu bu şekilde çağırırsanız

        toplam(1,2,3) çıktı =6
        toplam(1,2,3,4,5) çıktı =15
        sum(1,2) output=3
        Ipucu:  varargs sorusu, varargs olusturalım
        */


        sum(1,3,5,6,7);
    }

    private static void sum(int i, int i1, int i2, int i3, int i4) {
        System.out.println("5 Sayinin toplami:"+ (i+i1+i2+i3+i4));
    }
}
