package Vehicles;

public class Car extends Transportation implements MotorVehicle, Diesel {
    public Car(int numOfWheels, int seats, String color){
        super(numOfWheels, seats, color, "Car");
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
