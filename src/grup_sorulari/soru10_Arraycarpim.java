package grup_sorulari;

public class soru10_Arraycarpim {
    public static void main(String[] args) {

        /*
    Soru 10- Verilen 2 katli bir array’de bulunan tum sayilarin carpinini bize donduren bir
method olusturun
     */
        int[][] arr = {{2,2,2}, {2,2,2}};

        System.out.println(Arraycarpim(arr));

    }

    private static int Arraycarpim(int[][] arr) {
        int carpim=1;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                carpim*=arr[i][j];

            }

        }
        return carpim;
    }
}
