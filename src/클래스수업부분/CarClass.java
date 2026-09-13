package 클래스수업부분;

class Car {
    String model;
    String color;
    int speed;
    static int money = 5000;

    void startEngine(){speed += 1;}
    void brake() {speed = 0;}
    void boost() {speed += 20;}
}


public class CarClass {
    public static void main(String[] args) {
        Car[] carArr = new Car[3];

        for(int i = 0; i < carArr.length; i++) carArr[i] = new Car();
        carArr[0].model = "람보르기니";
        carArr[1].model = "벤츠";
        carArr[0].color = "빨강";
        carArr[1].color = "노랑";
        carArr[2].model = "모닝";
        carArr[2].color = "검정";
        System.out.println(carArr[1].money);
        carArr[2].money = 10000;

        carArr[0].startEngine();
        carArr[1].boost();

        System.out.println("0번인덱스" + carArr[0].money);
        System.out.println("1번인덱스" + carArr[1].money);
        System.out.println("2번인덱스" + carArr[2].money);

    }
}
