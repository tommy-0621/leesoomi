package pratice.ch06;

public class Main {
    public static void main(String[] args) {
        MessageBox mbox = new MessageBox('@');
        mbox.use("Hello, world.");

        mbox.createCopy().use("Hello, world.");
    }
    
}
