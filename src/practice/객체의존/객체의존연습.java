package practice.객체의존;

public class 객체의존연습 {
    public static void main(String[] args) {

        Student s1 = new Student(101, "하인성");
        Student s2 = new Student(102, "김정수");

        s1.setKorean("국어", 100);
        s2.setKorean("국어", 99);
        s1.setMath("수학", 100);
        s2.setMath("수학", 99);

        System.out.println(s1.studentId);
        System.out.println(s1.studentName);
        System.out.println(s2.studentId);
        System.out.println(s2.studentName);
        System.out.println();
        System.out.println(s1.korean.subject);
        System.out.println(s1.korean.score);
        System.out.println(s2.korean.subject);
        System.out.println(s2.korean.score);
        System.out.println();
        System.out.println(s1.math.subject);
        System.out.println(s1.math.score);
        System.out.println(s2.math.subject);
        System.out.println(s2.math.score);
    }
}
