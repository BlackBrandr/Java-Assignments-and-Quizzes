public class Q3 {

    public static void main(String args[]) {

        System.out.println("\n\nDivided by 5 & 7: ");

        int sum = 0;

        for (int i=1; i<100; i++) {
            if (i%5==0 || i%7==0) System.out.print(i +", ");
            sum = sum + i;
        }
        System.out.println("\n");
        System.out.println("Sum of those numbers: " + sum);
    }
}
