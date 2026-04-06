package hw.ch03;

public abstract class AbstractDisplay {
    int repeat = 5; 

    public AbstractDisplay() {}

    public AbstractDisplay(int repeat) {
        this.repeat = repeat;
    }

    public abstract void open();
    public abstract void print();
    public abstract void close();

    public final void display() {
        open();
        for (int i = 0; i < repeat; i++) {
            print();
        }
        close();
    }
}