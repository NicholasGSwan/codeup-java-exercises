package Vehicles;

abstract class Transportation {
    protected int number_of_wheels;
    protected int seats;
    protected String color;
    protected String typeOfVehicle;

    public Transportation(int numOfWheels, int seats, String color, String typeOfVehicle){
        number_of_wheels = numOfWheels;
        this.seats = seats;
        this.color = color;
        this.typeOfVehicle = typeOfVehicle;
    }
}
