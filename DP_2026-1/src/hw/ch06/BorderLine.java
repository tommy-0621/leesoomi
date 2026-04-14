package hw.ch06;

import hw.ch06.framework.Product;

public class BorderLine extends Product {
    private char borderChar;

    // 생성자
    public BorderLine(char borderChar) {
        this.borderChar = borderChar;
    }

    // 핵심 기능
    @Override
    public void use(String s) {
        int length = s.length();

        // 위쪽 라인
        for (int i = 0; i < length; i++) {
            System.out.print(borderChar);
        }
        System.out.println();

        // 텍스트 출력
        System.out.println(s);

        // 아래쪽 라인
        for (int i = 0; i < length; i++) {
            System.out.print(borderChar);
        }
        System.out.println();
    }

    // Prototype 핵심 (복제)
    @Override
    public Product createCopy() {
        Product p = null;
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}