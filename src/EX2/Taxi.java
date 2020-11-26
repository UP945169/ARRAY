package EX2;

public class Taxi {
    GenericAPITransportDelegate gAPI;
    public Taxi(String Organisation, double fuel, double fuelCapacity, int seats) {
        gAPI = new GenericAPITransportDelegate(Organisation,
                0,
                0,
                fuel,
                fuelCapacity,
                seats);

    }

    public void bookSeats(int newSeats){
        int totalSeats = newSeats + gAPI.getSeats();
        gAPI.setSeats(totalSeats);
    }


    public int getSeats(){
        return gAPI.getSeats();
    }

}
