package 자바.매서드;

class Transport {
    String name;
    int baseFare;

    Transport(String name, int baseFare) {

        this.name = name;
        this.baseFare = baseFare;
    }
    int calculateFare(int distance) {
        return distance;
    }
}

class Bus extends Transport {
    Bus(String name, int baseFare) {
        super(name, baseFare); // 부모 생성자 호출
    }

    @Override
    int calculateFare(int distance) {
        return 1500 + distance * 100;
    }
}

class Taxi extends Transport {
    Taxi(String name, int baseFare) {
        super(name, baseFare); // 부모 생성자 호출
    }

    @Override
    int calculateFare(int distance) {
        return 4800 + distance * 800;
    }
}

class Subway extends Transport {
    Subway(String name, int baseFare) {
        super(name, baseFare); // 부모 생성자 호출
    }

    @Override
    int calculateFare(int distance) {
        if(distance >= 10) {
            return 1400 + (distance - 10) * 50;
        }
        return 1400;
    }
}

public class 문제10 {
    public static void main(String[] args) {
        Transport bus = new Bus("버스",10);
        Transport taxi = new Taxi("택시", 10);
        Transport subway = new Subway("지하철", 10);

        int distance = 10;

        System.out.println(bus.name + " " + distance + "km 요금: " + bus.calculateFare(distance) + "원");
        System.out.println(taxi.name + " " + distance + "km 요금: " + taxi.calculateFare(distance) + "원");
        System.out.println(subway.name + " " + distance + "km 요금: " + subway.calculateFare(distance) + "원");

    }
}
