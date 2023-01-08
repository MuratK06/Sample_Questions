package sample_quenstionsss_30Dezember;

import java.util.Scanner;

public class a {
    /*Hesap Makinesi
     Problem Tanımı :
  Basit 4 işlem yapan bir hesap makinesi kodlayınız.
​
  Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayinız.
  Kullanicidan iki sayi girmesini isteyiniz.
  Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char control = 'q';
        do {
            System.out.println("+ ,- , *, /  \nLutfen yapmak istediginiz aritmetik islemi belirtiniz ardindan entera basiniz");
            char calculaterName = sc.next().charAt(0);
            System.out.println("Islem yapilmasini istediginiz iki sayiyi arasinada entera basarak yaziniz");
            double sayi1 = sc.nextInt();
            double sayi2 = sc.nextInt();

            switch (calculaterName) {
                case '+':
                    System.out.println("Isleminizin sonucu = " + (sayi1 + sayi2));
                    break;
                case '-':
                    System.out.println("Isleminizin sonucu = " + (sayi1 - sayi2));
                    break;
                case '*':
                    System.out.println("Isleminizin sonucu = " + (sayi1 * sayi2));
                    break;
                case '/':
                    System.out.println("Isleminizin sonucu = " + (sayi1 / sayi2));
                    break;
                default:
                    System.out.println("I cant calculate this process");

            }
            System.out.println("Islemlerinize devam etmek icin herhangi bir tus ardindan entera basin, bitirmek isterseniz q ya ardindan entera basiniz");
            control=sc.next().toLowerCase().charAt(0);
            if(control=='q'){
                System.out.println("isteginiz uzere islemleriniz sonlandirilmistir");
            }else{
                continue;
            }
        } while (control != 'q');
    }
 //System.out.println("**********************************************");

}
