package sorular.sorular;

public class soru12_kucuksayibulma {
    public static void main(String[] args) {


        /*Soru 22:
        Verilen 3 sayı içerisinden en küçük sayıyı bulup, method olarak döndüren
        java kodu yazınız.
                birinci sayı : 25
        ikinci sayı : 37
        üçüncü sayı : 29

         */

        int num1=88;
        int num2=37;
        int num3=29;

        System.out.println(KucukSayiBulma(num1, num2, num3));


    }

    private static int KucukSayiBulma(int num1, int num2, int num3) {
        int min=num1;

        if (num1<min){
            min=num1;

        }if (num2<min){
            min=num2;

        }if (num3<min){
            min=num3;
        }
        return min;
    }
}
