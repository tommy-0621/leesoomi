package pratice.ch05;

public class Main {

    public static void main(String[] args) {
        //싱글톤 패턴 적용하기
        // Singleton s1 = new Singleton(); 컴파일 에러 발생: private 생성자이므로 외부에서 객체 생성 불가
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();

        if (s2 == s3) {
            System.out.println("s2와 s3는 같은 Singleton 객체입니다.");
        } else {
            System.out.println("s2와 s3는 다른 Singleton 객체입니다.");
        }

        System.out.println("s2의 값: " + s2);
        System.out.println("s3의 값: " + s3);

        //Singleton2 적용하기
        Singleton2 s4 = Singleton2.INSTANCE; //Singleton2 객체 얻기
        s4.hello(); //Sibgleton2 객체의 메소드 활용
    }
}
