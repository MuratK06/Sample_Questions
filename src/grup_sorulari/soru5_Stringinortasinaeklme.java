package grup_sorulari;

import java.util.Scanner;

public class soru5_Stringinortasinaeklme {
    public static void main(String[] args) {

        /*  Soru 5: Kullanicidan alinan bir String alin, String’in uzunlugu cift sayi ise tam ortasina
:) ekleyin, String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :(
    yazdirin

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz: ");
        String cumle= scan.nextLine();
        int lengtorta=cumle.length()/2;

        if (cumle.length()%2==0){
            System.out.println(cumle.substring(0,lengtorta)+ ":)");

        }else {
            System.out.println(cumle.substring(0,lengtorta)+":( ");
        }


    }
}
