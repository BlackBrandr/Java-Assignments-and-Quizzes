public class Q2 {

    public static void main(String[] args) {

        String s1 = "Welcome to Java after Python";
        String s2 = s1;
        String s3 = new String("Welcome to Java after Python");
        String s4 = " Welcome to Java after Python";

        boolean b1=true;
        boolean b2=false;

        //Result of 1

        if(s1 == s2){
            System.out.println("(1) s1 == s2"+ " " + "===>" + " " + b1);
        } else {
            System.out.println("(1) s1 == s2" + " " + "===>" + " " +b2);
        }

        //Result of 2

        if(s2 == s3){
            System.out.println("(2) s2 == s3"+ " " + "===>" + " " + b1);
        } else {
            System.out.println("(2) s2 == s3" + " " + "===>" + " " +b2);
        }

        //Result of 3

        if(s1.equals(s2)){
            System.out.println("(3) s1.equals(s2)"+ " " + "===>" + " " + b1);
        } else {
            System.out.println("(3) s1.equals(s2)" + " " + "===>" + " " +b2);
        }

        //Result of 4

        if(s2.equals(s3)){
            System.out.println("(4) s2.equals(s3)"+ " " + "===>" + " " + b1);
        } else {
            System.out.println("(4) s2.equals(s3)" + " " + "===>" + " " +b2);
        }

        //Result of 5

        System.out.println("(5) s1.compareTo(s2)"+ " " + "===>" + " " + s1.compareTo(s2));

        //Result of 6

        System.out.println("(6) s2.compareTo(s3)"+ " " + "===>" + " " + s2.compareTo(s3));

        //Result of 7

        if(s1 == s4){
            System.out.println("(7) s1 == s4"+ " " + "===>" + " " + b1);
        } else {
            System.out.println("(7) s1 == s4" + " " + "===>" + " " +b2);
        }

        //Result of 8

        char ch = s1.charAt(0);
        System.out.println("(8) s1.charAt(0)"+ " " + "==>" + " " + ch);

        //Result of 9

        int index1 = s1.indexOf("j");
        System.out.println("(9) s1.indexOf(j)"+ " " + "==>" + " " + index1);

        //Result of 10

        int index2 = s1.indexOf("to");
        System.out.println("(10) s1.indexOf(to)"+ " " + "==>" + " " + index2);

        //Result of 11

        int index3 = s1.lastIndexOf("a");
        System.out.println("(11) s1.lastIndexOf(a)"+ " " + "==>" + " " + index3);

        //Result of 12

        int index4 = s1.lastIndexOf("o",15);
        System.out.println("(12) s1.lastIndexOf(o,15)"+ " " + "==>" + " " + index4);

        //Result of 13

        System.out.println("(13) s1.length()"+ " " + "===>" + " " + s1.length());

        //Result of 14

        System.out.println("(14) s1.substring(5)"+ " " + "===>" + " " + s1.substring(5));

        //Result of 15

        System.out.println("(15) s1.substring(5,11)"+ " " + "===>" + " " + s1.substring(5,11));

        //Result of 16

        System.out.println("(16) s1.startsWith(Wel)"+ " " + "===>" + " " + s1.startsWith("Wel"));

        //Result of 17

        System.out.println("(17) The last word in s1"+ " " + "===>" + " " + s1.substring(s1.lastIndexOf(" ")+1));
    }
}

