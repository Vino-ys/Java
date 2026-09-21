package 자바.매서드;

class Calculator {
    public double calculate(int amount) {
        return amount;
    }
}

class DiscountCalculator extends Calculator {
    public double calculate(double amount) {
        return amount * 0.9;
    }
}

public class 문제5 {
    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();

        System.out.println(
                "계산 결과: " + calculator.calculate(10000.0)
        );
    }
}