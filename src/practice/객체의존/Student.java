package practice.객체의존;

public class Student {
    int studentId;
    String studentName;

    Subject korean;
    Subject math;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;

        korean = new Subject(); // Subject Korean = new Subject(); 하면 안된다. 생성해둔 전역변수에 담아야함.
        // Subject Korean = new Subject(); 이렇게하면 생존주기가 생성자 안에서만임.
        math = new Subject();
    }

    public void setKorean(String subject, int score) {
        if(subject.equals("국어")) {
        korean.subject = subject;
        korean.score = score;
        }
    }
    public void setMath(String subject, int score) {
        if(subject.equals("수학")) {
        math.subject = subject;
        math.score = score;
        }
    }
}
