package 자바.매서드;

import org.w3c.dom.ls.LSOutput;

class Product {
    int price;

    int getPrice() {
        return price;
    }

    Product(int price) {
        this.price = price;
    }
}

class DiscountProduct extends Product{
    int discountRate;

    @Override
    int getPrice() {
        return super.getPrice() * (100 - discountRate) / 100;
    }
    DiscountProduct(int price, int discountRate) {
        super(price);
        this.discountRate = discountRate;
    }
}

public class 문제7 {
    public static void main(String[] args) {
        DiscountProduct p1 = new DiscountProduct(50000, 20);
        System.out.println("원가: " + p1.price + "원");
        System.out.println("할인가: " + p1.getPrice() + "원");
    }
}
