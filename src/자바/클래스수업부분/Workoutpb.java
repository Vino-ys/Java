package 자바.클래스수업부분;

class workout {
    String name;
    int sets;
    int minutesperset;

    int getTotalMinutes(){
        return sets * minutesperset;
    }
    void printSummary() {
        System.out.println(name + " 총 운동 시간: " + getTotalMinutes() + "분");
    }
}

public class Workoutpb {
    public static void main(String[] args) {
        workout pt1 = new workout();
        workout pt2 = new workout();
        pt1.name = "줄넘기";
        pt1.sets = 3;
        pt1.minutesperset = 5;

        pt2.name = "스쿼트";
        pt2.sets = 4;
        pt2.minutesperset = 3;

        pt1.printSummary();
        pt2.printSummary();
    }
}
