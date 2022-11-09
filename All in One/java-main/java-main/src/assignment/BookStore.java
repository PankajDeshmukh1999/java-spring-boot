package assignment;

public class BookStore {
    int id;
    String bookName;
    String bookAuthorName;
    float bookPublishedYear;
    float price;

    public BookStore(int id, String bookName, String bookAuthorName, float bookPublishedYear, float price) {
        this.id = id;
        this.bookName = bookName;
        this.bookAuthorName = bookAuthorName;
        this.bookPublishedYear = bookPublishedYear;
        this.price = price;

        System.out.println(id+" "+bookName+" "+bookAuthorName+" "+bookPublishedYear+" "+price);
    }

    public static void main(String[] args) {
        BookStore [] bookStores = new BookStore[5];
        BookStore bookStore1 = new BookStore(1,"Physics","John",2012,450);
        BookStore bookStore2 = new BookStore(2,"Chemistry","chris",2016,790);
        BookStore bookStore3 = new BookStore(3,"Maths","Daniel",2014,900);
        BookStore bookStore4 = new BookStore(4,"Biology","steven",2013,760);
        BookStore bookStore5 = new BookStore(5,"Botany","maxx",2011,820);


        bookStores[0] = bookStore1;
        bookStores[1] = bookStore2;
        bookStores[2] = bookStore3;
        bookStores[3] = bookStore4;
        bookStores[4] = bookStore5;

        for (BookStore b: bookStores) {
            System.out.println(b);
        }

    }

}

