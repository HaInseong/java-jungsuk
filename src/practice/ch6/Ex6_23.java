package practice.ch6;

public class Ex6_23 {

    public static int max(int[] data) {
        if(data == null || data.length == 0) {
            return -999999;
        }
        else {
            int max;
            max = data[0];
            for(int i=1; i<data.length; i++) {
                if(data[i]>max) {
                    max = data[i];
                    return max;
                }
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] data = {3, 2, 12, 4, 7};
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대값: " + max(data));
        System.out.println("최대값: " + max(null));
        System.out.println("최대값: " + max(new int[]{}));
    }
}
