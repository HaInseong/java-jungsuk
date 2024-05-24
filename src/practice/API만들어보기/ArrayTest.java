package practice.API만들어보기;

public class ArrayTest {
    public static void main(String[] args) {
        IntArray arr = new IntArray();
        System.out.println(arr);
        System.out.println(arr.get(0));
        arr.add(11);
        System.out.println(arr.get(0));
        System.out.println(arr.size());
        arr.add(22);
        System.out.println(arr.get(1));
        System.out.println(arr.size());
        arr.add(33);
        for(int i=0; i<arr.size(); i++) {
            System.out.println("반복문으로 출력");
            System.out.println(arr.get(i));
        }
    }
}
