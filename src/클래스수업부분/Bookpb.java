package 클래스수업부분;

class Book{
    String title;
    String author;
    boolean borrowed;

    void setInfo(String bookTitle, String bookAuthor) {
        title = bookTitle;
        author = bookAuthor;
    }
    void borrow() {
        if (borrowed) {
            System.out.println("이미 대출 중인 책입니다.");
        }
        borrowed = true;
    }
    void returnBook() {
        borrowed = false;
    }
    void printStatus() {
        String bor = "대출 가능";
        if (borrowed) {
            bor = "대출 중";
        }
        System.out.println(title + " - " + bor);
    }
    int calculateLateFee(int overdueDays) {
        int money = 0;
        if (overdueDays <= 3) {
            money += overdueDays * 500;
        }
        else {
            money += 1500;
            overdueDays -= 3;
            money += overdueDays * 1000;
        }
        return money;
    }

}

public class Bookpb {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setInfo("어린왕자", "생텍쥐페리");
        book1.borrow();
        book1.borrow();
        book1.printStatus();
        int money = book1.calculateLateFee(5);
        System.out.println("5일 연체료: " + money + "원");
        book1.returnBook();
        book1.printStatus();
    }
}
