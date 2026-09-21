package 자바.클래스수업부분;

import java.util.Scanner;

class Product {
    String name;
    int price;
    int stock;

    String canSell() {
        if(stock > 0) return "판매 가능";
        return "품절";
    }
    void printInfo() {
        System.out.println(name + ", " + price + "원, 재고: " + stock + ", " + canSell());
    }
}

public class Productpb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product[] arr = new Product[3];
        arr[0] = new Product();
        arr[1] = new Product();
        arr[2] = new Product();
        arr[0].name = "공책";
        arr[1].name = "볼펜";
        arr[2].name = "지우개";
        arr[0].price = 2000;
        arr[1].price = 1000;
        arr[2].price = 500;
        arr[0].stock = 10;
        arr[1].stock = 3;
        arr[2].stock = 0;

        for(int i = 0; i < 3; i ++) arr[i].printInfo();

    }
}
