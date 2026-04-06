package pratice.ch06.Framework;

public interface Product extends Cloneable {
    public abstract void use(String s);
    public abstract Product createCopy(); //복제 메서드
}
