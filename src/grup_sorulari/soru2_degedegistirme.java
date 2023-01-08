package grup_sorulari;

import java.util.Scanner;

public class soru2_degedegistirme {
    public static void main(String[] args) {

         /* Soru 2 (Interview)- Kullanicidan iki sayi alip, ucuncu bir degisken kullanmadan ikisinin
            degerlerini degistirin(swap)
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen sayi1'i giriniz: ");
        int sayi1=scan.nextInt();
        System.out.println("Lutfen sayi2'yi giriniz: ");
        int sayi2=scan.nextInt();

        sayi1=sayi2+sayi1; // buralari anlamdim
        sayi2=sayi1-sayi2;
        sayi1=sayi1-sayi2;
        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);
    }
}
