package StackCall;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

    /**
     * Stack Trace and Call Stack
     *
     * A stack trace prints out a call stack - which is a list of all the method calls at any particular point in a
     * program's execution where it crashed. Each thread of execution has it's own call stack and the thread is shown
     * as the first line of the stack trace.
     *
     * A common method of making sense of the call stack is to start at the bottom and work up.
     */

    public static void main(String[] args) {
        try {
            int result = divide();
            System.out.println(result);
        } catch (ArithmeticException | NoSuchElementException e) { //can catch multiple type exception in one line
            System.out.println(e.toString());
            System.out.println("Unable to perform division, autopilot shutting down");
        }
    }

    private static int divide() {
        int x, y;
//        //check for suitable integer, and denominator isn't 0
//        try {
            x = getInt();
            y = getInt();
            System.out.println("x: " + x + ". y: " + y);
            return x / y;
//        } catch (NoSuchElementException e) {
//            throw new ArithmeticException("No suitable input");
//        } catch(ArithmeticException e) {
//            throw new ArithmeticException("Attempt to divide by zero");
//        }
    }

    private static int getInt() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an integer ");
        while(true) {
            try {
                return s.nextInt();
            } catch(InputMismatchException e) {
                // go round again.  Read past the end of line in the input first
                s.nextLine();
                System.out.println("Please enter a number using only the digits 0 to 9 ");
            }
        }
    }
}
