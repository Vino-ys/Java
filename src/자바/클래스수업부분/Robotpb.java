package 자바.클래스수업부분;

class Robot {
    String name;
    int battery;

    void setInfo(String sName,int sBattery ) {
        name = sName;
        battery = sBattery;
    }

    void performTask(String taskName, int requiredBattery) {
        if((battery - requiredBattery ) < 0) System.out.println(taskName + " 실패");
        else {
            battery -= requiredBattery;
            System.out.println(taskName + " 성공");
        }
    }
    void charge(int amount) {
        if((battery + amount) > 100) {
            battery = 100;
        }
        else {
            battery += amount;
        }
    }
    String getBatteryLevel() {
        if(battery >= 60) return "충분";
        else if(battery >= 20) return "주의";
        else return "충전 필요";
    }
    void printBattery() {
        System.out.println(name + " 배터리: " + battery + ", 상태: " + getBatteryLevel());
    }
}

public class Robotpb {
    public static void main(String[] args) {
        Robot rob1 = new Robot();
        Robot rob2 = new Robot();

        rob1.setInfo("청소봇", 100);
        rob2.setInfo("안내봇", 100);

        rob1.performTask("바닥 청소", 35);
        rob1.performTask("물걸레 청소", 30);

        rob1.printBattery();
        rob2.printBattery();
    }
}
