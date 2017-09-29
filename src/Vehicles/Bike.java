package Vehicles;

public class Bike extends Transportation implements MotorVehicle, Diesel {
    public Bike(int wheels, int seats, String color){
        super(wheels, seats, color, "Bike");
    }

    @Override
    public boolean startEngine(boolean isThereGas) {
        return isThereGas;
    }

    @Override
    public boolean turnOffEngine() {
        return false;
    }
}
