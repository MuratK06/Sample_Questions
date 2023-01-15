package grup_sorulari;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class tambolenler {
    public static void main(String[] args) {


        /*
    Soru 14- Kullanicidan pozitif bir tamsayi alip, o tamsayiyi tam bolebilen tum pozitif
tamsayilari bir liste olarak bize donduren bir method olusturun
     */

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir tamsayi giriniz:");
        int sayi= scan.nextInt();
        //int tambolen=1;

        System.out.println(tambolensayilarr(sayi));
    }

    private static List<Integer> tambolensayilarr(int sayi) {
        List<Integer> tambolenlist=new ArrayList<>();

        for (int i = 1; i <=sayi ; i++) {

            if (sayi%i==0){
                tambolenlist.add(i);
            }

        }
        return tambolenlist;
    }
}
