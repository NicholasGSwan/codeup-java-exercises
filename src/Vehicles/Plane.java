package Vehicles;

public class Plane extends Transportation implements MotorVehicle, Diesel {
    public Plane(int wheels, int seats, String color){
        super(wheels, seats, color, "Plane");
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
