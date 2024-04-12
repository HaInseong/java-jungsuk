package ch8;

import java.io.*;

// 작업을 시킨 메서드(main)에서 예외처리를 하는 것이 맞을지?
// 수행하는 메서드에서 예외처리를 하는 것이 맞을지?
// 내 판단으로 결정해야 한다.

public class Ex8_6_예외떠넘기기_실전2 {
    public static void main(String[] args) {
            File f = createFile("");
            System.out.println(f.getName()+" 파일이 성공적으로 생성되었습니다.");
    }

    static File createFile(String fileName) { // throws Exception 하지 않고 직접 try-catch 처리
        try {
            if (fileName==null || fileName.equals("")) {
                throw new Exception("파일 이름이 유효하지 않습니다.");
            }
        } catch (Exception e) { // ★ 위에 생성된 예외 객체를 catch에서 받는다.
            fileName = "제목없음.txt";
        } finally {
            System.out.println("finally블록은 예외가 발생하던, 하지 않던 무조건 수행된다.");
        }

        File f = new File(fileName);
        try {
            f.createNewFile(); // File객체의 createNewFile메서드를 이용해서 실제 파일을 생성한다.
        } catch (IOException e) {
            e.printStackTrace();
        }
        return f; // 생성된 객체의 참조를 반환한다.
    }
}
