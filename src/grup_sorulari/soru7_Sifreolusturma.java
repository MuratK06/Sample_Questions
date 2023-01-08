package grup_sorulari;

import java.util.Scanner;

public class soru7_Sifreolusturma {
    public static void main(String[] args) {

        /* Soru 7- Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore
    kontrol edin ve sifredeki hatalari yazdirin.
    Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli
    sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.
- Sifre kucuk harf icermelidir
- Sifre buyuk harf icermelidir
- Sifre ozel karakter icermelidir
- Sifre en az 8 karakter olmalidir
    */


        // bu soru tam cozulmedi

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Lutfen sifrenizi giriniz: ");
            String sifre = scan.nextLine();

            boolean kucukharficermeli=false;
            boolean buyukharficermeli=false;
            boolean ozelkarektericermeli=false;
            boolean enazsekizkarekterolmali=sifre.length()>=8;


            for (int i = 0; i <sifre.length() ; i++) {
                char chr=sifre.charAt(i);

                if (kucukharficermeli && buyukharficermeli &&
                        ozelkarektericermeli && enazsekizkarekterolmali){
                    System.out.println("sifreniz basariyla olusturuldu. ");break;
                }

                else if (Character.isLowerCase(chr)) {
                    kucukharficermeli = true;
                    System.out.println("sifre kucuk harf icermeli");

                }else if (Character.isUpperCase(chr)){
                        buyukharficermeli=true;
                    System.out.println("sifre buyuk harf icermeli");
                        
                } else if (Character.isLetterOrDigit(chr)) {
                    ozelkarektericermeli=true;
                    System.out.println("sifre ozel karekter icermeli");
                } else if (sifre.length()<8) {
                    System.out.println("sifre en az 8 karekter olmali");

                }

            }

        }

    }
}
