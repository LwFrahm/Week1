import java.util.*;

public class FlowControl {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int grade = scan.nextInt();

        if (grade > 90) {
            System.out.println("Grade = A. Congrats");
        } else if (grade > 80)  {
            System.out.println("Grade = B. Good Job.");
        } else if (grade > 70 ) {
            System.out.println("Grade is = C. Average Score.");
        } else if (grade > 65 ) {
            System.out.println("Grade is D. You can do better.");
        } else {
            System.out.println("Grade is F. Fail.");
        }
    }
}
