package ch9;

public class test {

        public static void main(String[] args) {
            int[] array = {1, 2, 1, 1, 2, 3, 4, 1, 4, 2};
            int[] count = new int[5]; // 0번 인덱스는 사용하지 않음

            for (int num : array) {
                count[num]++;
            }

            for (int i = 1; i < count.length; i++) {
                System.out.println(i + "의 개수: " + count[i]);
            }
        }
    }
