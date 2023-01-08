package grup_sorulari;

public class soru9_enuzunkelimeyazdirma {
    public static void main(String[] args) {

        /*Soru 9- Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran bir method
          olusturun

         */

        String [] isimler={"Vedat","Cem", "Busra","Ali" ,"Korkmaz", "Esslingen", "Deutschland"};

        enuzun_kisaisimler(isimler);



    }

    private static void enuzun_kisaisimler(String[] isimler) {

        String enuzunisim=isimler[0];
        String enkisaisim=isimler[0];

        for (int i = 0; i < isimler.length ; i++) {
            if (isimler[i].length()>enuzunisim.length()){
                enuzunisim=isimler[i];
            }
            if (isimler[i].length()< enkisaisim.length()){
                enkisaisim=isimler[i];
            }


        }
        System.out.println("en kisa isim: "+enkisaisim);
        System.out.println("en uzun isim: "+enuzunisim);
    }
}
