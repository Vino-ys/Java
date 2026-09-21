package 자바.클래스수업부분;

class Seat {
    int seatNumber;
    boolean reserved = false;

    void setSeatNumber(int seatnum) {
        seatNumber = seatnum;
    }
    void reserve() {
        if (reserved) {
            System.out.println("이미 예약된 좌석입니다.");
        }
        else {
            reserved = !reserved;
        }
    }
    void cancel() {
        if (!reserved) {
            reserved = !reserved;
        }
    }
    int getTicketPrice() {
        if(seatNumber == 1) {
            return 15000;
        }
        else if(seatNumber == 2) {
            return 12000;
        }
        else if(seatNumber == 3) {
            return 10000;
        }
        return 100000000;
    }

    void printStatus() {
        System.out.println(seatNumber + "번 좌석 예약 여부: " + reserved + ", 가격: " + getTicketPrice() + "원");
    }
}

public class Seatpb {
    public static void main(String[] args) {
        Seat[] arr = new Seat[4];
        for(int i = 1; i < 4; i++) {
            arr[i] = new Seat();
            arr[i].setSeatNumber(i);
        }

        arr[2].reserve();
        arr[2].reserve();
        for(int i = 1; i < 4; i++) arr[i].printStatus();
    }
}
