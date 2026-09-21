package 자바.매서드;

class Content {
    String title;

    void play() {

    }
}

class Music extends Content{
    String artist;

    void play() {
        System.out.println("음악 재생: " + title + " - " + artist);
    }
}

class Video extends Content{
    int runningTime;

    void play() {
        System.out.println("영상 재생: " + title + "(" + runningTime + "분)");
    }
}

public class 문제2 {
    public static void main(String[] args) {
        Music m1 = new Music();
        m1.title = "밤하늘";
        m1.artist = "루나";
        m1.play();

        Video v1 = new Video();
        v1.title = "자바 클래스";
        v1.runningTime = 15;
        v1.play();
    }
}
