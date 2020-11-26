package EX2;

public class Main {
    public static void main(String[] args) {
        Taxi TX = new Taxi("EZTravel", 100, 1000, 10);
        //booking more seats;
        TX.bookSeats(20);

        System.out.println(TX.getSeats());
    }
}
