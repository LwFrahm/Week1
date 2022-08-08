

public class Arrays {

    static String Arrays1(String x) {
        return new StringBuilder(x).reverse().toString();
    }



    public static void main(String[] args) {

        int [] a = {1,2,3,4,5,6,7,8,9,10};

        String [] b = {" Luke ", " Henry ", " Lenny ", " Leo "};

          for (int i = 9; i >=0; i--) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int j = 3; j>=0; j--) {
            System.out.println(Arrays1(b[j]));
        }


    }

}
