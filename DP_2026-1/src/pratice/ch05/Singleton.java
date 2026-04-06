package pratice.ch05;

//싱글톤 패턴 적용하기
public class Singleton {
    //(3) Singleton 객체를 미리 하나 만들어 둠. 반드시 static으로 선언해야 함-> 클래스가 메모리에 올라갈 때 Singleton 객체도 같이 만들어짐
    // 클래스가 로딩될때 Singleton 객체가 하나 만들어짐
    private static Singleton singleton = new Singleton();
    
    //(1) 생성자를 private으로 함
    private Singleton() {
        System.out.println("Singleton 객체가 생성되었습니다.");
    }

    //(2) Singleton 객체를 얻어갈 수 있는 메소드를 정의함
    public static Singleton getInstance() {
        return new Singleton();
    }
} 
