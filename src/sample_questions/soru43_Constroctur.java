package sample_questions;

public class soru43_Constroctur {





        /*
        Soru 43-)
        Biri parametreli, diğeri parametresiz 2 constructor oluşturun.
        Bu const. kullanarak en az 2 nesne oluşturun ve konsolda bu nesnelerin özellikleri yazdırın
        Ipucu: Constructor konusunu pratik yapalım. Nesnelerin rengini adını sayısını gönderelim sonra cagırıp konsolda yazdıralım.

         */

        String marka = "";
        String model = "";
        int yil;
        int km;
        String renk;




    soru43_Constroctur(){

    }
    soru43_Constroctur(String marka,String model,int yil,int km,String renk){
        this.marka=marka;
        this.model=model;
        this.yil=yil;
        this.km=km;
        this.renk=renk;

    }
    public String toString(){

        return "Marka: "+marka+ "\nModel: "+model+ "\nYil: "+ yil+ "\nKm: "+km+"\nRenk: "+renk;
    }

    public static void main(String[] args) {
        soru43_Constroctur arabayeni1=new soru43_Constroctur();
        soru43_Constroctur arabayeni2=new soru43_Constroctur("Audi","A4",2022,0,"Beyaz");

        System.out.println("Araba yeni1: \n"+arabayeni1);
        System.out.println("======================");
        System.out.println("Araba yeni2: \n"+arabayeni2);


    }

}

