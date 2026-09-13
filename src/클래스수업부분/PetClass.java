package 클래스수업부분;

class Pet {
    String name;
    String type;
    int age;

    void printInfo(){
        System.out.println("이름: " + name + ", 종류: " + type + ", 나이 :" + age + "살, 성장단계: " + getAgeGroup());
    }
    String getAgeGroup(){
        if(age <= 1) {
            return "아기";
        }
        else if(age <= 7) {
            return "성체";
        }
        return "노령";
    }
}



public class PetClass {
    public static void main(String[] args) {
        Pet dog = new Pet();
        dog.name = "초코";
        dog.type = "강아지";
        dog.age = 3;

        Pet cat = new Pet();
        cat.name = "나비";
        cat.type = "고양이";
        cat.age = 9;

        dog.printInfo();
        cat.printInfo();
    }
}
