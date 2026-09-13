package 매서드;

public class LocalVariableMain {
    static int calculateTotal(int price, int quantity) {
        int total = price * quantity;
        return total;
    }

    public static void main(String[] args) {
        int result = calculateTotal(3000, 4);
        System.out.println("결제 금액: " + result);
    }
}