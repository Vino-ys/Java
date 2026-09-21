package 자바.오버라이딩;

class Tv {
    boolean power;
    int channel;

    void power() {
        power = !power;
    }

    void channelUp() {
        ++channel;
    }

    void channelDown() {
        --channel;
    }
}
//상속받은 TV 와우와우ㅏㅗ아우ㅏ와우ㅏ
class CaptionTV extends Tv{

}

public class 상속알아보기 {
}
