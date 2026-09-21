package 자바.매서드;

class Room {
    int roomNumber;
    int price;

    Room(int roomNumber, int price) {
        this.roomNumber = roomNumber;
        this.price = price;
    }
}

class SuiteRoom extends Room {
    int livingRooms;

    SuiteRoom(int roomNumber, int price, int livingRooms) {
        super(roomNumber, price);
        this.livingRooms = livingRooms;
    }
    void PrintInfo() {
        System.out.println(roomNumber + "호, 가격: " + price + "원, 거실: " + livingRooms + "개");
    }
}

public class 문제4 {
    public static void main(String[] args) {
        SuiteRoom r1 = new SuiteRoom(701, 350000, 2);

        r1.PrintInfo();
    }
}
