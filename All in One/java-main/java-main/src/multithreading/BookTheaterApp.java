package multithreading;

public class BookTheaterApp {
    static int totalSeats = 30;

    synchronized void bookSeat(int seats) {
        if (totalSeats >= seats) {
            System.out.println(seats + " seat booked successfully");
            totalSeats = totalSeats - seats;
        } else {
            System.out.println(seats + " seat cannot be booked");
        }
        System.out.println("seat left:" + totalSeats);
    }
}

class MyTheater1 extends Thread {
    BookTheaterApp bookTheaterApp;
    int seats;

    MyTheater1(BookTheaterApp bookTheaterApp, int seats) {
        this.bookTheaterApp = bookTheaterApp;
        this.seats = seats;
    }

    @Override
    public void run() {
        bookTheaterApp.bookSeat(seats);
    }
}

class MyTheater2 extends Thread {
    BookTheaterApp bookTheaterApp;      //reference variable
    int seats;

    MyTheater2(BookTheaterApp bookTheaterApp, int seats) {
        this.bookTheaterApp = bookTheaterApp;
        this.seats = seats;
    }

    @Override
    public void run() {
        bookTheaterApp.bookSeat(seats);
    }
}

class MovieBook {
    public static void main(String[] args) {

        BookTheaterApp bookTheaterApp = new BookTheaterApp();

        MyTheater1 myTheater1 = new MyTheater1(bookTheaterApp, 16);
        myTheater1.start();

        MyTheater2 myTheater2 = new MyTheater2(bookTheaterApp, 5);
        myTheater2.start();

    }
}
