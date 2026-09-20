package 매서드;

class CircleCalculator {
    double radius;

    double getArea() {
        return radius * radius * 3.14;
    }
    static double toRadius(double diameter) {
        return diameter / 2;
    }
}

public class CircleCalculatorpb {
    public static void main(String[] args) {
        CircleCalculator cir1 = new CircleCalculator();
        cir1.radius = 5;
        System.out.printf("반지름 5의 넓이: %.1f \n", cir1.getArea());
        CircleCalculator cir2 = new CircleCalculator();
        System.out.println("지름 20의 반지름: " + CircleCalculator.toRadius(20));
    }

}
