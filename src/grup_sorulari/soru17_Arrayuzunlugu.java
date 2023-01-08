package grup_sorulari;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class soru17_Arrayuzunlugu {
    public static void main(String[] args) {

        /*Soru 17- Verilen String bir array’deki her bir elementi kontrol edip,
- Kelimenin uzunlugu cift sayi ise ilk yarisini
- Kelimenin uzunlugu tek sayi ise ortadaki harf dahil ikinci yarisini
yeni bir listeye ekleyip yazdirin
     */

        String [] arr={"persembe"};

        List<String>yeniarr=new ArrayList<>();

        for (String eacharr:arr) {
            if (eacharr.length()%2==0) {
                System.out.println(Arrays.toString(eacharr.substring(0, eacharr.length() / 2).toCharArray()));
            }else {
                System.out.println(Arrays.toString(eacharr.substring(eacharr.length()/2).toCharArray()));
            }
            
        }


    }
}
