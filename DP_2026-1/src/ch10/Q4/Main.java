package ch10.Q4;

import java.util.*;

class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("D", "B", "C", "E", "A");

        // 사전순으로 작은 순서 (오름차순)
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //o1과 o2를 비교
                return o1.compareTo(o2);  //o1이 더 클 때 양수가 리턴되고, 위치가 바뀌게 됨 => 큰게 뒤로가게 됨 - 오름차순
               
            }
         } ); //Comparator 객체를 넣어주어야함
        System.out.println(list);

        list.sort((o1, o2) -> o1.compareTo(o2)); //람다식

        // 사전순으로 큰 순서 (내림차순)
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //o1과 o2를 비교
                return o2.compareTo(o1); //o2가 더 클 때 양수가 리턴되고, 위치가 바뀌게 됨 => 큰게 앞으로 가게 됨 - 내림차순
               
            }
         } ); //Comparator 객체를 넣어주어야함
        System.out.println(list);
    }
}
