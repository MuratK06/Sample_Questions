package sample_quenstionsss_30Dezember;

import java.util.Scanner;

public class b {
    /*
    Constructor Sorusu-
1. Aşama: Başlangıçta İlk Oyuncuya oyunu başlatmak için bir kelime girmesini iste.
2. Aşama: Sonra oyuncuyu degiştir ve ikinci oyuncuya geç. Yeni oyuncuya verilen kelimenin geçerli olup olmadıgını sor
   2.1) Eğer yeni oyuncu verilen kelimeyi kabul ederse : kelimeyi yazan oyuncuya puan olarak kelimedeki harf sayısını ekleyin ve 3. adıma gidin
  2.2) Eğer yeni oyuncu verilen kelimeyi	geçerli olarak kabul etmesse "Geçersiz kelime, oyuncu X(Mevcut oyuncu) oyunu kazandı" yazıp oyunu bitirin.
3. Aşama: Kullanıcılara oyuna devam etmek isteyip istemediklerini sor: Eğer devam etmek isterlerse:
  3.1) Kullanıcıdan kelimeye eklemek için bir harf isteyin
  3.2) Ve kullanıcıya hangi tarafa eklemek istedigini sorun (Başa veya Sona)
  3.3) Daha sonra harfi kelimeye ekleyin ve 2.Aşamaya geçin Eğer devam etmek istemezlerse: "Game Finished" yazdırın.

Puanları ve kazananı ekrana yazdırın
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Birinci oyuncu lutfen bir kelime giriniz");
        String oyuncu1Kelime = sc.next();
        System.out.println("Birinci oyuncunun girdigi kelimeyi kabul ediyorsan e  kabul etmiyorsan h ye bas");
        char yesOrNo = sc.next().toLowerCase().charAt(0);
        int birinciOyuncuPoint = 0;
        int ikinciOyuncuPoint = 0;
        System.out.println("Birinci oyuncunun girdigi kelime = " + oyuncu1Kelime);
        if (yesOrNo == 'h') {
            System.out.println("Gecersiz kelime,ikinci oyuncu oyunu kazandi");
        } else {
            birinciOyuncuPoint += oyuncu1Kelime.length();
            System.out.println("Oyuna devam etmek istiyorsaniz e ye bitirmek istiyorsaniz h ye basiniz:");
            yesOrNo = sc.next().toLowerCase().charAt(0);
            if (yesOrNo =='e') {
                while (yesOrNo == 'e') {

                    System.out.println("Lutfen birinci oyuncunun girdigi kelimeye eklemek uzere bir harf giriniz:");
                    char eklenecekHarf = sc.next().charAt(0);
                    System.out.println("Lutfen harfin nereye eklenecegini soyleyin basa veya sona diye yazin:");
                    String basSon = sc.next().toLowerCase();
                    if (basSon.equals("basa")) {
                        System.out.println("kelimenizin son hali= " + eklenecekHarf + oyuncu1Kelime);
                    } else {
                        System.out.println("kelimenizin son hali= " + oyuncu1Kelime + eklenecekHarf);
                    }
                    System.out.println("Oyuna devam etmek istiyorsaniz e ye bitirmek istiyorsaniz h ye basiniz:");
                    yesOrNo = sc.next().toLowerCase().charAt(0);
                    if(yesOrNo=='e'){
                        continue;
                    }else{
                        System.out.println("Game Finished");
                        break;
                    }
                }
            }else{
                System.out.println("Game Finished");

            }
        }

    }
}


