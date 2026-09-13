package 클래스수업부분;

import java.util.Scanner;

class Player {
    String nickname;
    int score;

    void setInfo(String name,int scores) {
        nickname = name;
        score = scores;
    }
    boolean hasHigherScore(int otherScore) {
        return score > otherScore;
    }
    String getRank() {
        if(score >= 900) return "S";
        else if(score >= 800) return "A";
        else if(score >= 700) return "B";
        else return "C";
    }
    void printInfo() {
        System.out.println("최고 점수 선수: " + nickname + ", 점수: " + score + ", 등급: " + getRank());
    }

}

public class Playerpb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Player[] arr = new Player[n];
        for(int i = 0; i < n; i++) {
            arr[i] = new Player();
            arr[i].setInfo(scanner.next(), scanner.nextInt());
        }

        Player topPlayer = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i].hasHigherScore(topPlayer.score)) {
                topPlayer = arr[i];
            }
        }
        topPlayer.printInfo();
    }
}
