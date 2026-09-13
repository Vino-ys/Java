package 클래스수업부분;

class TV{
    // 멤버변수 = 속성
    String color;
    boolean power;
    int channel;

    void power(){
        power = !power;
    }
    void channelUp(){
        channel++;
    }
    void channelDown(){
        channel--;
    }
}

public class TvTest {
    public static void main(String[] args) {
       // 객체는 메인에서 만들기
       TV t = new TV();

       t.channel = 7;
       t.channelDown();

        System.out.print("현재 채널은 " + t.channel + "입니다.");
    }
}
