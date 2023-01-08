package grup_sorulari;

public class soru11_ArraySonElementlerToplama {
    public static void main(String[] args) {
        /*
    Soru 11- Verilen 2 katli bir array’de her bir inner array’in son elementlerinin
toplaminini yazdiran bir method olusturun
     */

        int[][] arr = {{2,4,6}, {5,6,2}};

        topla(arr);
    }

    private static void topla(int[][] arr) {
        int toplam=0;
        for (int [] icArray:arr) {
            toplam+=icArray[icArray.length-1];

        }
        System.out.println("Son Arrylarin Toplami: " +toplam);




        }


}
