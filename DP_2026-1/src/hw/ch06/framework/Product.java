package hw.ch06.framework;

public abstract class Product implements Cloneable {
    public abstract void use(String s);

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