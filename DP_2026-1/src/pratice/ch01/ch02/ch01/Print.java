package pratice.ch01.ch02.inheritance;


//클라이언트가 원하는 인터페이스, 필요로하는 인터페이스, Target 인터페이스
public interface Print {
    public abstract void printWeak(); //문자열을 약하게 표시(괄호로 감싸서)하는 메소드
    public abstract void printStrong(); //문자열을 강하게 표시(별표로 감싸서)하는 메소드
}
