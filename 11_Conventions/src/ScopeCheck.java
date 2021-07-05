public class ScopeCheck {

    public int publicVar = 0;
    private int var1 = 1;

    public ScopeCheck() {
        System.out.println("Scope check created, publicVar = " + publicVar + ". private var = " + var1);
    }

    public int getVar1() {
        return var1;
    }

    public void timesTwo() {
        int var2 = 2;
        for(int i = 0; i<10; i++) {
            System.out.println(i + " times two is " + i * var2);
        }
    }

    /**
     * Inner class has access to all the member variables in it's outer class.
     * They are all visible. and the same is true the other way around. the outer
     * class has access to the member variables of the inner class, even if they
     * are marked private.
     */
    public void userInner() {
        InnerClass innerClass = new InnerClass();
        System.out.println("var3 from outer class: " + innerClass.var3);
    }

    public class InnerClass {
        private int var3 = 3;

        public InnerClass() {
            System.out.println("Innerclass created, private var = " + var3 + " and var 1 = " + var1);
        }

        public void timesTwo() {
            for(int i = 0; i<10; i++) {
                System.out.println(i + " times two is " + i * var3);
            }
        }

        public void print() {
            System.out.println(this.var3); // the this keywork will refer to the innerclass
            System.out.println(ScopeCheck.this.var1); //this will refer to the wrap class that this innerclass resides in

        }
    }
}
