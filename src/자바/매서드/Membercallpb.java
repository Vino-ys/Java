package 자바.매서드;

class MemberCall {
    String name;

    MemberCall(String name) {
        this.name = name;
    }

    void Hello() {
        System.out.println(name + "님, 자바 수업에 오신 것을 환영합니다!");
    }
}

public class Membercallpb {
    public static void main(String[] args) {
        MemberCall[] student = new MemberCall[10];
        student[0] = new MemberCall("민준");
        student[1] = new MemberCall("서연");
        student[2] = new MemberCall("도윤");
        student[0].Hello();
        student[1].Hello();
        student[2].Hello();
    }
}
