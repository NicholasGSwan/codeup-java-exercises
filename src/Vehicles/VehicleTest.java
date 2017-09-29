package Vehicles;

public class VehicleTest {
    public static void main(String[] args){
        Transportation myCar = new Car(4, 5, "dark grey");
        Transportation cityBus = new Bus(4, 20, "white");
        Transportation jumboJet = new Plane (14, 454, "grey" );
        Transportation huffy = new Bike(2, 1, "rocket red");
        Transportation[] vehicles = {myCar, cityBus, jumboJet, huffy};
        for(Transportation vehicle: vehicles){
            showVehicleInfo(vehicle);
        }

    }
    public static void showVehicleInfo(Transportation vehicle){
        if(vehicle.typeOfVehicle.equals("Bike")){
            System.out.println("Whoa, is that a Huffy? Can we take it over some sweet jumps!?!?");
        }
        System.out.println("This " + vehicle.typeOfVehicle+ " has " + vehicle.number_of_wheels + " wheels, "+vehicle.seats+" seats, and is "+ vehicle.color+".");
    }
}
