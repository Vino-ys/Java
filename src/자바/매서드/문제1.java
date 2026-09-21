package 자바.매서드;

class Member {
    String name;
    String email;

    void login() {
        System.out.println(name + " 로그인");
    }
}

class StudentMember extends Member{
    int grade;

    void printInfo() {
        System.out.println("학생: " + name + ", " + grade + "학년");
    }
}

class TeacherMember extends Member{
    String subject;

    void printInfo() {
        System.out.println("교사: " + name + ", 과목: " + subject);
    }
}

public class 문제1 {
    public static void main(String[] args) {
        StudentMember m1 = new StudentMember();
        m1.name = "민준";
        m1.grade = 2;
        m1.login();
        m1.printInfo();

        TeacherMember t1 = new TeacherMember();
        t1.name = "김선생";
        t1.subject = "자바";
        t1.login();
        t1.printInfo();
    }
}
