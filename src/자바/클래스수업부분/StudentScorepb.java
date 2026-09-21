package 자바.클래스수업부분;

import java.util.Scanner;

class StudentScore {
    String name;
    int score;

    void setInfo(String namae, int jimsu) {
        name = namae;
        score = jimsu;
    }
    String getGrade() {
        if(score >= 90) return "A";
        else if(score >= 80) return "B";
        else if(score >= 70) return "C";
        return "D";
    }
    boolean isTarget() {
        if(score >= 90) return true;
        return false;
    }
    void printResult() {
        System.out.println(name + ", 점수: " + score + "등급: " + getGrade() + ", 장학 대상: " + isTarget());
    }
}

public class StudentScorepb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        StudentScore[] student = new StudentScore[n];

        for(int i = 0; i < n; i++) {
            student[i] = new StudentScore();
            student[i].setInfo(scanner.next(), scanner.nextInt());
        }
        student[0].printResult();
        student[1].printResult();
    }
}
