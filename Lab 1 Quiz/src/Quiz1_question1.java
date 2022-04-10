import java.util.Scanner;

public class Quiz1_question1 {

    public static void main(String[] args) {
        // take two number input
        int num1, num2;
        System.out.println("please enter numbers: ");
        Scanner s = new Scanner(System.in);
        num1 = s.nextInt();
        num2 = s.nextInt();

        // multiply with 2 first number
        int result_1;
        result_1 = num1 * 2;

        // multiply with 3 second number
        int result_2;
        result_2 = num2 * 3;

        // sum of first two results
        int result_3;
        result_3 = result_1 + result_2;

        System.out.println("addition results is: " + result_3);


    }

}
