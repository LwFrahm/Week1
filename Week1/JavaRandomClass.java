import java.util.Random;

import java.util.Scanner;

public class JavaRandomClass {



    public static void main(String[] args) {

        int x;
        Scanner scan = new Scanner(System.in);
        x = scan.nextInt();



        Random random = new Random();

        System.out.println(random.nextDouble());
        System.out.println(random.nextInt(-100, -1));
        System.out.println(random.nextInt()); // 0 to 2,147,483,647
        System.out.println(random.nextInt(x));
    //    System.out.println(random.nextInt(50, x  ));
        System.out.println();
        int a;
        int b;
        a = random.nextInt();
        b = random.nextInt();
        if (a > 1500000) {
            System.out.println("Rock");
        } else if (a < 1500000 && a > 750000)   {
            System.out.println("Scissors");
        } else {
            System.out.println("Paper");
        }

        if (b > 1500000) {
            System.out.println("Rock");
        } else if (b < 1500000 && b > 750000) {
            System.out.println("Scissors");
        } else {
            System.out.println("Paper");
        }


    }

}
