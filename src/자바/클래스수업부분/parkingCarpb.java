package 자바.클래스수업부분;

class ParkingCar {
    String carNumber;
    int parkedMinutes;

    void set(String num, int min) {
        carNumber = num;
        parkedMinutes = min;
    }

    int calculateFee(int min) {
        int money = 2000;
        if (parkedMinutes > 30) {
            int extraMinutes = parkedMinutes - 30;
            money += ((extraMinutes + 9) / 10) * 50;
        }
        return money;
    }

    void printResult() {
        System.out.println("차량: " + carNumber + ", 주차: " + parkedMinutes + "분, 요금: " + calculateFee(parkedMinutes) + "원");
    }

}

public class parkingCarpb {
    public static void main(String[] args) {
        ParkingCar[] arr = new ParkingCar[2];

        for(int i = 0; i < 2; i++) {
            arr[i] = new ParkingCar();
        }

        arr[0].set("12가3456", 80);
        arr[1].set("34나7890", 35);

        for(int i = 0; i < 2; i++) {
            arr[i].printResult();
        }

    }
}
