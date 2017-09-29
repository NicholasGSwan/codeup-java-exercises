package shapes;

abstract class Quadralateral extends Shape {
    //I know quadrilateral is spelled wrong, the exercises told me too :(
    protected double length;
    protected double width;


    public Quadralateral(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
    abstract void setLength(double length);
    abstract void setWidth(double width);
}
