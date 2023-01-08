package sample_quenstionsss_30Dezember;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {

        /*Hesap Makinesi
     Problem Tanımı :
  Basit 4 işlem yapan bir hesap makinesi kodlayınız.

  Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayinız.
  Kullanicidan iki sayi girmesini isteyiniz.
  Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.rfr

         */



        Scanner sc = new Scanner(System.in);


        char islemDevammi;
        do {
            System.out.println("Islem yapmak istediginiz iki sayiyi giriniz: ");
            int sayi1 = sc.nextInt();
            int sayi2 = sc.nextInt();
            System.out.println(" Yapmak istediginiz islemi seciniz: +,-,/,*");
            char islem = sc.next().charAt(0);

            switch (islem) {
                case '+':
                    System.out.println("Toplama isleminin sonucu: " + (sayi1 + sayi2));
                    break;
                case '-':
                    System.out.println("Cikarma  isleminin sonucu: " + (sayi1 - sayi2));
                    break;
                case '*':
                    System.out.println("Carpma isleminin sonucu: " + (sayi1 * sayi2));
                    break;
                case '/':
                    System.out.println("Bolme isleminin sonucu: " + (sayi1 / sayi2));
                    break;
                default:
                    System.out.println("Yalnis secim yaptiniz");


            }
            System.out.println("Islemi  devam ettirmek istiyormusunuz? E/H ");
            islemDevammi = sc.next().charAt(0);

            if (islemDevammi == 'h' || islemDevammi == 'H') {
                System.out.println("Isleminiz sonlandirilmistir.");

            } else {
                continue;

            }


        }
        while (islemDevammi != 'h');
        System.out.println("---------------------");


    }



}
