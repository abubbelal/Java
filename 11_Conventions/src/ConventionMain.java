import com.Series;

import java.util.Scanner;

public class ConventionMain {
    public int multiplier = 7;

    public int multiply(int number) {
        return number * multiplier;
    }

    /**
     *
     * Naming conventions help us read our code better. We can name packages, classes,
     * interfaces, methods, constants, variables, type parameters.
     *
     * Packages allows programmers to group appropriate files together, without any confusion.
     * Renaming classes, interfaces, methods, etc is very common and one way to work around this
     * is to group these files into a common package. And when needed we can import the package
     * we are referring to or prepend the package name to the file.
     *
     *
     * SCOPE:
     *      refers to the availability. this applies to variables, methods, class, etc.
     *      Where can a variable apply itself.
     *
     * Visibility:
     *      visibility is governed by the access modifier; private, public, protected.
     *
     * Access Modifiers:
     *
     * Access control is granted both at the top level or at the member level. At the top level
     * you can make your class or interface public or packaged private (protected). Cannot define
     * a private class.
     *
     * At the top level only classes, interfaces and enums can exist. Everything else must be included
     * within one of these.
     *
     *
     *      Private:
     *          Private member fields are only visible within the class it is declared in. It is not
     *          visible anywhere else (including subclasses of its class).
     *
     *      Public:
     *          The object is visible to all classes everywhere, whether they are in the same package or
     *          have imported the package containing the public class.
     *
     *          Public member has the same meaning as at the top level. Public member field and method can
     *          be accessed from any other class anywhere, even in different packages.
     *
     *      Protected:
     *          Also referred to as packaged private -- the object is only available within it's own (and
     *          is visible to every class within the same package). Package-private is specified by not
     *          specifying, ie.e it is the default if you do not specify public. There is not a package-
     *          private keyword.
     *
     *          For member level this also has the same meaning as the top level. An object with no access
     *          modifier is visible to every class within the same package (but not to classes in external
     *          packages). For protected it is also visible in another package if it's in the subclass.
     *
     *
     * The "static" statement
     *      A static field is associated with the class itself rather than the instance of the class. there
     *      exists only one copy of the field and all instances share that same copy.
     *
     *      The static constructors of a class are always called prior to its normal constructor.
     *
     * There's nothing to prevent  static method from accessing nonstatic fields and methods in another class
     * because it creates an instance of a class in order to do so.
     *
     * Now the restriction is purely on a static method access non-static methods and fields in its own class.
     *
     * The "final" keyword
     *
     *      final fields are not actually constants, because they can still be modified but only once. And any
     *      modification must be performed before the class constructor finishes.
     *
     *  The final keyword prevents a class from being extended as well.
     *
     */

    public static void main(String[] args) {
        System.out.println("**********SUM***********");
        for(int i = 0; i <= 10; i++) {
            System.out.println(Series.nSum(i));
        }

        System.out.println("**********FACTORIAL***********");
        for(int i = 0; i <= 10; i++) {
            System.out.println(Series.factorial(i));
        }

        System.out.println("**********FIBONACCI***********");
        for(int i = 0; i <= 10; i++) {
            System.out.println(Series.fibonacci(i));
        }


        System.out.println("######################################################################");

        String var4 = "this is private to main()";

        ScopeCheck scopeInstance = new ScopeCheck();
        System.out.println("ScopeInstance private var = " + scopeInstance.getVar1());
        System.out.println(var4); //var4 will refer to the variable decalred here and not in ScopeCheck

        scopeInstance.timesTwo();

        System.out.println("######################################################################");
        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        innerClass.timesTwo();

        scopeInstance.userInner();

//        System.out.println("Var 3 is not accessible here " + innerClass.var3); //cannot reach var3 since it's private

        X x = new X(new Scanner(System.in));
        x.x();


        System.out.println("######################################################################");

        Account john = new Account("John");
        john.deposit(1500);
        john.withdraw(200);
        john.withdraw(-30);
        john.deposit(-350);
        john.calculateBalance();

        System.out.println("Balance on account is: " + john.getBalance());

        System.out.println("######################################################################");

        System.out.println("Static Test");
        StaticTest firstInstance = new StaticTest("1st instance");
        System.out.println(firstInstance.getName() + " is instance number " + StaticTest.getNumInstances());

        StaticTest secondInstance = new StaticTest("2nd instance");
        System.out.println(secondInstance.getName() + " is instance number " + StaticTest.getNumInstances());

        StaticTest thirdInstance = new StaticTest("4rd instance");
        System.out.println(thirdInstance.getName() + " is instance number " + StaticTest.getNumInstances());
        //i can call the firstinstance.getNumInstances and it will still work because they are all sharing the same field


        /**
         * normal class fields require an instance of the class the don't acutally exist until an instance has been
         * created. Now since this main method is static, and it can be called with the class instance. So as a result
         * Java can't allow a static method to access non-static fields or methods because they don't exist when the static
         * method is called.
         *
         * A way to fix this is to make the fields static.
         */
//        int answer = multiply(6);
//        System.out.println("The answer is: " + answer);
//        System.out.println("Multiplier is: " + multiplier);.

        System.out.println("######################################################################");
        System.out.println("FINAL KEYWORD");

        SomeClass one = new SomeClass("one");
        SomeClass two = new SomeClass("two");
        SomeClass three = new SomeClass("three");

        System.out.println(one.getInstanceNumber());
        System.out.println(two.getInstanceNumber());
        System.out.println(three.getInstanceNumber());

//        one.instanceNumber = 4; //cannot change it once it's been set

      System.out.println(Math.PI);

      int pw = 4513654;
      Password pass = new Password(pw);
      pass.storePassword();

      pass.letMeIn(1234);
      pass.letMeIn(12456);
      pass.letMeIn(pw);

      Password pass2 = new ExtendedPassword(pw);
        pass2.storePassword();

        pass2.letMeIn(1234);
        pass2.letMeIn(12456);
        pass2.letMeIn(pw);


        System.out.println("######################################################################");
        System.out.println("Static Constrctor");

        System.out.println("Main Method called");
        /**
         * this class constructor will be called third. the static constructor will always be called before
         * an instance of the class is created. 
         */
        SIBTest test = new SIBTest();
        test.someMethod();
        System.out.println("Owner is: " + SIBTest.owner);
    }
}
