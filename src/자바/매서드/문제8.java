package 자바.매서드;

class Storage {
    void save(String text) {
        System.out.println("저장: " + text);
    }
    void save(String text, boolean backup) {
        if(backup) {
            System.out.println("백업 저장: " + text);
        }
        else {
            save(text);
        }
    }
}

class CloudStorage extends Storage{
    void save(String text) {
        System.out.println("클라우드 저장: " + text);
    }
}

public class 문제8 {
    public static void main(String[] args) {
        Storage storage = new Storage();
        storage.save("일기");
        storage.save("일기", true);

        CloudStorage cloud = new CloudStorage();
        cloud.save("사진");
        cloud.save("사진", false);
    }
}
