package 자바.매서드;

class DoorLock{
    void lock() {
        System.out.println("문이 잠겼습니다.");
    }
}

class AirConditioner{
    int temperature;
    void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("에어컨 온도: " + temperature + "도");
    }
}

class SmartHome {
    AirConditioner air;
    DoorLock door;

    SmartHome() {
        this.door = new DoorLock();
        this.air = new AirConditioner();
    }
}

class PremiumSmartHome extends SmartHome {
    void activateSecurityMode() {
        System.out.println("보안 모드가 실행되었습니다.");
    }
}

public class 문제3 {
    public static void main(String[] args) {
        PremiumSmartHome s1 = new PremiumSmartHome();
        s1.door.lock();
        s1.air.setTemperature(24);
        s1.activateSecurityMode();
    }
}
