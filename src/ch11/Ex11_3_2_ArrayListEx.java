package ch11;

import java.util.ArrayList;
import java.util.Collections;

public class Ex11_3_2_ArrayListEx {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10);
        // ★ ArrayList에는 객체만 저장가능
        // AutoBoxing에 의해 기본형이 참조형으로 자동변환된다.
        // list1.add(5); => list1.add(new Integer(5));
        list1.add(new Integer(5));
        list1.add(new Integer(4));
        list1.add(new Integer(2));
        list1.add(new Integer(0));
        list1.add(new Integer(1));
        list1.add(new Integer(3));

        ArrayList list2 = new ArrayList(list1.subList(1,4));
        print(list1, list2);

        // Collection은 인터페이스, Collections는 유틸 클래스(Ex. Math클래스와 같은)
        Collections.sort(list1);	// list1과 list2를 정렬한다.
        Collections.sort(list2);	// Collections.sort(List l)
        print(list1, list2);

        System.out.println("list1.containsAll(list2):" + list1.containsAll(list2)); // list1의 요소가 list2의 모든 요소를 포함하고 있는지?

        list2.add("B");
        list2.add("C");
        list2.add(3, "A"); // 3번 인덱스에 A를 추가하라는 것 = 기존 인덱스들 뒤로 밀림
        // add로 맨 마지막 추가가 아닌, 중간 추가는 다른 인덱스들 이동이 필요하므로 부담되는 작업이다.
        print(list1, list2);

        list2.set(3, "AA"); // 3번 인덱스를 변경
        print(list1, list2);

        list1.add(0, "1");
        print(list1, list2);
        // indexOf()는 지정된 객체의 위치(인덱스)를 알려준다.
        System.out.println("index = " + list1.indexOf("1") + " => 문자열 1");
        System.out.println("index = " + list1.indexOf(new Integer(1)) + " => Integer객체의 1");

//        list1.remove(1); // 인덱스가 1번인 객체를 삭제
        list1.remove(new Integer(1)); // == list1.remove(Integer.valueOf(1));
        // 중간 추가나, 삭제의 경우 빈자리를 채우기 위해서 다른 인덱스들이 이동한다.
        print(list1, list2);

        // list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제한다.
        System.out.println("list1.retainAll(list2):" + list1.retainAll(list2));
        print(list1, list2);

        // list2에서 list1에 포함된 객체들을 삭제한다.
        // ★ 낯선 코드
        for(int i= list2.size()-1; i >= 0; i--) {
            if(list1.contains(list2.get(i)))
                list2.remove(i);
        }
        print(list1, list2);
    } // main의 끝

    static void print(ArrayList list1, ArrayList list2) {
        System.out.println("list1:"+list1);
        System.out.println("list2:"+list2);
        System.out.println();
    }
}
