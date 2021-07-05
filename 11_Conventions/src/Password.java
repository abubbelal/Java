public class Password {

    private static final int key = 7845156;
    private final int encrypted;

    public Password(int password) {
        this.encrypted = encryptDecrypt(password);
    }

    private int encryptDecrypt(int password) {
        return password ^ key; // XOR
    }

    public final void storePassword() {
        System.out.println("Saving password as " + this.encrypted);
    }

    public boolean letMeIn(int password) {
        if(encryptDecrypt(password) == this.encrypted) {
            System.out.println("Welcome");
            return true;
        }else {
            System.out.println("No! you cannot get in");
            return false;
        }
    }
}
