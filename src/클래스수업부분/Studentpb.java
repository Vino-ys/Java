package 클래스수업부분;

import java.util.Scanner;
class Student {
    String name;
    int age;
    double average;

    void setInfo(String namet, int aget, double averaget) {
        name = namet;
        age = aget;
        average = averaget;
    }
    String getAchievementLevel() {
        if(average >= 90) {
            return "우수";
        }
        else if(average >= 70) {
            return "보통";
        }
        return "노력 필요";
    }
    void printInfo() {
        System.out.println("학생: " + name + "나이: " + age + "세, 평균: " + average + ", 성취도: " + getAchievementLevel());
    }
}
public class Studentpb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student s1 = new Student();
        s1.setInfo(scanner.next(), scanner.nextInt(), scanner.nextDouble());
        s1.printInfo();
    }
}
