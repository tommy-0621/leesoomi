package hw.ch04;

public class IDCard extends Product {
    private String owner;
    private int serial;
    private String issuedDate;

    public IDCard(String owner, int serial, String issuedDate) {
        this.owner = owner;
        this.serial = serial;
        this.issuedDate = issuedDate;
        System.out.println(owner + "의 카드를 " + serial + "번으로 만듭니다.");
    }

    @Override
    public void use() {
        System.out.println(toString() + " 을 사용합니다.");
    }

    @Override
    public String toString() {
        return "[IDCard:" + owner + "(" + serial + ")] - 발급일: " + issuedDate;
    }

    public String getIssuedDate() {
        return issuedDate;
    }
}