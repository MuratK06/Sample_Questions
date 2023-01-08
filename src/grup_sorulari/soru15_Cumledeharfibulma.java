package grup_sorulari;

import java.util.Scanner;

public class soru15_Cumledeharfibulma {
    public static void main(String[] args) {

        /*Soru 15- Kullanicidan bir cumle ve bir harf alin, harf cumlede kullanilmissa kac kere
kullanildigini yazdirin, kullanilmadiysa “harf cumlede kullanilmamis” yazdirin
    */

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir cumle giriniz: ");
        String cumle= scan.nextLine();
        System.out.println("Bir harf giriniz: ");
        String harf= scan.nextLine();

        String []cumleArr=cumle.split("");

        int sayac=0;

        for (String eachharf:cumleArr) {
            if (eachharf.equals(harf)){
                sayac++;
            }

        }
        if (sayac==0){
            System.out.println(harf+ " harfi cumlede kullanilmamis.");
        }else {
            System.out.println(harf+ " harfi cumlede "+sayac+ " defa kullanilmis.");
        }


    }
}
