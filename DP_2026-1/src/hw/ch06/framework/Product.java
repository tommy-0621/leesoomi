package hw.ch06.framework;

public abstract class Product implements Cloneable {

    // 추상 메소드 (각 클래스에서 구현)
    public abstract void use(String s);

    // 복제 메소드 (공통)
    public Product createCopy() {
        Product p = null;
        try {
            p = (Product) this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}