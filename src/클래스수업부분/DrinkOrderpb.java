package 클래스수업부분;

import java.util.Scanner;

class DrinkOrder {
    String menuName;
    int price;
    int quantity;

    void setOrder(String menu, int prices, int quan) {
        menuName = menu;
        price = prices;
        quantity = quan;
    }
    double getAmount() {
        if((price * quantity) >= 10000) {
            return getDiscountedAmount();
        }
        return price * quantity;
    }
    double getDiscountedAmount() {
        return  price * quantity * 0.9;
    }
    void printOrder() {
        System.out.println(menuName + " " + quantity + "잔: " + (int)(price * quantity) + "원");
        if((price * quantity) >= 10000) {
            System.out.println(menuName + " 할인 적용 금액: " + (int)(price * quantity * 0.9 )+ "원");
        }
    }
}

public class DrinkOrderpb {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        DrinkOrder[] arr = new DrinkOrder[5];
        for(int i = 0; i < 3; i ++) {
            arr[i] = new DrinkOrder();
            arr[i].menuName = scanner.next();
            arr[i].price = scanner.nextInt();
            arr[i].quantity = scanner.nextInt();
        }

        for(int i = 0; i < 3; i++) {
            arr[i].printOrder();
            sum += (int)(arr[i].getAmount());
        }
        System.out.println("총 결제 금액: " + sum + "원");

    }
}
