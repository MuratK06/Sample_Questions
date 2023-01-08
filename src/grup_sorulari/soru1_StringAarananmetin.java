package grup_sorulari;

import java.util.Scanner;

public class soru1_StringAarananmetin {
    public static void main(String[] args) {

        //Soru 1 : Kullanicidan bir String ve aranacak metin alin. String’in aranan metni
        //icerip icermedigini indexOf( ) method’u kullanarak yazdirin.//Soru 1 : Kullanicidan bir String ve aranacak metin alin. String’in aranan metni
        //    //icerip icermedigini indexOf( ) method’u kullanarak yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz: ");
        String girilencumle= scan.nextLine().toLowerCase();
        System.out.println(" Aranacak metni giriniz: ");
        String aranacakmetin= scan.nextLine();

        if (!girilencumle.contains(aranacakmetin)){
            System.out.println("Aranan metin cumlede yok");

        }else {
            int aranacakmetinindexi=girilencumle.indexOf(aranacakmetin);
            int boslukindexi=girilencumle.indexOf(" ",aranacakmetinindexi);

            System.out.println("Tekrarlanan metin: "+ girilencumle.substring(aranacakmetinindexi,boslukindexi));
        }
    }
}
