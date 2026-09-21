package 자바.클래스수업부분;

import java.util.Scanner;

class Bus {
    int number;
    int passengers;

    void setNumber(int num) {
        number = num;
    }
    void ride(int count) {
        passengers += count;
    }
    int calculateFare(int adultcount, int studentCount) {
        return adultcount * 1500 + studentCount * 900;
    }
    void printStatus() {
        System.out.println("버스" + number + "번, 현재 승객: " + passengers);
    }
}

public class Buspb {
    public static void main(String[] args) {
        int adul = 0, stu = 0;
        Scanner scanner = new Scanner(System.in);
        Bus bus1 = new Bus();
        bus1.setNumber(scanner.nextInt());
        adul = scanner.nextInt();
        stu = scanner.nextInt();
        bus1.ride(adul + stu);
        bus1.printStatus();

        int total = bus1.calculateFare(adul, stu);
        System.out.println("이번 탑승 요금: " + total + "원");

    }
}
