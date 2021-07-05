package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /**
         * Input/Output (I/O)
         * Many methods used for I/O are required to handle exceptions
         *
         * There are two main approaches to handling these exceptions:
         *
         * - LBYL --> Look Before You Leap
         * - EAFP --> Easy to Ask for Forgiveness then Permission
         *
         * In Java LBYL is more common, while the other approach is to go ahead and perform an operation
         * then respond to an exception.
         *
         * Trapping and handling exceptions is pretty simple: use a try-catch block. Deciding on which exceptions is
         * more tricky.
         */

//        int x = 98;
//        int y = 0;
//        System.out.println(divideLBYL(x, y));
//        System.out.println(divideEAFP(x, y));
//        System.out.println(divide(x, y)); //this will crash

        int x = getIntEAFP();
        System.out.println("x: " + x);

    }

    private static int getIntEAFP() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        try {
            return s.nextInt();
        } catch(InputMismatchException e) {
            return 0;
        }
    }

    private static int getInt() {
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }

    private static int getIntLBYL() {
        Scanner s = new Scanner(System.in);
        boolean isValid = true;
        System.out.println("Please enter an integer: ");
        String input = s.next();
        for(int i = 0; i < input.length(); i++) {
            if(!Character.isDigit(input.charAt(i))){
                isValid = false;
                break;
            }
        }

        if(isValid) {
            return Integer.parseInt(input);
        }
        return 0;
    }

    private static int divideLBYL(int x, int y) {
        if(y != 0) {
            return x / y;
        } else {
            return 0;
        }
    }

    private static int divideEAFP(int x, int y) {
        try {
            return x / y;
        } catch (ArithmeticException e) {
            return 0;
        }
    }

    private static int divide (int x, int y) {
        return x / y;
    }
}
