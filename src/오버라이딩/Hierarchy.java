package 오버라이딩;

class Parent{
    int age;
    void play() {
        System.out.println("놀자~?");
    }
}

class Child extends Parent{
    void play() {
        System.out.println("놀자~");
    }
}

public class Hierarchy {
    public static void main(String[] args) {
        Child c = new Child();
        c.age = 20;
        System.out.println(c.age);
        c.play();

        Parent p = new Parent();
        p.play();
    }
}
