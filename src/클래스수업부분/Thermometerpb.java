package 클래스수업부분;

class thermometer{
    double temperature;

    void setTemperature(double temp) {
        temperature = temp;
    }
    void increase() {
        temperature += 1;
    }
    Double toFahrenheit() {
        return temperature * 9 / 5 + 32;
    }
    boolean isFreezing() {
        if(temperature <= 0) {
            return true;
        }
        return false;
    }
    void printTemperature() {
        System.out.println("섭씨: " + temperature + "도, 화씨: " + toFahrenheit() + "도, 결빙: " + isFreezing());
    }
}

public class Thermometerpb {
    public static void main(String[] args) {
        thermometer temp1 = new thermometer();
        temp1.temperature = 20;
        temp1.increase();
        temp1.increase();
        temp1.printTemperature();
    }
}
