import java.util.Scanner;
import java.lang.Math;

public class Q1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Select Operation:" + "\n");
        System.out.print("1: Addition" + "\n");
        System.out.print("2: Subtraction" + "\n");
        System.out.print("3: Multiplication" + "\n");
        System.out.print("4: Division" + "\n");
        System.out.print("5: Remainder" + "\n");
        System.out.print("6: Power" + "\n");
        System.out.print("6: Power" + "\n");
        System.out.print("6: Exit" + "\n");

        System.out.print("Enter a choice: ");
        String operation = in.nextLine();
        System.out.print("Operation is = " + operation + "\n");

        System.out.print("Input first number: ");
        int num1 = in.nextInt();

        System.out.print("Input second number: ");
        int num2 = in.nextInt();

        if (operation.equals("a")){

            System.out.println("Result of " + num1 + " + " + num2 + " = " +
                    (num1 + num2));
        }

        if (operation.equals("s")){

            System.out.println("Result of " + num1 + " - " + num2 + " = " +
                    (num1 - num2));
        }

        if (operation.equals("m")){

            System.out.println("Result of " + num1 + " * " + num2 + " = " +
                    (num1 * num2));
        }

        if (operation.equals("d")){

            System.out.println("Result of " + num1 + " / " + num2 + " = " +
                    (num1 / num2));
        }

        if (operation.equals("r")){

            System.out.println("Result of" + num1 + " % " + num2 + " = " +
                    (num1 % num2));
        }

        if (operation.equals("p")){

            System.out.println("Result of" + num1 + "  " + num2 + " = " +
                    Math.pow(num1, num2));
        }
    }
}
