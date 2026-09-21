package 자바.매서드;

class ScoreData {
    int score;
}

public class PrimitiveParameterMain {
    static void addBonus(int score) {
        score += 20;
        System.out.println("addBonus() 안의 score: " + score);
    }

    public static void main(String[] args) {
        ScoreData data = new ScoreData();
        data.score = 70;

        addBonus(data.score);
        System.out.println("main()의 data.score: " + data.score);
    }
}