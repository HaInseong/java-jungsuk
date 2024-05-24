package practice.API만들어보기;

// 배열 API 만들어보기

public class IntArray {
    private int count;
    private int[] arr;
    public IntArray() {
        this(10);
    }
    public IntArray(int init) {
        arr = new int[init];
    }
    public void add(int data) {
        arr[count++] = data;
    }
    public int get(int index) {
        return arr[index];
    }
    public int size() {
        return count;
    }
}
