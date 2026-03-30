package pratice.ch03;

public class Main {
    public static void main(String[] args) {
        // CharDisplay d1 = new CharDisplay('H');
        AbstractDisplay d1 = new CharDisplay('H');  //부모타입으로도 가능
        d1.display();
        d1.open();
        d1.close();

        StringDisplay d2 = new StringDisplay("Hello, world.");
        d2.display();
        
    }
    
}
