package 자바.매서드;

class BookData {
    String title;
    int price;

    public static BookData copy(BookData original) {
        BookData book = new BookData();
        book.title = original.title;
        book.price = original.price;

        return book;
    }
}

public class BokkDatapb {
    public static void main(String[] args) {
        BookData book = new BookData();
        book.title = "기초 자바";
        book.price =  25000;

        BookData newbook = BookData.copy(book);
        newbook.price = 30000;

        System.out.println("원본: " + newbook.price);
        System.out.println("복사본: " + book.price);
    }
}
