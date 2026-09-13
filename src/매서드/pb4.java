package 매서드;

class ScoreDatas {
    int score;
}

public class pb4 {
    public static void addBonus(ScoreDatas data, int bonus) {
        data.score += bonus;
        if(data.score > 100) data.score = 100;
    }
    public static void main(String[] args) {
        ScoreDatas data = new ScoreDatas();
        data.score = 85;
        System.out.println("전: " + data.score);
        addBonus(data, 20);
        System.out.println("후: " + data.score);
    }
}
