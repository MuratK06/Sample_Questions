package sample_questions;

public class Student {
    String isimSoyisim= "Busra Korkmaz";
    String cinsiyet= "kadin";
    String okul= "Schelstor";
    int yas=7;

    public Student(String isimSoyisim, String cinsiyet, String okul, int yas){

        this.isimSoyisim=isimSoyisim;
        this.cinsiyet=cinsiyet;
        this.okul=okul;
        this.yas=yas;

    }
    public String toString(){
        return "Ogrencini ismi soyismi: "+isimSoyisim+"\nCinsiyeti: "+cinsiyet+ "\nOkul: "+okul+ " "+ "\nYas: "+ yas;

    }

    public static void main(String[] args) {

    }
}

