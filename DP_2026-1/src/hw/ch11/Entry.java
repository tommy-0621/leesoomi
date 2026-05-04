package hw.ch11;

import java.util.List;

public abstract class Entry {
    // 부모 엔트리 참조
    private Entry parent = null;

    // 이름을 얻는다
    public abstract String getName();

    // 크기를 얻는다 
    public abstract int getSize();

    // 목록을 표시한다
    public void printList() {
        printList("");
    }

    // prefix를 앞에 붙여서 목록을 표시한다 
    protected abstract void printList(String prefix);

    // 문자열 표시 
    @Override
    public String toString() {
        return getName() + " (" + getSize() + ")";
    }

    // search 메서드 추가
    public abstract List<Entry> search(String keyword);

    // 부모 설정
    public void setParent(Entry parent) {
        this.parent = parent;
    }

    // 부모 가져오기
    public Entry getParent() {
        return parent;
    }

    // 전체 경로 얻기
    public String getFullName() {
        StringBuilder sb = new StringBuilder();
        Entry current = this;

        while (current != null) {
            sb.insert(0, "/" + current.getName());
            current = current.getParent();
        }

        return sb.toString();
    }
}