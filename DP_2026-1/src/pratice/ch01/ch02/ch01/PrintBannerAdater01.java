package pratice.ch01.ch02.inheritance;

//클라이언트가 원하는 인터페이스를 구현한 어댑터 클래스
public class PrintBannerAdater01 extends implements Print {  //print에 원하는 클라이언트가 적용되어있으므로 print을 구현한 어댑터 클래스
    private Banner banner;


    @Override
    public void printWeak() {
        banner.showWithParen();  //showwithparen()은 Banner 클래스의 메소드이므로 banner 객체를 이용해서 호출 //객체.showWithParen()
    }

    @Override
    public void printStrong() {
        banner.showWithAster(); //showwithAster()는 Banner 클래스의 메소드이므로 banner 객체를 이용해서 호출
    }
    
}
