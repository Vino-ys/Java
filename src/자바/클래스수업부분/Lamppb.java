package 자바.클래스수업부분;

class lamp {
    String color;
    boolean power;
    int brightness;

    void setColor(String colors) {
        color = colors;
    }
    void toggle() {
        power = !power;
    }
    double estimatEnergy(double hours) {
        return hours * brightness / 100;
    }
    void printStatus() {
        int hour = 5;
        System.out.println("색상: " + color + ", 전원: " + power + ", 밝기: " + brightness);
        System.out.println(hour + "시간 예상 소비량: " + estimatEnergy(hour));
    }
    void brighten() {
        brightness += 10;
    }
}

public class Lamppb {
    public static void main(String[] args) {
        lamp lam1 = new lamp();
        lam1.setColor("노란색");
        lam1.brighten();
        lam1.brighten();
        lam1.brighten();
        lam1.printStatus();
    }
}
