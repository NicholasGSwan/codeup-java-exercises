package Vehicles;

public class Bus extends Transportation implements MotorVehicle, Diesel {
    public Bus(int wheels, int seats, String color){
        super(wheels, seats, color, "Bus");
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
