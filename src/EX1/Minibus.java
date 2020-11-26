package EX1;

public class Minibus {
    public int initialSeats;

    private GenericAPITransportDelegate gAPI;

    public Minibus(double fuel, double fuelCapacity, int seats) {
        gAPI = new GenericAPITransportDelegate(
                null,
                0,
                0,
                fuel,
                fuelCapacity,
                seats);
    }


    //custom class
/*    public int bookSeats(int bSeats){

    }*/

    public double getFuel(){
        return gAPI.getFuel();
    }

    public double getFuelCapacity(){
        return gAPI.getFuelCapacity();
    }

    public int getSeats(){
        return gAPI.getSeats();
    }

    public void setSeats(int seats){
        gAPI.setSeats(seats);
    }

    public void setFuelCapacity(double fuelCapacity){
        gAPI.setFuelCapacity(fuelCapacity);
    }

    public void setFuel(double fuel){
        gAPI.setFuel(fuel);
    }
}
