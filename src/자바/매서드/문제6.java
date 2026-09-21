package 자바.매서드;

import java.io.File;

public class 문제6 {
    public static void main(String[] args) {
        FileResource f1 = new FileResource();
        f1.open();

        ImageFile i1 = new ImageFile();
        i1.open();
    }
}

class FileResource {
    public void open() {
        System.out.println("파일을 엽니다.");
    }
}

class ImageFile extends FileResource {
    @Override
    public void open() {
        System.out.println("이미지 파일을 엽니다.");
    }
}