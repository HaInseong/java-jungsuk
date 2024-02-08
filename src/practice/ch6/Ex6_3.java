package practice.ch6;

public class Ex6_3 {
    public static void main(String[] args) {

        Student s = new Student();

        System.out.println(s.name);
        System.out.println(s.ban);
        System.out.println(s.no);
        System.out.println(s.kor);
        System.out.println(s.eng);
        System.out.println(s.math);

    }
}

class Student {
    String name; //학생이름
    int ban; //반
    int no; //번호
    int kor; //국어점수
    int eng; ;//영어점수
    int math; //수학점수

    public Student() {}
    public Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public int getTotal(){
        return kor+eng+math;
    }

    public float getAverage(){
        return (float)(kor+eng+math)/3;
    }

    public String info() {
        return name+", "+ban+","+no+","+kor+","+eng+","+math+","+getTotal()+","+getAverage();
    }
}
