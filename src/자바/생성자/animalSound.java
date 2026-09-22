package 자바.생성자;

abstract class Animal {
    abstract void sound();
}
class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("멍멍");
    }
}

public class animalSound {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
//        Animal dog = new Animal(); 이게 안됌
        dog1.sound();
    }
}
