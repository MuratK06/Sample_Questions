package sample_questions;

import java.util.Scanner;

public class soru44_ogrecibilgileri {
    public static void main(String[] args) {
        /*
        Soru 44-)
Main methodda ögrenci bilgileri oluşturun ve bu verileri kullanın.
Changename adında bir method oluşturun, parametre olarak öğrenci bilgileri alın
ve methodda tüm bilgileri değiştirin ve yeni bilgileri ekleyip yazdırın.
Main Methoddaki Rename methodunu çağırdığımız satırda öğrenci bilgilerini tekrardan yazdırın
Changesurname adlı bir method oluşturun , bu method lastname'i parametre olarak alsın.
Methodda kullanıcıya yeni bir lastname sorulsun ve eski lastname degiştirilsin.

         */

        String isim= "Lionel";
        String soyisim= "Messi";
        String sinif= "12-A";
        int yas=34;

        Changename( isim,soyisim,sinif,yas);
        Changesurname(soyisim);

    }

    private static void Changename(String isim, String soyisim, String sinif, int yas) {

        isim= "Kylian";
        soyisim= "Mbappe";
        sinif= "11- A";
        yas=23;
        //String yenisoyisim="";

        System.out.println("Isim: "+isim+"\nSoyisim: "+ soyisim+ "\nSinif: "+ sinif+ "\nYas: "+yas);
        System.out.println("Isim: "+isim+"\nSoyisim: "+Changesurname(soyisim) + "\nSinif: "+ sinif+ "\nYas: "+yas);

    }
    private static String Changesurname(String soyisim) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Yeni soyisminizi giriniz: ");

        return soyisim= scan.next();
    }
}
