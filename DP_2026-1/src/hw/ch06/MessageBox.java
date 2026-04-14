package hw.ch06;

import hw.ch06.framework.Product;

public class MessageBox extends Product {
    private char decochar;

    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    @Override
    public void use(String s) {
        int decolen = s.length() + 4;

        for (int i = 0; i < decolen; i++) {
            System.out.print(decochar);
        }
        System.out.println();

        System.out.println(decochar + " " + s + " " + decochar);

        for (int i = 0; i < decolen; i++) {
            System.out.print(decochar);
        }
        System.out.println();
    }
}